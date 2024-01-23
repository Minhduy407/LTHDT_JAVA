package iuh.fit.se;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	
	private static final double THUE_SUAT = 0.05;
	
	public SachThamKhao() {
		super();
	}
	
	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
	}
	
	@Override
	public double getThanhtien() {
		return (soLuong * donGia) * (1 + THUE_SUAT);
	}

}
