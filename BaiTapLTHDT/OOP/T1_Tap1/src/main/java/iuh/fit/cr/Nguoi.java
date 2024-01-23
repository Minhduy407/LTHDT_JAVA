package iuh.fit.cr;

public abstract class Nguoi {
	protected String ma;
	protected String ten;
	protected String sdt;
	
	public Nguoi() {
		this("","","");
	}
	
	public Nguoi(String ma, String ten, String sdt) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.sdt = sdt;
	}
	
	public String getMa() {
		return ma;
	}
	
	public void setMa(String ma) {
		this.ma = ma;
	}
	
	public String getTen() {
		return ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	public String getSdt() {
		return sdt;
	}
	
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ma == null) ? 0 : ma.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Nguoi other = (Nguoi) obj;
		if (ma == null) {
			if (other.ma != null)
				return false;
		} else if (!ma.equalsIgnoreCase(other.ma))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Thông tin " + getClass().getSimpleName() + "\nMã: " + ma + "\nTên: " + ten + "\nSĐT: " + sdt;
	}
	
}
