package iuh.fit.se;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ThuVien {
	private Sach[] dsSach;
	private int n = 0;
	
	public ThuVien() {
		this(10);
	}

	public ThuVien(int soPhanTu) {
		if(soPhanTu <= 0)
			throw new IllegalArgumentException("Số phần tử mảng > 0");
		
		dsSach = new Sach[soPhanTu];
	}
	
	public void themSach(Sach s) {
		Sach temp = timSach(s.getMaSach());
		
		if(temp != null)
			throw new IllegalArgumentException("Trùng mã sách");
		
		if(n == dsSach.length)
//			throw new IllegalArgumentException("Mảng đầy");
			tangKichThuocMang();
		
		dsSach[n++] = s;
	}
	
	private void tangKichThuocMang() {
		int newLength = dsSach.length * 2;
		dsSach = Arrays.copyOf(dsSach, newLength);
	}

	public Sach timSach(String maSach) {
		return Arrays.stream(dsSach, 0, n)
		.filter(s -> s.getMaSach().equalsIgnoreCase(maSach))
		.findFirst()
		.orElse(null);
	}
	
	public Sach[] getDSSach() {
		return Arrays.copyOf(dsSach, n);
	}
	
	public Map<String, Double> getTongThanhTien() {
		return Arrays.stream(dsSach, 0, n)
				.collect(Collectors.groupingBy(x -> x.getClass().getSimpleName(), Collectors.summingDouble(Sach::getThanhtien)));
	}
	
	public double getTongTienSachGiaoKhoa() {
		return Arrays.stream(dsSach, 0, n)
				.filter(s -> s instanceof SachGiaoKhoa)
				.collect(Collectors.summingDouble(Sach::getThanhtien));
	}
	
	public double getTongTienSachThamKhao() {
		return Arrays.stream(dsSach, 0, n)
				.filter(s -> s instanceof SachThamKhao)
				.collect(Collectors.summingDouble(Sach::getThanhtien));
	}

	public Sach[] getDSSachGiaoKhoa(String nhaXuatBan) {
		return Arrays.stream(dsSach, 0, n)
				.filter(s -> s instanceof SachGiaoKhoa)
				.filter(s -> s.getNhaXuatBan().equalsIgnoreCase(nhaXuatBan))
				.toArray(x -> new Sach[x]);
	}
	
	public double getTBGiaSachThamKhao() {
		return Arrays.stream(dsSach, 0, n)
				.filter(s -> s instanceof SachThamKhao)
				.collect(Collectors.averagingDouble(Sach::getDonGia));
	}
}
