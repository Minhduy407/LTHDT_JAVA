package ktpm18a.test;

import java.text.DecimalFormat;
import java.util.Scanner;

import ktpm18a.duy.*;
import ktpm18a.main.*;

public class MainTest {
	public static void main(String[] args) {
		QuanLyKhachHang list = new QuanLyKhachHang();
		KhachHang kh1 = new KhachHang("123","A","TPHCM",300000.0);
		KhachHang kh2 = new KhachHang("122","C","TPHN",600000.0);
		KhachHang kh3 = new KhachHang("121","B","TPHCM",300000.0);
		
		list.themkhach(kh1);
		list.themkhach(kh2);
		list.themkhach(kh3);
		
		try (Scanner sc = new Scanner(System.in)) {
			int chon;
			do {
				System.out.println("\t\t====MENU====");
				System.out.println("1. Thêm một khách hàng mới vào hàng đợi mua vé");
				System.out.println("2. Bán một vé cho khách hàng. Chỉ bán cho người đăng ký trước");
				System.out.println("3. Hiển thị danh sách khách hàng");
				System.out.println("4. Hủy một khách hàng ra khỏi danh sách. (khách hàng không mua vé nữa)");
				System.out.println("5. Thống kê tình hình bán vé");
				System.out.println("6. Lưu danh sách vào file");
				System.out.println("7. Hiển thị danh sách các ga đang chờ mua vé");
				System.out.println("8. Hiển thị danh sách các ga đang chờ mua vé và số vé tương ứng cho ga");
				System.out.println("0. Thoát chương trình");
				System.out.println("Chọn: ");
				chon = sc.nextInt();
				sc.nextLine();
				switch(chon) {
					case 1:{
						System.out.println("Nhập thông tin Khách hàng mua vé:");
						System.out.println("Nhập vào CMND: ");
						String cmnd = sc.nextLine();
						System.out.println("Nhập vào tên KH: ");
						String ten = sc.nextLine();
						System.out.println("Nhập ga đến: ");
						String ga = sc.nextLine();
						System.out.println("Nhập giá: ");
						double tien = sc.nextDouble();
						KhachHang x = new KhachHang(cmnd,ten,ga,tien);
						list.themkhach(x);
						break;
					}
					case 2:{
						System.out.println("Bán vé cho khách hàng có thông tin: ");
						KhachHang x = list.banve();
						System.out.println(x);
						break;
					}
					case 3:{
						System.out.println("\n\t\t====DANH SÁCH KHÁCH HÀNG ĐỢI MUA VÉ====");
						list.getKhs()
						.forEach(x -> System.out.println(x));
						System.out.println("\n\t\t====DANH SÁCH KHÁCH HÀNG ĐÃ MUA VÉ====");
						list.getDsve()
						.forEach(x -> System.out.println(x));
						break;
					}
					case 4:{
						System.out.println("Nhập vào số cmnd của khách hàng cần xóa: ");
						String ma = sc.nextLine();
						boolean kq = list.xoakh(ma);
						if(kq) {
							System.out.println("Đã xóa thành công!\n");
							break;
						}
						System.out.println("Không có khách hàng cần xóa trong danh sách!\n");
						break;
					}
					case 5:{
						DecimalFormat df = new DecimalFormat("#,##0.0 VNĐ");
						System.out.println("\n\t\t====THỐNG KÊ TÌNH HÌNH BÁN VÉ====");
						System.out.println("Số vé đang chờ bán: " +  list.tongveKHcho());
						System.out.println("Số vé đã bán: " +  list.tongveKHdamua());
						System.out.println("Tổng tiền đã thu về: " +  df.format(list.tongtienbanve()));
						break;
					}
					case 6:{
						list.luufile();
						break;
					}
					case 7:{
						System.out.println("\n\t\t----Danh sách các ga chờ mua vé----\n");
						list.dsga()
						.forEach(System.out::println);
						break;
					}
					case 8:{
						System.out.println("\t\t----Các ga và số vé tương ứng----");
						list.showdsga()
						.entrySet()
						.forEach(entry -> {
							System.out.println("Ga: " + entry.getKey());
							System.out.println("Số vé của ga: " + entry.getValue() + "\n");
						});
						break;
					}
				}
			}while(chon != 0);
		}
		System.out.println("\n\t\t====KẾT THÚC CHƯƠNG TRÌNH====");
		return;
	}
}
