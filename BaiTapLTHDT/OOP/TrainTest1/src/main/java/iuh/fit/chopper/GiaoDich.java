package iuh.fit.chopper;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class GiaoDich {
	protected int maGD;
	LocalDate dGD;
	protected double donGia;
	protected double dienTich;
		
	
	/**
	 * 
	 */
	public GiaoDich() {
		this(0,LocalDate.now(),0.0,0.0);
	}
	/**
	 * @param maGD
	 * @param dGD
	 * @param donGia
	 * @param dienTich
	 */
	public GiaoDich(int maGD, LocalDate dGD, double donGia, double dienTich) {
		super();
		this.maGD = maGD;
		this.dGD = dGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	/**
	 * @return the maGD
	 */
	public int getMaGD() {
		return maGD;
	}
	/**
	 * @param maGD the maGD to set
	 */
	public void setMaGD(int maGD) {
		this.maGD = maGD;
	}
	/**
	 * @return the dGD
	 */
	public LocalDate getdGD() {
		return dGD;
	}
	/**
	 * @param dGD the dGD to set
	 */
	public void setdGD(LocalDate dGD) {
		this.dGD = dGD;
	}
	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}
	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	/**
	 * @return the dienTich
	 */
	public double getDienTich() {
		return dienTich;
	}
	/**
	 * @param dienTich the dienTich to set
	 */
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	
	public abstract double thanhTienGD();
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,#00.00 VND");
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return getClass() + " [maGD=" + maGD + ", dGD=" + df2.format(dGD) + ", donGia=" + df.format(donGia) + ", dienTich=" + dienTich
				+ ", thanhTienGD=" + df.format(thanhTienGD()) + "]";
	}
	
	
}
