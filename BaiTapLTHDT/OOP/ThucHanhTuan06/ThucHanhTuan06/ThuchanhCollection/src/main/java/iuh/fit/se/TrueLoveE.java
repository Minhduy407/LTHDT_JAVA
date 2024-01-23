package iuh.fit.se;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrueLoveE {
	public static void main(String[] args) {
		Set<KhachHang> dskh = new TreeSet<>(Comparator.comparing(KhachHang::getDoanhSo));
		dskh.addAll(new HashSet<>(
				List.of(
				new KhachHang(100l, "Lê Lan", 1000000.0),
				new KhachHang(200l, "Lê Lan", 2000000.0),
				new KhachHang(300l, "Lê Lan", 100000.0),
				new KhachHang(400l, "Lê Lan", 1500000.0),
				new KhachHang(500l, "Lê Lan", 3000000.0)
			)));
		
		dskh.forEach(kh -> System.out.println(kh));
	}
}
