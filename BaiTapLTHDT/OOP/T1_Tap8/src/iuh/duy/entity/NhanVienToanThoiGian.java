/*
*@(#)NhanVienToanThoiGian.java.java  Nov 22, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.duy.entity;
/*
* @description:
* @author: Chopper
* @date: Nov 22, 2023
* @version: 1.0
*/

import java.time.LocalDate;

/**
 * 
 */
public class NhanVienToanThoiGian extends NhanVien{
	private ChucVu chucvu;
	private double hesoluong;
	private static final long LUONG_CO_SO = 1800000;
	
	/**
	 * @param maso
	 * @param hoten
	 * @param sodienthoai
	 * @param ngayvaolam
	 */
	public NhanVienToanThoiGian() {
		super();
		chucvu = ChucVu.NHAN_VIEN;
		hesoluong = 1.35;
	}
	/**
	 * @param maso
	 * @param hoten
	 * @param sodienthoai
	 * @param ngayvaolam
	 */
	public NhanVienToanThoiGian(String maso, String hoten, String sodienthoai, LocalDate ngayvaolam,ChucVu chucvu,double hesoluong) {
		super(maso, hoten, sodienthoai, ngayvaolam);
		setChucvu(chucvu);
		setHesoluong(hesoluong);
	}
	/**
	 * @return the chucvu
	 */
	public final ChucVu getChucvu() {
		return chucvu;
	}

	/**
	 * @param chucvu the chucvu to set
	 */
	public final void setChucvu(ChucVu chucvu) {
		this.chucvu = chucvu;
	}

	/**
	 * @return the hesoluong
	 */
	public final double getHesoluong() {
		return hesoluong;
	}

	/**
	 * @param hesoluong the hesoluong to set
	 */
	public final void setHesoluong(double hesoluong) {
		if(hesoluong < 1.35) 
			throw new IllegalArgumentException("Hệ số lương >= 1.35 !");
		this.hesoluong = hesoluong;
	}

	/**
	 * @return the luongCoSo
	 */
	public static final long getLuongCoSo() {
		return LUONG_CO_SO;
	}

	@Override
	public double tinhtienluong() {
		return hesoluong * LUONG_CO_SO;
	}
	@Override
	public String toString() {
		return "Nhân Viên Toàn Thời Gian" + super.toString() + " chucvu=" + chucvu + ", hesoluong=" + hesoluong + "]";
	}
	
}
