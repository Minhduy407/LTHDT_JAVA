/*
*@(#)NhanVienBanHang.java.java  Nov 8, 2023
*
*Copyright (c) 2023 Chopper. All rights reserved.
*/
/**
 * 
 */
package iuh.fit.cr;
/*
* @description:
* @author: Chopper
* @date: Nov 8, 2023
* @version: 1.0
*/

/**
 * 
 */
public class NhanVienBanHang extends NhanVien{
	private long doanhso;
	
	/**
	 * 
	 */
	public NhanVienBanHang() {
		super();
		this.doanhso = 0;
	}

	/**
	 * @param manv
	 * @param tennv
	 * @param honv
	 * @param luong
	 * @param thongtin
	 * @param doanhso
	 */
	public NhanVienBanHang(String manv, String tennv, String honv, double luong, ThongTinLienHe thongtin, long doanhso) {
		super(manv, tennv, honv, luong, thongtin);
		this.doanhso = doanhso;
	}

	/**
	 * @return the doanhso
	 */
	public long getDoanhso() {
		return doanhso;
	}

	/**
	 * @param doanhso the doanhso to set
	 */
	public void setDoanhso(long doanhso) {
		this.doanhso = doanhso;
	}

	@Override
	public double tinhluong() {
		if(doanhso > 50000000)
			return luong + doanhso * 0.1;
		return luong;
	}

	@Override
	public String toString() {
		return "Nhân viên bán hàng\n" + super.toString() + "\nDoanh số: " + doanhso;
	}
	
	
}
