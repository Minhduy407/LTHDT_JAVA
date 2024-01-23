package iuh.fit.chopper;

import java.time.LocalDate;

public class GDDat extends GiaoDich{
	private String loaiDat;
	
	/**
	 * 
	 */
	public GDDat() {
		super();
		this.loaiDat = "A";
	}

	/**
	 * @param maGD
	 * @param dGD
	 * @param donGia
	 * @param dienTich
	 * @param loaiDat
	 */
	public GDDat(int maGD, LocalDate dGD, double donGia, double dienTich, String loaiDat) {
		super(maGD, dGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	@Override
	public double thanhTienGD() {
		if(loaiDat == "B" || loaiDat == "C")
			return dienTich * donGia;
		return dienTich * donGia * 1.5;
	}

	/**
	 * @return the loaiDat
	 */
	public String getLoaiDat() {
		return loaiDat;
	}

	/**
	 * @param loaiDat the loaiDat to set
	 */
	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	@Override
	public String toString() {
		return super.toString() + "LoaiDatGD =" + loaiDat;
	}
	
	

}
