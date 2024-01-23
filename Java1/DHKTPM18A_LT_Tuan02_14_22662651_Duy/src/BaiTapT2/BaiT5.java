package BaiTapT2;
/*
  @(#)BaiT5.java
 * @version 1.00 2020/1/31
 *CopyRight (C) All rights reserved by Chopper team
 * @Author Huynh Le Minh Duy
 * @Date 31/01/2020
 */

/**
 * Nhập vào số n và tính tổng các số từ 1 đến n.
 * Nhập 0 để kết thúc.
 */
public class BaiT5 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        do{
            System.out.println("Nhập số n: " + "\n" + "Nhập 0 để kết thúc");
            n = scanner.nextInt();
            for(int i = 0; i < n;i++){
                sum += i;
            }
            System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum + "\n");
            sum = 0;
        }while(n != 0);
    }
}
