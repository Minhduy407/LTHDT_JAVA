package test.duy;

import java.time.LocalDate;

public class SinhVien{
	private String mssv;
	private String hosv;
	private String tensv;
	private String gioitinh;
	private LocalDate ngaysinh;
	private String malop;
	private float diemTB;
	private HeDaoTao heDaotao;
	
	public SinhVien() {
	}
	
	public SinhVien(String mssv, String hosv, String tensv, String gioitinh, LocalDate ngaysinh, String malop,
			float diemTB, HeDaoTao heDaotao) {
		if(mssv.matches("[0-9]{8}") == false) {
			throw new IllegalArgumentException("Ma sv phai la 8 so!");
		}
		setMssv(mssv);
		setHosv(hosv);
		setTensv(tensv);;
		if(gioitinh.equals("Nam") || gioitinh.equals("Nữ"))
			setGioitinh(gioitinh);
		else throw new IllegalArgumentException("Gioi tinh la Nam/Nữ");
		setNgaysinh(ngaysinh);
		setMalop(malop);
		setHeDaotao(heDaotao);
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHosv() {
		return hosv;
	}

	public void setHosv(String hosv) {
		this.hosv = hosv;
	}

	public String getTensv() {
		return tensv;
	}

	public void setTensv(String tensv) {
		this.tensv = tensv;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public LocalDate getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getMalop() {
		return malop;
	}

	public void setMalop(String malop) {
		this.malop = malop;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public HeDaoTao getHeDaotao() {
		return heDaotao;
	}

	public void setHeDaotao(HeDaoTao heDaotao) {
		this.heDaotao = heDaotao;
	}

	@Override
	public String toString() {
		return "Sinhvien [mssv=" + mssv + ", hosv=" + hosv + ", tensv=" + tensv + ", gioitinh=" + gioitinh
				+ ", ngaysinh=" + ngaysinh + ", malop=" + malop + ", diemTB=" + diemTB + ", heDaotao=" + heDaotao + "]";
	}
}