package iuh.fit.se;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
	
	private double tiGia;
	private LoaiTien loaiTien;
	
	public GiaoDichTienTe() {
		super();
		this.tiGia = 0;
		this.loaiTien = LoaiTien.VND;
	}
	
	public GiaoDichTienTe(String maGD, LocalDate ngayGD, double donGia, int soLuong) {
		super(maGD, ngayGD, donGia, soLuong);
		this.tiGia = 0;
		this.loaiTien = LoaiTien.VND;
	}
	
	public GiaoDichTienTe(String maGD, LocalDate ngayGD, double donGia, int soLuong, double tiGia, LoaiTien loaiTien) {
		super(maGD, ngayGD, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTien = loaiTien;
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	public LoaiTien getLoaiTien() {
		return loaiTien;
	}

	public void setLoaiTien(LoaiTien loaiTien) {
		this.loaiTien = loaiTien;
	}
	
	@Override
	public double getThanhtien() {
		if(loaiTien == LoaiTien.EURO || loaiTien == LoaiTien.USD)
			return soLuong * donGia * tiGia;
		
		return soLuong * donGia;
	}

	@Override
	public String toString() {
		return super.toString() +", tỉ giá: " + tiGia + ", loại tiền: " + loaiTien;
	}
}
