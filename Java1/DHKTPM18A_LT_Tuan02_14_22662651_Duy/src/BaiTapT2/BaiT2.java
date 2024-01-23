package BaiTapT2;
/*
  @(#)BaiT2.java
 * @version 1.00 2020/1/31
 * CopyRight (C) All rights reserved by Chopper team
 * @Author Huynh Le Minh Duy
 * @Date 31/01/2020
 */
import java.util.Scanner;
/**
 * Nhập vào 2 số a,b.
 * Giải phương trình bậc 1: ax + b = 0.
 */
public class BaiT2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Nhập số a: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm duy nhất: " + (-b / a));
        }
    }
}
