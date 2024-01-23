package BaiTapT2;

/*
    @(#)BaiT9.java
    * @Author Huynh Le Minh Duy
    * @Date 31/01/2020
    * @Version 1.00
    * CopyRight: Chopper Team
 */
class BaiT9 {
    /**
     * Mục đích: Tính tiền trả lại cho khách hàng
     * Viết chương trình nhập vào số tiền cần trả lại cho khách hàng,
     * tính số tờ tiền 100, 50, 20, 10, 5 cần trả lại cho khách hàng
     */
    public static void main(String[] args) {
        int money;
        int n100, n50, n20, n10, n5;
        java.util.Scanner Scanner = new java.util.Scanner(System.in);
        System.out.println("Nhập số tiền cần trả lại: ");
        money = Scanner.nextInt();
        n100 = money / 100;
        money = money % 100;
        n50 = money / 50;
        money = money % 50;
        n20 = money / 20;
        money = money % 20;
        n10 = money / 10;
        money = money % 10;
        n5 = money / 5;
        money = money % 5;
        System.out.println("Số lượng 100: " + n100 + "\n" +
                "Số lượng 50: " + n50 + "\n" +
                "Số lượng 20: " + n20 + "\n" +
                "Số lượng 10: " + n10 + "\n" +
                "Số lượng 5: " + n5);
    }
}
