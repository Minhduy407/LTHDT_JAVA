package iuh.fit.chopper;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QLGiaoDich {
	private int soGD = 0;
	private GiaoDich[] gds;
	
	/**
	 * 
	 */
	public QLGiaoDich() {
		this(10);
	}
	/**
	 * @param gds
	 */
	public QLGiaoDich(int soGD) {
		gds = new GiaoDich[soGD];	
	}
	/**
	 * @return the soGD
	 */
	public int getSoGD() {
		return soGD;
	}
	/**
	 * @param soGD the soGD to set
	 */
	public void setSoGD(int soGD) {
		this.soGD = soGD;
	}
	/**
	 * @return the gds
	 */
	public GiaoDich[] getGds() {
		return Arrays.copyOf(gds, soGD);
	}
	
	public double tbThanhTienDGD() {
		return Arrays.stream(gds,0,soGD)
				.filter(gd -> gd instanceof GDDat)
				.collect(Collectors.averagingDouble(GiaoDich::thanhTienGD));
	}
}
