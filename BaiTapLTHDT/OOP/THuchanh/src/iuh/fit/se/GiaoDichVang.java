package iuh.fit.se;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich{
	
	private String loaiVang;
	
	public GiaoDichVang() {
		super();
		this.loaiVang = "9999";
	}
	
	public GiaoDichVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	@Override
	public double getThanhtien() {
		return soLuong * donGia;
	}
	
	@Override
	public String toString() {
		return super.toString()+", loại vàng: " + loaiVang;
	}

}
