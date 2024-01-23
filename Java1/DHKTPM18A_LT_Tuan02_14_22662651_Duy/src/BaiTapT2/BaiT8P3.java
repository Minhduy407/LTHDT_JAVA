package BaiTapT2;

/*
    @(#)BaiT8P3.java
    * @version 1.00 2020/1/31
    * Bài toán về gửi ngân hàng
    * @Author Huynh Le Minh Duy
    * @Date 31/01/2020
 */
public class BaiT8P3 {
    /**
     * Tính số tiền sau 1,2,3 năm.
     * @version 1.00 31 Jan 2020
     */
    public static void main(String[] args) {
        float money = 1000;
        int n = 3;
        for(int i = 0; i < n; i++){
            money += money * 0.05;
            System.out.println("Số tiền sau " + (i + 1) + " năm là: " + money);
        }
    }
}
