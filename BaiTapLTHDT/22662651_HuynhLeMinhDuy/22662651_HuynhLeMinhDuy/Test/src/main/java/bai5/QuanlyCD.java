package bai5;

import java.util.Arrays;

public class QuanlyCD {
	public static void main(String[] args) {
		
		DanhsachCD ds = new DanhsachCD(5);
		CD cd1, cd2, cd3, cd4;
		ds.themCD(cd1 = new CD(1, "abc", 10, 100000.0));
		ds.themCD(cd2 = new CD(2, "xbc", 10, 300000.0));
		ds.themCD(cd3 = new CD(3, "abc", 10, 200000.0));
		ds.themCD(cd4 = new CD(4, "zdf", 10, 500000.0));
		ds.themCD(cd4 = new CD(5, "tdf", 10, 400000.0));
		ds.themCD(cd4 = new CD(6, "rdf", 10, 700000.0));
		ds.themCD(cd4 = new CD(7, "sdf", 10, 10000.0));
		ds.themCD(cd4 = new CD(8, "odf", 10, 900000.0));
	
		ds.capnhatCD(new CD(7, "Mùa thu lá rụng", 15, 150000));
		ds.xoaCD(7);
		
//		Arrays.stream(ds.getDSCD()).forEach(x -> System.out.println(x));
		Arrays.stream(ds.getDSCD(), 0, ds.getSoluongCD()).forEach(x -> System.out.println(x));
		
//		System.out.println("Tong don gia: " + ds.getTongDongia());
//		
////		ds.sapxepTheoDongiaGiam();
//		ds.sapxepTheoTuaCD();
//		Arrays.stream(ds.getDSCD(), 0, ds.getSoluongCD()).forEach(x -> System.out.println(x));
		
	}
}
