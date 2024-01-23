package iuh.fit.se;

public class NhanVien {
	
	private String maSo;
	private String hoNV;
	private String tenNV;
	private int namSinh;
	
	public NhanVien() {
	}
	
	public NhanVien(String maSo, String hoNV, String tenNV, int namSinh) {
		super();
		this.maSo = maSo;
		this.hoNV = hoNV;
		this.tenNV = tenNV;
		this.namSinh = namSinh;
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoNV() {
		return hoNV;
	}

	public void setHoNV(String hoNV) {
		this.hoNV = hoNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSo == null) ? 0 : maSo.hashCode());
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
		NhanVien other = (NhanVien) obj;
		if (maSo == null) {
			if (other.maSo != null)
				return false;
		} else if (!maSo.equalsIgnoreCase(other.maSo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NhanVien [maSo=" + maSo + ", hoNV=" + hoNV + ", tenNV=" + tenNV + ", namSinh=" + namSinh + "]";
	}
}
