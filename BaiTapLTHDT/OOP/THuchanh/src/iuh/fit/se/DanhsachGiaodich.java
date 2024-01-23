package iuh.fit.se;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DanhsachGiaodich {
	private GiaoDich[] dsGD;
	private int n = 0;
	
	public DanhsachGiaodich() {
		this(10);
	}

	public DanhsachGiaodich(int soPhanTu) {
		if(soPhanTu <= 0)
			throw new IllegalArgumentException("Số phần tử mảng > 0");
		
		dsGD = new GiaoDich[soPhanTu];
	}
	
	public void themGiaoDich(GiaoDich gd) {
		GiaoDich temp = timGiaoDich(gd.maGD);
		if(temp != null)
			throw new IllegalArgumentException("Trùng mã giao dịch");
		
		if(n == dsGD.length)
			tangKichThuocMang();
		
		dsGD[n++] = gd;
	}
	
	private void tangKichThuocMang() {
		int newLength = dsGD.length * 2;
		dsGD = Arrays.copyOf(dsGD, newLength);
	}

	public GiaoDich timGiaoDich(String maGD) {
		return Arrays.stream(dsGD, 0, n)
				.filter(gd -> gd.getMaGD().equalsIgnoreCase(maGD))
				.findFirst()
				.orElse(null);
	}
	
	public Map<String, Integer> getTongSoLuong() {
		return Arrays.stream(dsGD, 0, n)
				.collect(Collectors.groupingBy(x -> x.getClass().getSimpleName(), Collectors.summingInt(GiaoDich::getSoLuong)));
	}
	
	public int getTongSoLuongTien() {
		return Arrays.stream(dsGD, 0, n)
				.filter(gd -> gd instanceof GiaoDichTienTe)
//				.mapToInt(GiaoDich::getSoLuong)
//				.sum();
				.collect(Collectors.summingInt(GiaoDich::getSoLuong));
	}
	
	public int getTongSoLuongVang() {
		return Arrays.stream(dsGD, 0, n)
				.filter(gd -> gd instanceof GiaoDichVang)
//				.mapToInt(GiaoDich::getSoLuong)
//				.sum();
				.collect(Collectors.summingInt(GiaoDich::getSoLuong));
	}
	
	public double getTBThanhTienGDTien() {
		return Arrays.stream(dsGD, 0, n)
				.filter(x -> x instanceof GiaoDichTienTe)
//				.mapToDouble(gd -> gd.getThanhtien())
//				.average()
//				.getAsDouble();
				.collect(Collectors.averagingDouble(GiaoDich::getThanhtien));
	}
	
	public GiaoDich[] getDSGDTheoDonGia(double donGia) {
		return Arrays.stream(dsGD, 0, n)
				.filter(gd -> gd.getDonGia() > donGia)
				.toArray(x -> new GiaoDich[x]);
	}
	
	public GiaoDich[] getDSGD() {
		return Arrays.copyOf(dsGD, n);
	}
}
