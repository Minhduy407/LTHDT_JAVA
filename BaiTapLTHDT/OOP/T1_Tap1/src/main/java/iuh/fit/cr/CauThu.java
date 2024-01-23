package iuh.fit.cr;

import java.time.LocalDate;

public class CauThu extends Nguoi{
	private long namsinh;

	public CauThu() {
		super();
		this.namsinh = 2004;
	}

	public CauThu(String ma, String ten, String sdt,long namsinh) {
		super(ma,ten,sdt);
		this.namsinh = namsinh;
	}

	public long getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(long namsinh) {
		this.namsinh = namsinh;
	}
	
	public long tinhtuoi() {
		return LocalDate.now().getYear() - this.namsinh;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNăm sinh: " + namsinh;
	}
}
