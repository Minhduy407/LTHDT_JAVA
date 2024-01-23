package iuh.fit.se;

import java.util.List;
import java.util.Random;

public class TrueLoveA {
	
	private static final Random rd = new Random();

	public static void main(String[] args) {
		
		List<NhanVien> dsnv = List.of(
					new NhanVien("NV01", "Lê", "LAN", 1990),
					new NhanVien("NV02", "Nguyễn", "Nga", 1995),
					new NhanVien("NV03", "Trần", "Bình", 1992),
					new NhanVien("NV04", "Hồ", "Hùng", 1991),
					new NhanVien("NV05", "Lê Thùy", "Lan", 1990)
				);
		
		int i = rd.nextInt(dsnv.size()); // i: 0 -> size - 1
//		System.out.println(i);
		NhanVien nv = dsnv.get(i);
		System.out.println(nv);
	}
}
