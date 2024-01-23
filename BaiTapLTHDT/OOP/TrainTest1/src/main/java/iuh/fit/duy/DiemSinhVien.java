package iuh.fit.duy;

public class DiemSinhVien {
	private long masv;
	private String hotensv;
	private double diemLT,diemTH;
	
	/**
	 * 
	 */
	public DiemSinhVien() {
		this(0,"No name",0.0,0.0);
	}
	/**
	 * @param masv
	 * @param hotensv
	 * @param diemLT
	 * @param diemTH
	 */
	public DiemSinhVien(long masv, String hotensv, double diemLT, double diemTH) {
		if(masv < 0) setMasv(0);
		setMasv(masv);
		if(hotensv == null) setHotensv("No name");
		setHotensv(hotensv);
		if(diemLT < 0.0 || diemLT > 10.0) setDiemLT(0.0);
		setDiemLT(diemLT);
		if(diemTH < 0.0 || diemTH > 10.0) setDiemTH(0.0);
		setDiemTH(diemTH);
	}
	/**
	 * @return the masv
	 */
	public long getMasv() {
		return masv;
	}
	/**
	 * @param masv the masv to set
	 */
	public void setMasv(long masv) {
		this.masv = masv;
	}
	/**
	 * @return the hotensv
	 */
	public String getHotensv() {
		return hotensv;
	}
	/**
	 * @param hotensv the hotensv to set
	 */
	public void setHotensv(String hotensv) {
		this.hotensv = hotensv;
	}
	/**
	 * @return the diemLT
	 */
	public double getDiemLT() {
		return diemLT;
	}
	/**
	 * @param diemLT the diemLT to set
	 */
	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}
	/**
	 * @return the diemTH
	 */
	public double getDiemTH() {
		return diemTH;
	}
	/**
	 * @param diemTH the diemTH to set
	 */
	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}
	
	public double diemtrungbinh() {
		return (diemLT + diemTH) / 2;
	}
	
	@Override
	public String toString() {
		return String.format("%-5d %-30s %5.2f %5.2f %5.2f",masv,hotensv,diemLT,diemTH,diemtrungbinh()); 
	}
}
