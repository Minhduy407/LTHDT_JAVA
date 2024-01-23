package entity;

import java.time.LocalDate;

public class NVVanPhong extends NhanVien{
	
	private static final double LUONG_CB = 1800000.0;
	private String chucVu;
	private double heSoLuong;
	
	
	
	public NVVanPhong(String maSo, String hoTen, String dienThoai, LocalDate ngayVaoLam, String chucVu,
			double heSoLuong) {
		super(maSo, hoTen, dienThoai, ngayVaoLam);
		this.chucVu = chucVu;
		setHeSoLuong(heSoLuong);
	}
	
	public NVVanPhong() {
		super();
	}

	public String getChucVu() {
		return chucVu;
	}



	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}



	public double getHeSoLuong() {
		return heSoLuong;
	}



	public void setHeSoLuong(double heSoLuong) {
		if(heSoLuong < 1.35)
			throw new IllegalArgumentException("Hệ số lương >=1.35");
		this.heSoLuong = heSoLuong;
	}
	
	@Override
	public double getTienLuong() {
		return heSoLuong * LUONG_CB;
	}

	@Override
	public String toString() {
		return "NVVanPhong ["+ super.toString() +", chucVu=" + chucVu + ", heSoLuong=" + heSoLuong + "]";
	}

	
}
