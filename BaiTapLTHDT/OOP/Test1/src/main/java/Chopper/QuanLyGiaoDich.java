/**
 * #@QuanLyGiaoDich.class
 * #Date: Sep 26, 2023
 * Version: 1.0
 * Copyright 2023 Huynh Le Minh Duy
 */
package Chopper;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 
 */
public class QuanLyGiaoDich {
	private int n = 0;
	private GiaoDich[] gds;
	
	
	/**
	 * 
	 */
	public QuanLyGiaoDich() {
		super();
		gds = new GiaoDich[10];
	}
	/**
	 * @param n
	 */
	public QuanLyGiaoDich(int n) {
		super();
		if(n < 0)
			throw new IllegalArgumentException("So luong giao dich > 0");
		gds = new GiaoDich[n];
	}
	/**
	 * @return the n
	 */
	public int getN() {
		return this.n;
	}
	/**
	 * @param n the n to set
	 */
	public void setN(int n) {
		this.n = n;
	}
	/**
	 * @return the gds
	 */
	public GiaoDich[] getGds() {
		return Arrays.copyOf(gds, n);
	}
	/**
	 * @param gds the gds to set
	 */
	public void setGds(GiaoDich[] gds) {
		this.gds = gds;
	}
	
	public void themGD(GiaoDich x) {
		GiaoDich i = timKiemGD(x.getMaGD());
		if(i != null)
			throw new IllegalArgumentException("Trùng mã giao dịch!");
		if(n == gds.length)
			tangkichthuoc();
		gds[n++] = x;
	}
	/**
	 * 
	 */
	public void tangkichthuoc() {
		int newlenght = (int)Math.ceil(gds.length * 1.5);
		gds = Arrays.copyOf(gds, newlenght);
	}
	/**
	 * @param maGD
	 * @return
	 */
	public GiaoDich timKiemGD(String maGD) {
		return  Arrays.stream(gds)
			   .filter(gd -> gd.maGD.equalsIgnoreCase(maGD))
			   .findFirst()
			   .orElse(null);
	}
	
	public int tongSLGDV() {
		return Arrays.stream(gds)
				.filter(gd -> gd instanceof GDVang)
				.collect(Collectors.summingInt(gd -> gd.getSoLuong()));
	}
	public int tongSLGDTT() {
		return Arrays.stream(gds)
				.filter(gd -> gd instanceof GDTienTe)
				.collect(Collectors.summingInt(gd -> gd.getSoLuong()));
	}
	
	public double thanhTienTBGDTT() {
		return Arrays.stream(gds)
				.filter(gd -> gd instanceof GDTienTe)
				.collect(Collectors.averagingDouble(gd -> gd.getThanhTien()));
	}
	
	public GiaoDich[] gd1t() {
		return Arrays.stream(gds)
				.filter(gd -> gd.getDonGia() > 1000000000.0)
				.toArray(x -> new GiaoDich[x]);
	}
	
}
