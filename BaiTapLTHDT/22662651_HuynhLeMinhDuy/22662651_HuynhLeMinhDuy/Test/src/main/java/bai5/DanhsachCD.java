package bai5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DanhsachCD {
	
	private CD[] dsCD;
	private int n = 0;
	
	public DanhsachCD() {
		this(10);
	}

	public DanhsachCD(int soPhantu) {
		dsCD = new CD[soPhantu];
	}
	
	
	public void themCD(CD cd) {
		
		int i = timTheoMaCD(cd);
		if(i >= 0)
			throw new IllegalArgumentException("Trùng mã CD");
		
//		if(n == dsCD.length)
//			throw new IllegalArgumentException("Mảng đầy");
		
		if(n == dsCD.length) { //Mảng đầy, tăng kích thước mảng lên 1.5
			int newLength = (int) (dsCD.length * 1.5);
			dsCD = Arrays.copyOf(dsCD, newLength);
		}
		
		dsCD[n++] = cd;
	}
	
	public void capnhatCD(CD cdNew) {
		int i = timTheoMaCD(cdNew);
		if(i < 0)
			throw new IllegalArgumentException("Không tồn tại CD có mã " + cdNew.getMaCD());
		
		CD temp = dsCD[i];
		temp.setTuaCD(cdNew.getTuaCD());
		temp.setSoBaihat(cdNew.getSoBaihat());
		temp.setDongia(cdNew.getDongia());
	}
	
	public void xoaCD(int maCD) {
		CD cd = new CD(maCD);
		int i = timTheoMaCD(cd);
		
		if(i < 0)
			throw new IllegalArgumentException("Không tồn tại CD có mã " + maCD);
		
		dsCD = Stream.concat(Arrays.stream(dsCD, 0, i), Arrays.stream(dsCD, i+1, n)).toArray(x -> new CD[x]);
		n--;
	}
	
	public void themDSCD(CD[] dscd) {
	}
	
	public CD[] getDSCD() {
		return dsCD;
	}
	
	public int getSoluongCD() {
		return n;
	}
	
	private int timTheoMaCD(CD cd) {
		return Arrays
				.binarySearch(dsCD, 0, n, cd, Comparator.comparing(CD::getMaCD));
	}
	
	public double getTongDongia() {
		return Arrays
				.stream(dsCD, 0, n)
				.collect(Collectors.summingDouble(CD::getDongia));
	}
	
	public void sapxepTheoDongiaGiam() {
		Arrays
		.sort(dsCD, 0, n, Comparator.comparing(CD::getDongia).reversed());
	}
	
	public void sapxepTheoTuaCD() {
		Arrays
		.sort(dsCD, 0, n, Comparator.comparing(CD::getTuaCD));
	}
	
}
