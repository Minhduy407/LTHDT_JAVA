package iuh.fit.se;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{

	private TinhTrang tinhTrang;

	public SachGiaoKhoa() {
		super();
		this.tinhTrang = TinhTrang.MỚI;
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			TinhTrang tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}

	public TinhTrang getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(TinhTrang tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double getThanhtien() {
		double thanhTien = donGia * soLuong;
		return tinhTrang == TinhTrang.CŨ ? thanhTien * 0.5 : thanhTien;
	}

	@Override
	public String toString() {
		return super.toString() + ", tinhTrang=" + tinhTrang;
		//		return super.toString() + ", tinhTrang=" + tinhTrang.getTinhTrang() ;
	}
}
