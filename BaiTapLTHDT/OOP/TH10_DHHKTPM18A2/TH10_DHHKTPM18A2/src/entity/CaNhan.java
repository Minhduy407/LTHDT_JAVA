

package entity;

import java.util.HashSet;
import java.util.Set;

public abstract class CaNhan {
	
	protected String maSo;
	protected String hoTen;
	private Set<String> dsSoDienThoai;
	
	public CaNhan(String maSo, String hoTen, Set<String> dsSoDienThoai) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.dsSoDienThoai = dsSoDienThoai;
	}
	
	public CaNhan() {
		this("", "", new HashSet<>());
	}

	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	

	public Set<String> getDsSoDienThoai() {
		return dsSoDienThoai;
	}

	public void setDsSoDienThoai(Set<String> dsSoDienThoai) {
		this.dsSoDienThoai = dsSoDienThoai;
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
//		if (getClass() != obj.getClass())
//			return false;
		CaNhan other = (CaNhan) obj;
		if (maSo == null) {
			if (other.maSo != null)
				return false;
		} else if (!maSo.equals(other.maSo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CaNhan [maSo=" + maSo + ", hoTen=" + hoTen + ", danhSachSoDienThoai=" + dsSoDienThoai
				+ ", ghiChu()=" + ghiChu() + "]";
	}

	public abstract String  ghiChu() ;

}
