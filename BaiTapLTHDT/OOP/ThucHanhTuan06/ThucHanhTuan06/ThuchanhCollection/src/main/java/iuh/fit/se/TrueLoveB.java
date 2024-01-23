package iuh.fit.se;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TrueLoveB {
	
	public static void main(String[] args) {
		
		List<NhanVien> dsnv = List.of(
					new NhanVien("NV01", "Lê", "LAN", 1990),
					new NhanVien("NV02", "Nguyễn", "Nga", 1995),
					new NhanVien("NV06", "Nguyễn", "NGA", 1995),
					new NhanVien("NV03", "Trần", "Bình", 1992),
					new NhanVien("NV04", "Hồ", "Hùng", 1991),
					new NhanVien("NV05", "Lê Thùy", "Lan", 1990)
				);
		
		Set<String> dsTen = dsnv.stream()
				.map(nv -> nv.getTenNV().toUpperCase())
//				.map(nv -> {
//					String ten = nv.getTenNV();
//					return ten.length() > 0 ? 
//							Character.toUpperCase(ten.charAt(0)) + ten.substring(1).toLowerCase() : null;
//				})
				.collect(Collectors.toSet());
		
		System.out.println(dsTen);
	}
}
