package BaiTapT2;

/*
    @(#)BaiT8.java
    * @version 1.00 2020/1/31
    * Bài toán về gửi ngân hàng
    * @Author Huynh Le Minh Duy
    * @Date 31/01/2020
 */
public class BaiT8 {
    /**
     * Tính số tháng cần để hết tiền.
     * @version 1.00 31 Jan 2020
     */
    public static void main(String[] args) {
        float money = 10000;
        int n = 0;
        while(money >= 0){
            money += money * 0.005;
            money -= 500;
            n++;
        }
        System.out.println("Số tháng cần để hết tiền là: " + n);
    }
}

