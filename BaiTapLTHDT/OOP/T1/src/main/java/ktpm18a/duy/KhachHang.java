package ktpm18a.duy;

import java.text.DecimalFormat;

public class KhachHang {
	private String cmnd;
	private String ten;
	private String gaden;
	private double giatien;
	
	/**
	 * 
	 */
	public KhachHang() {
		this("","","",0.0);
	}
	/**
	 * @param cmnd
	 * @param ten
	 * @param gaden
	 * @param giatien
	 */
	public KhachHang(String cmnd, String ten, String gaden, double giatien) {
		super();
		this.cmnd = cmnd;
		this.ten = ten;
		this.gaden = gaden;
		this.giatien = giatien;
	}
	/**
	 * @return the cmnd
	 */
	public String getCmnd() {
		return cmnd;
	}
	/**
	 * @param cmnd the cmnd to set
	 */
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}
	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}
	/**
	 * @return the gaden
	 */
	public String getGaden() {
		return gaden;
	}
	/**
	 * @param gaden the gaden to set
	 */
	public void setGaden(String gaden) {
		this.gaden = gaden;
	}
	/**
	 * @return the giatien
	 */
	public double getGiatien() {
		return giatien;
	}
	/**
	 * @param giatien the giatien to set
	 */
	public void setGiatien(double giatien) {
		this.giatien = giatien;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cmnd == null) ? 0 : cmnd.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		if (cmnd == null) {
			if (other.cmnd != null)
				return false;
		}
		return true;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.0 VNĐ");
		return "\nKhách Hàng:\nCMND: " + cmnd + "\nTên: " + ten + "\nGa đến: " + gaden + "\nGiá tiền: " + df.format(giatien) + "\n";
	}
}
