package iuh.fit.se;

import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class GiaoDich {
	
	protected String maGD;
	protected LocalDate ngayGD;
	protected double donGia;
	protected int soLuong;
	
	public GiaoDich() {
		this("", LocalDate.now(), 0.0, 0);
	}

	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, int soLuong) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}

	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}

	public LocalDate getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public abstract double getThanhtien();

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return getClass().getSimpleName() + " [maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + df.format(donGia) + ", soLuong=" + soLuong
				+ ", getThanhtien()=" + df.format(getThanhtien()) + "]";
	}
	
	
}
