/**
 * #@GDTienTe.class
 * #Date: Sep 26, 2023
 * Version: 1.0
 * Copyright 2023 Huynh Le Minh Duy
 */
package Chopper;

import java.time.LocalDate;

/**
 * 
 */
public class GDTienTe extends GiaoDich{
	private TienTe tiente;
	private TiGia tigia;
	/**
	 * 
	 */
	public GDTienTe() {
		super();
		this.tiente = TienTe.tiền_Việt_Nam;
		this.tigia = TiGia.VND;
	}

	/**
	 * @param maGD
	 * @param ngayGD
	 * @param donGia
	 * @param soLuong
	 * @param tiente
	 */
	public GDTienTe(String maGD, LocalDate ngayGD, double donGia, int soLuong, TienTe tiente,TiGia tigia) {
		super(maGD, ngayGD, donGia, soLuong);
		this.tiente = tiente;
		this.tigia = tigia;
	}

	/**
	 * @return the tiente
	 */
	public TienTe getTiente() {
		return this.tiente;
	}

	/**
	 * @param tiente the tiente to set
	 */
	public void setTiente(TienTe tiente) {
		this.tiente = tiente;
	}

	@Override
	public double getThanhTien() {
		if(tiente == TienTe.tiền_Euro)
			return donGia * soLuong * tigia.getValue();
		if(tiente == TienTe.tiền_USD)
			return donGia * soLuong * tigia.getValue();
		return donGia * soLuong * tigia.getValue();
	}

	/**
	 * @return the tigia
	 */
	public double getTigia() {
		return tigia.getValue();
	}


}
