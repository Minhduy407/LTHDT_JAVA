package iuh.fit.se;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThuVien {
	private List<Sach> dsSach;
	
	public ThuVien() {
		dsSach = new ArrayList<Sach>();
	}
		
	public void themSach(Sach s) {
		if(dsSach.contains(s))
			throw new IllegalArgumentException("Trùng mã sách");
		
		dsSach.add(s);
	}
	
	public Sach timSach(String maSach) {
		return dsSach.stream()
		.filter(s -> s.getMaSach().equalsIgnoreCase(maSach))
		.findFirst()
		.orElse(null);
	}
	
	public List<Sach> getDSSach() {
		return dsSach;
	}
	
	public Map<String, Double> getTongThanhTien() {
		return dsSach.stream()
				.collect(Collectors.groupingBy(x -> x.getClass().getSimpleName(), Collectors.summingDouble(Sach::getThanhtien)));
	}
	
	public double getTongTienSachGiaoKhoa() {
		return dsSach.stream()
				.filter(s -> s instanceof SachGiaoKhoa)
				.collect(Collectors.summingDouble(Sach::getThanhtien));
	}
	
	public double getTongTienSachThamKhao() {
		return dsSach.stream()
				.filter(s -> s instanceof SachThamKhao)
				.collect(Collectors.summingDouble(Sach::getThanhtien));
	}

	public List<Sach> getDSSachGiaoKhoa(String nhaXuatBan) {
		return dsSach.stream()
				.filter(s -> s instanceof SachGiaoKhoa)
				.filter(s -> s.getNhaXuatBan().equalsIgnoreCase(nhaXuatBan))
				.collect(Collectors.toCollection(ArrayList::new));
	}
	
	public double getTBGiaSachThamKhao() {
		return dsSach.stream()
				.filter(s -> s instanceof SachThamKhao)
				.collect(Collectors.averagingDouble(Sach::getDonGia));
	}
}
