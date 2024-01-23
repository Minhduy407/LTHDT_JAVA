package BaiTapT2;

/*
  @(#)BaiT4.java
 * @version 1.00 2020/1/31
 * CopyRight (C) All rights reserved by Chopper team
 * Nhập vào chỉ số cũ và chí số mới của một hộ gia đình.
 * Tính tiền điện phải trả và in ra màn hình.
 * @Author Huynh Le Minh Duy
 * @Date 31/01/2020
 */
/**
 * Nhập vào chỉ số cũ và chỉ số mới của một hộ gia đình.
 * Tính tiền điện phải trả biết rằng:
 * 50 số đầu tiên giá 1678 VND/số.
 * 50 số tiếp theo giá 1734 VND/số.
 * 100 số tiếp theo giá 2014 VND/số.
 * 100 số tiếp theo giá 2536 VND/số.
 * 100 số tiếp theo giá 2834 VND/số.
 * Các số tiếp theo giá 2927 VND/số.
 */
public class BaiT4 {

    public static void main(String[] args) {

        int old1;
        int new1;
        int energy;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhập chỉ số cũ: ");
        old1 = scanner.nextInt();
        System.out.println("Nhập chỉ số mới: ");
        new1 = scanner.nextInt();
        energy = new1 - old1;
        if(energy <= 50){
            System.out.println("Tiền điện là: " + energy * 1678 + " VND");
        }else if(energy <= 100){
            System.out.println("Tiền điện là: " + (50 * 1678 + (energy - 50) * 1734) + " VND");
        }else if(energy <= 200){
            System.out.println("Tiền điện là: " + (50 * 1678 + 50 * 1734 + (energy - 100) * 2014) + " VND");
        }else if(energy <= 300){
            System.out.println("Tiền điện là: " + (50 * 1678 + 50 * 1734 + 100 * 2014 + (energy - 200) * 2536) + " VND");
        }else if(energy <= 400){
            System.out.println("Tiền điện là: " + (50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (energy - 300) * 2834) + " VND");
        }else{
            System.out.println("Tiền điện là: " + (50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (energy - 400) * 2927) + " VND");
        }
    }
}
