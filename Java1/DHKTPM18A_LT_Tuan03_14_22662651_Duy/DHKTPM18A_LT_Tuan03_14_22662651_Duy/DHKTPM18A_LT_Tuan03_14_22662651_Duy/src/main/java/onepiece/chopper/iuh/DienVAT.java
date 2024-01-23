/*
*@(#){DienVAT}.class 8/28/2023 
*
*Copyright ChopperTeam.All reserved right.
*/
package onepiece.chopper.iuh;/*
*@author: Huynh Le Minh Duy
*@date: 2023
*@version: 1.0
*/

public class DienVAT {
    public static void main(String[] args) {
        int chisocu,chisomoi,money;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhập vào đây chỉ số cũ");
        chisocu = scanner.nextInt();
        System.out.println("Nhập vào đây chỉ số mới");
        chisomoi = scanner.nextInt();
        money = tiendien(chisocu,chisomoi);
        System.out.println("Tiền điện = " + money);
    }
    public static int tiendien(int chisocu, int chisomoi){

        final double THUE = 0.1; // Thuế VAT

        int soKWh = chisomoi - chisocu; // Số kWh tiêu thụ
        int money = SoKWh(soKWh, 400, Integer.MAX_VALUE) * 3015
                + SoKWh(soKWh, 300, 400) * 2919
                + SoKWh(soKWh, 200, 300) * 2612
                + SoKWh(soKWh, 100, 200) * 2074
                + SoKWh(soKWh, 50, 100) * 1786
                + SoKWh(soKWh, 0, 50) * 1728;

        return money + (int)Math.ceil(money * THUE);
    }

    public static int SoKWh(int soKWh, int soDau, int soCuoi){
        if(soKWh < soDau)
            return 0;
        if(soKWh <= soCuoi)
            return soKWh - soDau;

        return soCuoi - soDau;
    }
}
