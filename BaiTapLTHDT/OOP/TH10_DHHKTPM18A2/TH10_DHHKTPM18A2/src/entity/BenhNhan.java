package entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class BenhNhan extends CaNhan {
	private LocalDate ngaySinh;
	private String diaChi;
	
	
	public BenhNhan(String maSo, String hoTen, Set<String> dsSoDienThoai, LocalDate ngaySinh, String diaChi) {
		super(maSo, hoTen, dsSoDienThoai);
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	
	public BenhNhan() {
		super();
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	
	
	@Override
	public String toString() {
		return "BenhNhan [" +super.toString()+ ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + "]";
	}

	@Override
	public String ghiChu() {
		int tuoi = (int)Math.abs(ChronoUnit.YEARS.between(ngaySinh, LocalDate.now()));
		String ghiChu = "";
		if(tuoi < 16)
			ghiChu = "Trẻ em";
		return ghiChu;
	}

}
