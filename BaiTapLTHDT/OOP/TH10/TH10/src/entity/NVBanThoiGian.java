package entity;

import java.time.LocalDate;

public class NVBanThoiGian extends NhanVien{
	
	private static final double DON_GIA_GIO = 90000.0;
	private int soGio;

	public NVBanThoiGian(String maSo, String hoTen, String dienThoai, LocalDate ngayVaoLam, int soGio) {
		super(maSo, hoTen, dienThoai, ngayVaoLam);
		setSoGio(soGio);
	}
	
	public NVBanThoiGian() {
		super();
	}

	public int getSoGio() {
		return soGio;
	}

	public void setSoGio(int soGio) {
		if(soGio < 80 || soGio > 120)
			throw new IllegalArgumentException("Số giờ tối thiểu là 80, tối đa là 120");
		this.soGio = soGio;
	}

	@Override
	public String toString() {
		return "NVBanThoiGian ["+ super.toString() +", soGio=" + soGio + "]";
	}
	
	@Override
	public double getTienLuong() {
		return soGio * DON_GIA_GIO;
	}
}
