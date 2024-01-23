package entity;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class BacSi extends CaNhan{
	private LocalDate ngayBatDau;
	private String linhVucChuyenMon;
	
	public BacSi(String maSo, String hoTen, Set<String> dsSoDienThoai, LocalDate ngayBatDau, String linhVucChuyenMon) {
		super(maSo, hoTen, dsSoDienThoai);
		this.ngayBatDau = ngayBatDau;
		this.linhVucChuyenMon = linhVucChuyenMon;
	}

	public BacSi() {
		super();
		this.ngayBatDau = LocalDate.now();
		this.linhVucChuyenMon = "";
	}
	
	public LocalDate getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(LocalDate ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public String getLinhVucChuyenMon() {
		return linhVucChuyenMon;
	}

	public void setLinhVucChuyenMon(String linhVucChuyenMon) {
		this.linhVucChuyenMon = linhVucChuyenMon;
	}

	

	@Override
	public String toString() {
		return "BacSi [ "+ super.toString() +", ngayBatDau=" + ngayBatDau + ", linhVucChuyenMon=" + linhVucChuyenMon + "]";
	}

	@Override
	public String ghiChu() {
		LocalDate hienTai = LocalDate.now();
		int soNam = (int) Math.abs( ChronoUnit.YEARS.between(ngayBatDau, hienTai) );
		return String.format("Thâm niên %s năm", soNam);
	}	
	
}
