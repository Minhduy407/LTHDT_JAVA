/*
*@(#)NhanVienLamTheoGio.java.java  Nov 22, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.duy.entity;

import java.text.DecimalFormat;
import java.time.LocalDate;

/*
* @description:
* @author: Chopper
* @date: Nov 22, 2023
* @version: 1.0
*/

/**
 * 
 */
public class NhanVienLamTheoGio extends NhanVien{
	private int sogiolam;
	private static final long LUONG_1_GIO = 50000;
	
	
	/**
	 * @param maso
	 * @param hoten
	 * @param sodienthoai
	 * @param ngayvaolam
	 * @param sogiolam
	 */
	public NhanVienLamTheoGio(String maso, String hoten, String sodienthoai, LocalDate ngayvaolam, int sogiolam) {
		super(maso, hoten, sodienthoai, ngayvaolam);
		setSogiolam(sogiolam);
	}


	/**
	 * @return the sogiolam
	 */
	public final int getSogiolam() {
		return sogiolam;
	}


	/**
	 * @param sogiolam the sogiolam to set
	 */
	public final void setSogiolam(int sogiolam) {
		if(sogiolam < 80 || sogiolam > 120)
			throw new IllegalArgumentException("Số giờ làm việc trong tháng luôn nằm trong khoảng 80 đến 120 giờ !");
		this.sogiolam = sogiolam;
	}

	/**
	 * @return the luong1Gio
	 */
	public static final long getLuong1Gio() {
		return LUONG_1_GIO;
	}


	@Override
	public double tinhtienluong() {
		return sogiolam * LUONG_1_GIO;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0 VNĐ");
		return "Nhân Viên Làm Theo Giờ" + super.toString() + " sogiolam=" + sogiolam + ", luong1gio=" + df.format(LUONG_1_GIO) + "]";
	}
}
