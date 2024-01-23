package iuh.fit.chopper;

import java.util.Arrays;

public class QuanLyCD {
	private String TenBoQuanLyCD;
	private int soCD = 0;
	private CD[] cds;
	
	public QuanLyCD(String TenBoQuanLyCD,int soCD1) {
		super();
		if(TenBoQuanLyCD == null) {
			throw new IllegalArgumentException("Ten bo quan ly khong duoc rong!!");
		}
		this.TenBoQuanLyCD = TenBoQuanLyCD;
		if(soCD < 0) {
			throw new IllegalArgumentException("So CD khong duoc < 0");
		}
		this.cds = new CD[soCD1];
		this.soCD = 0;
	}

	public boolean findCD(long maCD) {
		for(int i = 0;i < soCD;i++) {
			if(cds[i].getMaCD() ==  maCD)
				return true;
		}
		return false;
	}
	
	public void addNewCD(long maCD, String tenCD, long sobaihat, float giathanh) {
		if(findCD(maCD)) {
			throw new IllegalArgumentException("Trung ma CD!!!");
		}
		if(soCD == cds.length) {
			throw new IllegalArgumentException("Mang CD da day!!!");
		}
		CD cd1 = new CD(maCD,tenCD,sobaihat,giathanh);
		cds[soCD++] = cd1;
	}
	
	public int laysoCD() {
		return soCD;
	}
	public float tongGiaThanhCD() {
		float Tong = 0;
		for(int i = 0;i < soCD;i++) {
			Tong += cds[i].getGiathanh();
		}
		return Tong;
	}
	
	public void sortGT() {
		for(int i = 0;i < soCD - 1;i++) {
			for(int j = 1;j < soCD;j++) {
				if(cds[i].getGiathanh() < cds[j].getGiathanh()) {
					CD tmp = cds[i];
					cds[i] = cds[j];
					cds[j] = tmp;
				}
			}
		}
	}
	
	public void sortTCD() {
		for(int i = 0;i < soCD - 1;i++) {
			for(int j = 1;j < soCD;j++) {
				String n1 = cds[j].getTenCD();
				if(cds[i].getTenCD().compareTo(n1) > 0) {
					CD tmp = cds[i];
					cds[i] = cds[j];
					cds[j] = tmp;
				}
			}
		}
	}

	public String getTenBoQuanLyCD() {
		return TenBoQuanLyCD;
	}

	public void setTenBoQuanLyCD(String tenBoQuanLyCD) {
		TenBoQuanLyCD = tenBoQuanLyCD;
	}

	@Override
	public String toString() {
		return "QuanLyCD [TenBoQuanLyCD=" + TenBoQuanLyCD + ", soCD=" + soCD + ", cds=" + Arrays.toString(cds) + "]";
	}

	
	
}
