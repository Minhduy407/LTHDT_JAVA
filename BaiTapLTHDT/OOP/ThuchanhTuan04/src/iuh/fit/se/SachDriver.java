package iuh.fit.se;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SachDriver {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		ThuVien ds = new ThuVien();
		
		ds.themSach(new SachGiaoKhoa("Tiếng việt lớp 1", LocalDate.now(), 15000.0, 100, "Kim ", TinhTrang.MỚI));
		ds.themSach(new SachGiaoKhoa("Tiếng việt lớp 2", LocalDate.now(), 25000.0, 100, "Kim Đồng", TinhTrang.CŨ));
		ds.themSach(new SachThamKhao("Luyện viết Chữ hoa lớp 1", LocalDate.now(), 15000.0, 100, "Kim Đồng"));
		ds.themSach(new SachThamKhao("Luyện viết Chữ hoa lớp 2", LocalDate.now(), 25000.0, 100, "Kim Đồng"));
//		ds.themSach(nhapSach());
		
		Arrays.stream(ds.getDSSach()).forEach(x -> System.out.println(x));
		
//		ds.getTongThanhTien()
//		.entrySet()
//		.forEach(entry -> {
//			System.out.println("Loại sách: " + entry.getKey());
//			System.out.println("Tổng thành tiền: " + df.format(entry.getValue()));
//		});
//		
		
//		Arrays.stream(ds.getDSSachGiaoKhoa("Kim Đồng")).forEach(x -> System.out.println(x));
//		
		System.out.println("Trung bình đơn giá của các cuốn sách tham khảo: " + df.format(ds.getTBGiaSachThamKhao()));
		
	}

	private static Sach nhapSach() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/yyyy");
		
		System.out.println("Nhập mã sách: ");
		String maSach = sc.nextLine();
		System.out.println("Nhập ngày nhập (d/M/yyyy)");
		String ngayString = sc.nextLine();
		LocalDate ngayNhap = LocalDate.parse(ngayString, df);
		System.out.println("Nhập đơn giá: ");
		double donGia = sc.nextDouble();
		System.out.println("Nhập số lượng: ");
		int soLuong = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập nhà xuất bản: ");
		String nhaXuatBan = sc.nextLine();
		System.out.println("Là sách giáo khoa ? true or false");
		boolean chon = sc.nextBoolean();
		
		if(chon) {
			TinhTrang tinhTrang = TinhTrang.CŨ;
			System.out.println("Nhập tình trạng sách: 1. Mới, 2. Cũ");
			int tt = sc.nextInt();
			if(tt == 1)
				tinhTrang = TinhTrang.MỚI;
			
			return new SachGiaoKhoa(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, tinhTrang);
		}
		
		return new SachThamKhao(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
	}
}
