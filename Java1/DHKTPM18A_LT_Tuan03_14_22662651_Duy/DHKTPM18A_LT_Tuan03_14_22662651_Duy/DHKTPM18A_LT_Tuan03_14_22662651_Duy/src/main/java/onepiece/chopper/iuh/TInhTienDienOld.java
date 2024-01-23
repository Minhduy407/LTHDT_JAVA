package onepiece.chopper.iuh;
/*
  @#TinhTienDienOld.java
  @author: Huynh Le Minh Duy
  @date: 19/05/2021
  @version: 1.0
 */
public class TInhTienDienOld {
    /**
     * Dung de tinh tien dien
     * @param old1
     * @param new1
     * @return energy
     */
    public static void main(String[] args) {
        int old1;
        int new1;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhập chỉ số cũ: ");
        old1 = scanner.nextInt();
        System.out.println("Nhập chỉ số mới: ");
        new1 = scanner.nextInt();
        System.out.println("Tiền điện là: " + tiendien(new1,old1) + "VND");
    }
        public static int tiendien(int old1,int new1) {
            int energy;
            int money;
            energy = new1 - old1;
            if (energy <= 50) {
                money = energy * 1678;
            } else if (energy <= 100) {
                money = 50 * 1678 + (energy - 50) * 1734;
            } else if (energy <= 200) {
                money = 50 * 1678 + 50 * 1734 + (energy - 100) * 2014;
            } else if (energy <= 300) {
                money = 50 * 1678 + 50 * 1734 + 100 * 2014 + (energy - 200) * 2536;
            } else if (energy <= 400) {
                money = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (energy - 300) * 2834;
            } else {
                money = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (energy - 400) * 2927;
            }
            return money;
        }
}
