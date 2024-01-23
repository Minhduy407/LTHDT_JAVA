package iuh.fit.chopper;

import java.time.LocalDate;

public class GDNha extends GiaoDich{
	private LoaiNha loainha;
	private String diaChi;
	
	
	/**
	 * 
	 */
	public GDNha() {
		super();
		this.loainha = LoaiNha.Thường;
		this.diaChi = "";
	}


	/**
	 * @param maGD
	 * @param dGD
	 * @param donGia
	 * @param dienTich
	 * @param loainha
	 * @param diaChi
	 */
	public GDNha(int maGD, LocalDate dGD, double donGia, double dienTich, LoaiNha loainha, String diaChi) {
		super(maGD, dGD, donGia, dienTich);
		this.loainha = loainha;
		this.diaChi = diaChi;
	}


	/**
	 * @return the loainha
	 */
	public LoaiNha getLoainha() {
		return loainha;
	}


	/**
	 * @param loainha the loainha to set
	 */
	public void setLoainha(LoaiNha loainha) {
		this.loainha = loainha;
	}


	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}


	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	@Override
	public double thanhTienGD() {
		if(loainha == LoaiNha.Cao_Cấp)
		return dienTich * donGia;
		return dienTich * donGia * 0.9;
	}


	@Override
	public String toString() {

		return super.toString() + "LoaiNha= " + loainha;
	}
	

}
