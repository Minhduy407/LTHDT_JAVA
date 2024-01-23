package iuh.fit.se;

public class KhachHang {
	
	private long maKH;
	private String tenKH;
	private double doanhSo;
	
	public KhachHang() {
	}

	public KhachHang(long maKH, String tenKH, double doanhSo) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.doanhSo = doanhSo;
	}

	public long getMaKH() {
		return maKH;
	}

	public void setMaKH(long maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public double getDoanhSo() {
		return doanhSo;
	}

	public void setDoanhSo(double doanhSo) {
		this.doanhSo = doanhSo;
	}

	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", doanhSo=" + doanhSo + "]";
	}
	
	
}
