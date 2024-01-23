package BaiTapT2;

/*
  @(#)BaiT7.java
 * @version 1.00 2020/1/31
 * CopyRight (C) All rights reserved by Chopper team
 * @Author Huynh Le Minh Duy
 * @Date 31/01/2020
 */


public class BaiT7 {
    public static void main(String[] args) {
        /**
         * Nhập vào 2 số a và b.
         * Tính trung bình cộng của 2 số đó.
         */
        int a;
        int b;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        b = scanner.nextInt();
        System.out.println("Trung bình của " + a + " và " + b + " là: " + TTB2(a, b));
        /**
         * Nhập vào 3 số c, d và e.
         * Tính trung bình cộng của 3 số đó.
         */
        int c;
        int d;
        int e;
        System.out.println("Nhập số c: ");
        c = scanner.nextInt();
        System.out.println("Nhập số d: ");
        d = scanner.nextInt();
        System.out.println("Nhập số e: ");
        e = scanner.nextInt();
        System.out.println("Trung bình của " + c + ", " + d + " và " + e + " là: " + TTB3(c, d, e));
        /**
         * Nhập n số nguyên. Nhập 0 để kết thúc.
         * Tính trung bình cộng của n số nguyên vừa nhập.
         */
        int n1 = 0;
        float sum1 = 0;
        int max1 = 10000000;
        int arr1[] = new int[max1];
        System.out.println("Nhập các số cần tính trung bình: ");
        arr1[n1] = scanner.nextInt();
        while(arr1[n1] != 0){
            sum1 += arr1[n1];
            n1++;
            arr1[n1] = scanner.nextInt();
        }
        System.out.println("Trung bình của " + n1 + " số nguyên là: " + TTB(arr1, n1));

    }
    public static float TTB2(int a, int b){
        return (float) (a + b) / 2;
    }
    public static float TTB3(int a, int b, int c){
        return (float) (a + b + c) / 3;
    }
    public static float TTB(int arr[], int n){
        float sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum / n;
    }
}

