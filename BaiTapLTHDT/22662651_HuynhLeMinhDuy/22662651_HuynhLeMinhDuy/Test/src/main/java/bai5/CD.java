package bai5;

import java.text.DecimalFormat;

public class CD {
	
	private int maCD;
	private String tuaCD;
	private int soBaihat;
	private double dongia;
	
	public CD() {
		this(999999);
	}
	
	public CD(int maCD) {
		this(maCD, "chưa xác định", 0, 0.0);
	}

	public CD(int maCD, String tuaCD, int soBaihat, double dongia) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaihat(soBaihat);
		setDongia(dongia);
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if(maCD <= 0)
			throw new IllegalArgumentException("Mã CD là số nguyên (>0)");
		this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		if(tuaCD == null || tuaCD.trim().length() == 0)
			throw new IllegalArgumentException("Tựa CD: chuỗi ký tự (không dược rỗng)");
		this.tuaCD = tuaCD;
	}

	public int getSoBaihat() {
		return soBaihat;
	}

	public void setSoBaihat(int soBaihat) {
		if(soBaihat < 0)
			throw new IllegalArgumentException("Số bài hát: số nguyên (>0)");
		this.soBaihat = soBaihat;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		if(dongia < 0)
			throw new IllegalArgumentException("Giá thành: số thực (>0)");
		this.dongia = dongia;
	}

	@Override
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBaihat=" + soBaihat + ", dongia=" + df.format(dongia) + "]";
	}

	
}

