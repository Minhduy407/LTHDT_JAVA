package iuh.fit.cr;

public class NhanVien extends Nguoi{
	private ChucVu chucvu;
	
	public NhanVien() {
		super();
		this.chucvu = ChucVu.HUAN_LUYEN_VIEN;
	}
	
	public NhanVien(String ma, String ten, String sdt,ChucVu chucvu) {
		super(ma,ten,sdt);
		this.chucvu = chucvu;
	}

	public ChucVu getChucvu() {
		return chucvu;
	}

	public void setChucvu(ChucVu chucvu) {
		this.chucvu = chucvu;
	}


	@Override
	public String toString() {
		return super.toString() + "\n" + chucvu.toString();
	}
	
	
}
