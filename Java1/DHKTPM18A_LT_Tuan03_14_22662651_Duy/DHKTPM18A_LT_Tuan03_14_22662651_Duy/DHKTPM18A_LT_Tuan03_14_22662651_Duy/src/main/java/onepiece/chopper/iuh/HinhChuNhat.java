package onepiece.chopper.iuh;
/*
  @#HinhChuNhat.java
  @version: 1.0
  @date: 19/05/2021
  @auther: Huynh Le Minh Duy
 */
public class HinhChuNhat {
    private static int chieuDai;
    private static int chieuRong;

    public void setchieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }
    public void setchieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    public static int getchieuDai(int chieuDai){
        return chieuDai;
    }
    public static int getchieuRong(int chieuRong){
        return chieuRong;
    }
    public static int getChuVi(){
        return (chieuDai + chieuRong) * 2;
    }
    public static int getDienTich(){
        return chieuDai * chieuRong;
    }
    public String toString(){
        return "Chieu dai: " + chieuDai + "\nChieu rong: " + chieuRong + "\nDien tich: " + getDienTich() + "\nChu vi: " + getChuVi();
    }
}


