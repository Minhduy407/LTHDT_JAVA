package entity;

import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class NhanVien {
	protected String maSo;
	protected String hoTen;
	protected String dienThoai;
	protected LocalDate ngayVaoLam;
	public NhanVien(String maSo, String hoTen, String dienThoai, LocalDate ngayVaoLam) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.dienThoai = dienThoai;
		setNgayVaoLam(ngayVaoLam);
	}
	
	public NhanVien() {
		this("Mã số","Họ tên","",LocalDate.now());
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

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public LocalDate getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(LocalDate ngayVaoLam) {
		LocalDate hienTai = LocalDate.now();
		if(ngayVaoLam.isAfter(hienTai))
			throw new IllegalArgumentException("Trước hoặc là ngày hiện tại");
		this.ngayVaoLam = ngayVaoLam;
	}

	

	@Override
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("#,##0.00 VND");
		return "NhanVien [maSo=" + maSo + ", hoTen=" + hoTen + ", dienThoai=" + dienThoai + ", ngayVaoLam=" + ngayVaoLam
				+ ", getTienLuong()=" + df.format(getTienLuong()) + "]";
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
		NhanVien other = (NhanVien) obj;
		if (maSo == null) {
			if (other.maSo != null)
				return false;
		} else if (!maSo.equalsIgnoreCase(other.maSo))
			return false;
		return true;
	}

	public abstract double getTienLuong();
	
}
