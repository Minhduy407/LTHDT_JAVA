package iuh.fit.se;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TrueLoveD {
	public static void main(String[] args) {
		List<NhanVien> dsnv = List.of(
				new NhanVien("NV01", "Lê", "LAN", 1990),
				new NhanVien("NV02", "Nguyễn", "Nga", 1995),
				new NhanVien("NV03", "Trần", "Bình", 1992),
				new NhanVien("NV06", "Trần", "BÌNH", 1992),
				new NhanVien("NV04", "Hồ", "Hùng", 1991),
				new NhanVien("NV05", "Lê Thùy", "Lan", 1990)
			);
		
		Queue<NhanVien> dsdk = new LinkedList<>();
		dsdk.add(dsnv.get(1));
		dsdk.add(dsnv.get(3));
		
		while(dsdk.size() > 0) {
			System.out.println("Đi du lịch: " + dsdk.poll());
		}
	}
}
