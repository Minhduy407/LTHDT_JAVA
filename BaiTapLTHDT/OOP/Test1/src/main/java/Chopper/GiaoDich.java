/**
 * #@GiaoDich.class
 * #Date: Sep 26, 2023
 * Version: 1.0
 * Copyright 2023 Huynh Le Minh Duy
 */
package Chopper;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 */
public abstract class GiaoDich {
	protected String maGD;
	LocalDate ngayGD;
	protected double donGia;
	protected int soLuong;
	
	
	
	/**
	 * 
	 */
	public GiaoDich() {
		this("",LocalDate.now(),0.0,0);
	}
	/**
	 * @param maGD
	 * @param ngayGD
	 * @param donGia
	 * @param soLuong
	 */
	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, int soLuong) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	/**
	 * @return the maGD
	 */
	public String getMaGD() {
		return this.maGD;
	}
	/**
	 * @param maGD the maGD to set
	 */
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	/**
	 * @return the ngayGD
	 */
	public LocalDate getNgayGD() {
		return this.ngayGD;
	}
	/**
	 * @param ngayGD the ngayGD to set
	 */
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return this.donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return this.soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public abstract double getThanhTien();
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,#00.0");
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "GiaoDich [maGD=" + this.maGD + ", ngayGD=" + df2.format(ngayGD) + ", donGia=" + df.format(donGia) + ", soLuong="
				+ this.soLuong + ", getThanhTien()=" + df.format(getThanhTien()) + "]";
	}
	
	
}
