package iuh.fit.se;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TrueLoveC {
	public static void main(String[] args) {
		List<NhanVien> dsnv = List.of(
				new NhanVien("NV01", "Lê", "LAN", 1990),
				new NhanVien("NV02", "Nguyễn", "Nga", 1995),
				new NhanVien("NV03", "Trần", "Bình", 1992),
//				new NhanVien("NV06", "Trần", "BÌNH", 1992),
				new NhanVien("NV07", "Trần", "BÌNH", 1992),
				new NhanVien("NV04", "Hồ", "Hùng", 1991),
				new NhanVien("NV05", "Lê Thùy", "Lan", 1990)
			);
		
		Map<String, Long> thongKe = dsnv.stream()
				.collect(Collectors.groupingBy(nv -> nv.getTenNV().toUpperCase(), Collectors.counting()));
		
		System.out.println(thongKe);
		
		long max = thongKe.entrySet()
				.stream()
				.mapToLong(et -> et.getValue()) //[3, 2, 1, 1]
				.max()
				.getAsLong();
		System.out.println("Số lần xuất hiện lớn nhất: " + max);
		
		Set<String> dsTen = thongKe.entrySet()
				.stream()
				.filter(et -> et.getValue() == max)
				.map(et -> et.getKey())
				.collect(Collectors.toSet());
		
		System.out.println(dsTen);
	}
}
