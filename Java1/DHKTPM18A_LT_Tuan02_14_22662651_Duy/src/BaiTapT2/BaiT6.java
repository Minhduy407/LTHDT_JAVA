package BaiTapT2;

/*
  @(#)BaiT6.java
 * @version 1.00 2020/1/31
 * CopyRight (C) All rights reserved by Chopper team
 * @Author Huynh Le Minh Duy
 * @Date 31/01/2020
 */

/**
 * Nhập vào số n.
 * Kiểm tra xem n có phải là số nguyên tố hay không.
 */
public class BaiT6 {

    public static void main(String[] args) {
        int n;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhập số n: ");
        n = scanner.nextInt();
        if(n < 2 && n >= 0){
            System.out.println(n + " không phải là số nguyên tố");
        }else if(n > 2){
            int i = 2;
            boolean check = true;
            while(i <= Math.sqrt(n)){
                if(n % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(n + " là số nguyên tố");
            }else{
                System.out.println(n + " không phải là số nguyên tố");
            }
        }
        else{
            System.out.println("END OF PROGRAM");
        }
    }
}

