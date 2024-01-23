package danhsach;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entity.NVBanThoiGian;
import entity.NVVanPhong;
import entity.NhanVien;

public class DanhSachNhanVien {
	private List<NhanVien> dsnv;
	
	public DanhSachNhanVien() {
		dsnv = new ArrayList<>();
	}
	
	public List<NhanVien> getDsnv() {
		return dsnv;
	}
	
	public boolean themNhanVien(NhanVien nv) {
		if(nv == null)
			return false;
		
		if(dsnv.contains(nv))
			return false;
		
		return dsnv.add(nv);
	}
	
	public boolean capNhatSoGio(String maSo, int soGioMoi) {
		NhanVien temp = dsnv.stream()
		.filter(nv -> nv instanceof NVBanThoiGian)
		.filter(nv -> nv.getMaSo().equalsIgnoreCase(maSo))
		.findFirst()
		.orElse(null);
		
		if(temp == null)
			return false;
		
		((NVBanThoiGian)dsnv.get(dsnv.indexOf(temp))).setSoGio(soGioMoi);
		
		return true;
	}
	
	public Map<String, Double> getTongLuongTheoLoaiNV() {
		return dsnv.stream()				
				.collect(Collectors.groupingBy(
							nv -> nv.getClass().getSimpleName(), Collectors.summingDouble(NhanVien::getTienLuong)
						));
	}
	
	public List<NhanVien> getDSNVVanPhong(String chucVu) {
		return dsnv.stream()
				.filter(nv -> nv instanceof NVVanPhong)
				.filter(nv -> ((NVVanPhong)nv).getChucVu().equalsIgnoreCase(chucVu))
				.sorted(Comparator.comparing(NhanVien::getTienLuong))
				.collect(Collectors.toList());
	}
	
	public Map<String, Long> getSoNVTheoChucVu(){
		return dsnv.stream()
				.filter(nv -> nv instanceof NVVanPhong)
				.map(nv -> ((NVVanPhong)nv).getChucVu())
				.collect(Collectors.groupingBy(x -> x.toUpperCase(), Collectors.counting()));
	}
	
}
