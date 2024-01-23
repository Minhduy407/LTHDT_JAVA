package onepiece.chopper.iuh;

public class MainHCN {
//	Viết lớp chứa hàm main: Tạo 3 đối tượng từ lớp HinhChuNhat, in thông tin ra màn hình
public static void main(String[] args) {
    HinhChuNhat hinhchunhat1 = new HinhChuNhat();
    hinhchunhat1.setchieuDai(10);
    hinhchunhat1.setchieuRong(5);
    System.out.println("Hinh chu nhat 1 : " + hinhchunhat1.toString() + "\n");
    HinhChuNhat hinhchunhat2 = new HinhChuNhat();
    hinhchunhat1.setchieuDai(9);
    hinhchunhat1.setchieuRong(5);
    System.out.println("Hinh chu nhat 2 : " + hinhchunhat2.toString() + "\n");
    HinhChuNhat hinhchunhat3 = new HinhChuNhat();
    hinhchunhat1.setchieuDai(13);
    hinhchunhat1.setchieuRong(18);
    System.out.println("Hinh chu nhat 3 : " + hinhchunhat3.toString() + "\n");
}
}
