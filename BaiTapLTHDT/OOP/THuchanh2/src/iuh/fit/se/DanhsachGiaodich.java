package iuh.fit.se;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DanhsachGiaodich {
	private List<GiaoDich> dsGD;
	
	public DanhsachGiaodich() {
		dsGD = new ArrayList<GiaoDich>();
	}

	public void themGiaoDich(GiaoDich gd) {
		if(dsGD.contains(gd))
			throw new IllegalArgumentException("Trùng mã giao dịch");
		
		dsGD.add(gd);
	}
	
	public GiaoDich timGiaoDich(String maGD) {
		return dsGD.stream()
				.filter(gd -> gd.getMaGD().equalsIgnoreCase(maGD))
				.findFirst()
				.orElse(null);
	}
	
	public Map<String, Integer> getTongSoLuong() {
		return dsGD.stream()
				.collect(Collectors.groupingBy(x -> x.getClass().getSimpleName(), Collectors.summingInt(GiaoDich::getSoLuong)));
	}
	
	public List<GiaoDich> getDSGDTheoDonGia(double donGia) {
		return dsGD.stream()
				.filter(gd -> gd.getDonGia() > donGia)
				.collect(Collectors.toCollection(ArrayList::new));
	}
	
	public List<GiaoDich> getDSGD() {
		return dsGD;
	}
}
