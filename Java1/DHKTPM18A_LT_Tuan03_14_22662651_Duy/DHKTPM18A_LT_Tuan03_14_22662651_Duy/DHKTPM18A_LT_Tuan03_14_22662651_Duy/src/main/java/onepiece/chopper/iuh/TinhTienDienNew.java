package onepiece.chopper.iuh;
/*
  @#TinhTienDienNew.java
  @author: Huynh Le Minh Duy
  @date: 19/05/2021
  @version: 1.0
 */
public class TinhTienDienNew {
    /**
     * Tinh Tien Dien
     * @param chisoCu va chisoMoi
     */
        public static void main(String[] args) {
            int chiSoCu = 2508; // Chỉ số cũ
            int chiSoMoi = 4000; // Chỉ số mới
            int tienDien = getTienDien(chiSoCu, chiSoMoi); // Tiền điện
            System.out.println("Tiền điện: " + tienDien);
        }

        public static int getTienDien(int chiSoCu, int chiSoMoi){

            final double THUE = 0.1; // Thuế VAT

            int soKWh = chiSoMoi - chiSoCu; // Số kWh tiêu thụ
            int tienDien = getSoKWh(soKWh, 400, Integer.MAX_VALUE) * 3015
                    + getSoKWh(soKWh, 300, 400) * 2919
                    + getSoKWh(soKWh, 200, 300) * 2612
                    + getSoKWh(soKWh, 100, 200) * 2074
                    + getSoKWh(soKWh, 50, 100) * 1786
                    + getSoKWh(soKWh, 0, 50) * 1728;

            return tienDien + (int)Math.ceil(tienDien * THUE);
        }

        public static int getSoKWh(int soKWh, int soDau, int soCuoi){
            if(soKWh < soDau)
                return 0;
            if(soKWh <= soCuoi)
                return soKWh - soDau;

            return soCuoi - soDau;
        }
    }
