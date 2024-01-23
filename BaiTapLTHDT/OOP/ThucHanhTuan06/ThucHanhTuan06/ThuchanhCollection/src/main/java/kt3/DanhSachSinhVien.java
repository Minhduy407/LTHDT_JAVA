package kt3;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class DanhSachSinhVien {
	private SinhVien[] dssv;
	private int n = 0;

	public DanhSachSinhVien() {
		dssv = new SinhVien[10];
	}

	public void themSinhVien(SinhVien sv) {
		dssv[n++] = sv;
	}

	public SinhVien[] getDssv() {
		return dssv;
	}

//	Không thông qua Map
	public String[] getTenPhoBien() {

		AtomicLong max = new AtomicLong(0l);

//		Tìm số lượng xuất hiện nhiều nhất của tên
		String ten = dssv[0].getTensv();		
		max.set(demSoLanXuatHien(ten));

		for(int i = 1; i < n; i++) 
			if(max.get() < demSoLanXuatHien(dssv[i].getTensv())){
				ten = dssv[i].getTensv();
				max.set(demSoLanXuatHien(ten));
			}

//		Lấy lại những tên có số lần xuất hiện nhiều nhất
		return Arrays.stream(dssv, 0, n)
				.filter(sv -> demSoLanXuatHien(sv.getTensv()) == max.get())
				.map(sv -> sv.getTensv().toUpperCase())
//				.map(sv -> {
//					String x = sv.getTensv();
//					return Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase();
//				})
				.distinct()
				.toArray(x -> new String[x]);
	}

	/**
	 * Phương thức đếm số lần xuất hiện của 1 tên trong danh sách sinh viên
	 * @param ten
	 * @return
	 */
	private long demSoLanXuatHien(String ten) {
		return Arrays.stream(dssv, 0, n)
				.filter(x -> x.getTensv().equalsIgnoreCase(ten))
				.count();
	}


//	Dùng Map
	public String[] getTenPhoBien2() {
		Map<String, Long> temp = 
				Arrays.stream(dssv, 0, n)
				.collect(Collectors.groupingBy(sv -> sv.getTensv().toUpperCase(), Collectors.counting()));

		long max = temp
				.entrySet()
				.stream()
				.mapToLong(x -> x.getValue())
				.max()
				.getAsLong();

		return temp.entrySet()
				.stream()
				.filter(x -> x.getValue() == max)
				.map(Entry::getKey)
				.toArray(x -> new String[x]);
	}


	public int getSoLuong() {
		return n;
	}
}
