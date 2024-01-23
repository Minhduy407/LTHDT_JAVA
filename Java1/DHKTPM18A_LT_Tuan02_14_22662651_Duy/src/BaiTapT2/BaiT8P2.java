package BaiTapT2;

/*
    @(#)BaiT8P2.java
    * @version 1.00 2020/1/31
    * Bài toán về gửi ngân hàng
    * @Author Huynh Le Minh Duy
    * @Date 31/01/2020
 */
public class BaiT8P2 {
    /**
     * Tính số tháng cần để hết tiền. Với các thông tin nhập vào từ bàn phím.
     * @version 1.00 31 Jan 2020
     */
    public static void main(String[] args) {
        float money1;
        float money2;
        float pt;
        int n;
        try (java.util.Scanner Scanner = new java.util.Scanner(System.in)) {
            n = 0;
            do {
                System.out.println("Nhập số tiền: ");
                money1 = Scanner.nextFloat();
                System.out.println("Nhập số tiền cần rút hằng tháng: ");
                money2 = Scanner.nextFloat();
                System.out.println("Nhập lãi suất: ");
                pt = Scanner.nextFloat();
                if((float) (money1 * 0.1 * pt) == money2)
                    System.out.println("Số tiền cần rút hằng tháng phải lớn hớn số tiền lãi");
            } while ((float) (money1 * 0.1 * pt) == money2);
        }
        while(money1 >= 0){
            money1 = (float) (money1 + money1 * (pt * 1.0 / 100));
            money1 -= money2;
            n++;
        }
        System.out.println("Số tháng cần để hết tiền là: " + n);
    }
}
