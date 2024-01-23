package BaiTapT2;

/*
  @(#)BaiT3.java
 * @version 1.00 2020/1/31
 * CopyRight (C) All rights reserved by Chopper team
 * @Author Huynh Le Minh Duy
 * @Date 31/01/2020
 */
import java.util.Scanner;
/**
 * Nhập vào 3 số a,b,c.
 * Giải phương trình bậc 2: ax^2 + bx + c = 0.
 */
public class BaiT3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Nhập số a: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        b = scanner.nextInt();
        System.out.println("Nhập số c: ");
        c = scanner.nextInt();
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phương trình vô số nghiệm");
                }else{
                    System.out.println("Phương trình vô nghiệm");
                }
            }else{
                System.out.println("Phương trình có nghiệm duy nhất: " + (-c / b));
            }
        }
        else{
            float delta = b * b - 4 * a * c;
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm");
            }else if(delta == 0){
                System.out.println("Phương trình có nghiệm kép: " + (-b / (2 * a)));
            }else{
                System.out.println("Phương trình có 2 nghiệm phân biệt: " + ((-b + Math.sqrt(delta)) / (2 * a)) + " và " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
}