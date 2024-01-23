package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import entity.BenhNhan;
import entity.CaNhan;

public class DanhSachCaNhan {
	private List<CaNhan> dsCaNhan;

	public DanhSachCaNhan() {
		dsCaNhan = new ArrayList<CaNhan>();
	}

	public List<CaNhan> getDsCaNhan() {
		return dsCaNhan;
	}

	public boolean themSoDienThoai(String maSo, String soDienThoaiMoi) {

		CaNhan temp = dsCaNhan.stream()
				.filter(cn -> cn.getMaSo().equalsIgnoreCase(maSo))
				.findFirst()
				.orElse(null);

		if(temp == null || soDienThoaiMoi == null)
			return false;

		Set<String> dsDienThoai = null;
		if(temp.getDsSoDienThoai() == null) 
			dsDienThoai = new HashSet<>(List.of(soDienThoaiMoi));
		else {
			dsDienThoai = temp.getDsSoDienThoai();
			dsDienThoai.add(soDienThoaiMoi);			
		}

		temp.setDsSoDienThoai(dsDienThoai);

		return true;
	}

	public boolean themCaNhan(CaNhan caNhan) {
		if(caNhan == null)
			return false;
		if(dsCaNhan.contains(caNhan))
			return false;
		return dsCaNhan.add(caNhan);
	}

	public List<CaNhan> getBenhNhanLaTreCon(){
		return dsCaNhan.stream()
				.filter(x -> x instanceof BenhNhan)
//				.filter(x -> {
//					LocalDate hienTai = LocalDate.now(); 
//					BenhNhan benhNhan = ((BenhNhan) x);
//					int tuoi = (int)Math.abs(ChronoUnit.YEARS.between(benhNhan.getNgaySinh(),hienTai));
//					return tuoi < 16;
//				})
				.filter(cn -> "Trẻ em".equalsIgnoreCase(cn.ghiChu()))
				.map(cn -> (BenhNhan)cn)
				.sorted(Comparator.comparing(BenhNhan::getNgaySinh))
				.collect(Collectors.toList());

	}

	public int getSoLuongBenhNhanTreEm() {
		return (int) dsCaNhan.stream()
				.filter(cn -> cn instanceof BenhNhan)
				.filter(cn ->  "Trẻ em".equalsIgnoreCase(cn.ghiChu()))
				.count();
	}
	
	public CaNhan getCaNhan(String soDienThoai) {
		return dsCaNhan.stream()
				.filter(cn ->(cn.getDsSoDienThoai() != null && cn.getDsSoDienThoai().contains(soDienThoai)))
				.findFirst()
				.orElse(null);
	}

}
