package iuh.fit.chopper;

public class CD {
	private long maCD = 999999;
	private String tenCD = "chua xac dinh";
	private long sobaihat;
	private double giathanh;
	
	
	public CD() {
		this(999999,"chua xac dinh",0,0);
	}

	public CD(long maCD, String tenCD, long sobaihat, double giathanh) {
		super();
		this.setMaCD(maCD);
		this.setTenCD(tenCD);
		this.setSobaihat(sobaihat);
		this.setGiathanh(giathanh);
	}
	
	public long getMaCD(){
		return maCD;
	}
	public void setMaCD(long maCD) {
		if(maCD <= 0) {
			throw new IllegalArgumentException("Ma CD > 0");
		}
		this.maCD = maCD;
	}
	public String getTenCD() {
		return tenCD;
	}
	public void setTenCD(String tenCD) {
		if(tenCD == null) {
			throw new IllegalArgumentException("Ten CD khong duoc rong!");
		}
		this.tenCD = tenCD;
	}
	public long getSobaihat() {
		return sobaihat;
	}
	public void setSobaihat(long sobaihat) {
		if(sobaihat <= 0) {
			throw new IllegalArgumentException("So bai hat > 0");
		}
		this.sobaihat = sobaihat;
	}
	public double getGiathanh() {
		return giathanh;
	}
	public void setGiathanh(double giathanh) {
		if(giathanh <= 0) {
			throw new IllegalArgumentException("Gia thanh CD > 0");
		}
		this.giathanh = giathanh;
	}

	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tenCD=" + tenCD + ", sobaihat=" + sobaihat + ", giathanh=" + giathanh + "]";
	}
	
}
