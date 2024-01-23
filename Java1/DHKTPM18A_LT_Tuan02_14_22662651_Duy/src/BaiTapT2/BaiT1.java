package BaiTapT2;

/*
  @(#)BaiT1.java
 * @version 1.00 2020/1/31
 * CopyRight (C) All rights reserved by Chopper team
 * @Author Huynh Le Minh Duy
 * @Date 31/01/2020
 */

import java.util.Scanner;


public class BaiT1 {
    /**
     * Nhập vào họ tên, mã số sinh viên, khẩu hiệu, điểm trung bình mong muốn.
     * In ra màn hình các thông tin vừa nhập.
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập mã số sinh viên: ");
        String mssv = scanner.nextLine();
        System.out.println("Nhập khẩu hiệu: ");
        String slogan = scanner.nextLine();
        System.out.println("Nhập điểm trung bình mong muốn: ");
        float diem = scanner.nextFloat();
        System.out.println("Họ tên: " + name + "\n" +
                "Mã số sinh viên: " + mssv + "\n" +
                "Khẩu hiệu: " + slogan + "\n" +
                "Điểm trung bình mong muốn: " + diem);
    }
}

