package iuh.fit.se;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichDriver {
	public static void main(String[] args) {
		DanhsachGiaodich ds = new DanhsachGiaodich();
		ds.themGiaoDich(new GiaoDichTienTe("GDT1", LocalDate.now(), 2000000000.0, 1));
		ds.themGiaoDich(new GiaoDichTienTe("GDT2", LocalDate.now(), 2000.0, 1, 24430.0, LoaiTien.USD));
		ds.themGiaoDich(new GiaoDichVang("GDT3", LocalDate.now(), 6900000.0, 10, "SJC"));
		ds.themGiaoDich(new GiaoDichVang("GDT4", LocalDate.now(), 5700000.0, 1, "9999"));
		ds.themGiaoDich(new GiaoDichVang("GDT5", LocalDate.now(), 4700000.0, 1, "24K"));
	
		ds.getDSGD().stream().forEach(x -> System.out.println(x));
		System.out.println("==");
		ds.getDSGDTheoDonGia(5000000.0).stream().forEach(x -> System.out.println(x));
		System.out.println("==");
		ds.getTongSoLuong()
		.entrySet()
		.forEach(entry -> {
			System.out.println("Loai giao dịch: " + entry.getKey());
			System.out.println("Tổng số lượng: " + entry.getValue());
		});
		System.out.println("===");
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
	}
}
