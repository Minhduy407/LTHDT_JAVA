package iuh.fit.cr;

public enum ChucVu {
	TRUONG_DOAN("Trưởng đoàn"),HUAN_LUYEN_VIEN("Huấn luyện viên"),TRO_LY("Trợ lý");
	
	private String chucvu;
	
	private ChucVu(String chucvu) {
		this.chucvu = chucvu;
	}

	@Override
	public String toString() {
		return "Chức vụ : " + chucvu;
	}
	
}
