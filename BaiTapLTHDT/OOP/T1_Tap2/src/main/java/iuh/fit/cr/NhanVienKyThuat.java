/*
*@(#)NhanVienKyThuat.java.java  Nov 8, 2023
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
public class NhanVienKyThuat extends NhanVien{
	private DanhGia muchoanthanh;
	
	/**
	 * 
	 */
	public NhanVienKyThuat() {
		super();
		this.muchoanthanh = DanhGia.KHONG_VI_PHAM;
	}

	/**
	 * @param manv
	 * @param tennv
	 * @param honv
	 * @param luong
	 * @param thongtin
	 * @param muchoanthanh
	 */
	public NhanVienKyThuat(String manv, String tennv, String honv, double luong, ThongTinLienHe thongtin,
			DanhGia muchoanthanh) {
		super(manv, tennv, honv, luong, thongtin);
		this.muchoanthanh = muchoanthanh;
	}


	/**
	 * @return the muchoanthanh
	 */
	public DanhGia getMuchoanthanh() {
		return muchoanthanh;
	}

	/**
	 * @param muchoanthanh the muchoanthanh to set
	 */
	public void setMuchoanthanh(DanhGia muchoanthanh) {
		this.muchoanthanh = muchoanthanh;
	}

	@Override
	public double tinhluong() {
		// TODO Auto-generated method stub
		if(muchoanthanh == DanhGia.KHONG_VI_PHAM)
			return luong + 0.1 * luong;
		return luong;
	}

	@Override
	public String toString() {
		return "Nhân viên kỹ thuật\n" + super.toString() + "\nMức hoàn thành: " + muchoanthanh;
	}
	
	
	
}
