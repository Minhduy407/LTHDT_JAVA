/**
 * #@GDVang.class
 * #Date: Sep 26, 2023
 * Version: 1.0
 * Copyright 2023 Huynh Le Minh Duy
 */
package Chopper;

import java.time.LocalDate;

/**
 * 
 */
public class GDVang extends GiaoDich{
	private String loaiVang;
	
	
	/**
	 * 
	 */
	public GDVang() {
		super();
		this.setLoaiVang("9999");
	}


	/**
	 * @param maGD
	 * @param ngayGD
	 * @param donGia
	 * @param soLuong
	 * @param loaiVang
	 */
	public GDVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		this.setLoaiVang(loaiVang);
	}


	@Override
	public double getThanhTien() {
		return soLuong * donGia;
	}


	/**
	 * @return the loaiVang
	 */
	public String getLoaiVang() {
		return loaiVang;
	}


	/**
	 * @param loaiVang the loaiVang to set
	 */
	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}


	@Override
	public String toString() {
		return super.toString() + ", loại vàng: " + loaiVang;
	}

}
