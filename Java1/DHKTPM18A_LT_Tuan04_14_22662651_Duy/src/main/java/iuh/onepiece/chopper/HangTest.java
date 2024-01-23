/*
@class java.lang.String 9/10/2023
@4:43 PM
@version 4.0
@author Huynh Le Minh Duy
@Copyright by ChopperTeam.
*/
package iuh.onepiece.chopper;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class HangTest {
    private String mahang;
    private String tenhang;
    private float dongia;
    LocalDate ngaysanxuat;
    LocalDate ngayhethan;

    public HangTest(){
        this("0000","No name",0.0f,LocalDate.now(),LocalDate.now());
    }
    public HangTest(String mahang, String tenhang,float dongia, LocalDate ngaysanxuat, LocalDate ngayhethan){
        if(mahang == null || mahang.trim().equals("")){
            throw new IllegalArgumentException("Mã hàng không được để trống");
        }
        this.mahang = mahang;
        setTenhang(tenhang);
        this.dongia = dongia;
        setNgaysanxuat(ngaysanxuat);
        setNgayhethan(ngayhethan);
    }
    public String getMahang() {
        return mahang;
    }
    public void setTenhang(String tenhang) {
        if(tenhang == null || tenhang.trim().equals("")){
            throw new IllegalArgumentException("Tên hàng không được để trống");
        }
        this.tenhang = tenhang;
    }
    public void setNgaysanxuat(LocalDate ngaysanxuat) {
        if(ngaysanxuat == null){
            throw new IllegalArgumentException("Ngày sản xuất không được để trống");
        }
        this.ngaysanxuat = ngaysanxuat;
    }
    public void setNgayhethan(LocalDate ngayhethan) {
        if(ngayhethan == null || ngayhethan.isBefore(ngaysanxuat)){
            throw new IllegalArgumentException("Ngày hết hạn không được để trống và phải sau ngày sản xuất");
        }
        this.ngayhethan = ngayhethan;
    }

    public boolean KiemTraNgayhethang(){
        if(ngayhethan.isBefore(LocalDate.now())){
            return true;
        }
        return false;
    }
    DecimalFormat df = new DecimalFormat("#,###.00");
    DecimalFormat df1 = new DecimalFormat("dd/MM/yyyy");
    public String toString(){
        return String.format("%-10s %-20s %-20s %-20s %-20s %-20s",mahang,tenhang,df.format(dongia),df1.format(ngaysanxuat),df1.format(ngayhethan),KiemTraNgayhethang());
    }
}
