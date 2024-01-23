package ktpm18a.main;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import ktpm18a.duy.*;

public class QuanLyKhachHang {
	private Queue<KhachHang> khs;
	private List<KhachHang> dsVedaban;
	
	/**
	 * @param khs
	 */
	public QuanLyKhachHang() {
		khs = new LinkedList<>();
		dsVedaban = new ArrayList<>();
	}

	/**
	 * @return the khs
	 */
	public Queue<KhachHang> getKhs() {
		return khs;
	}
	
	public List<KhachHang> getDsve(){
		return dsVedaban;
	}
	
	
	/**
	 * Thêm một khách hàng mới vào hàng đợi mua vé
	 * @return
	 */
	public void themkhach(KhachHang x) {
		KhachHang tmp1 = timkh1(x.getCmnd());
		KhachHang tmp2 = timkh2(x.getCmnd());
		
		if(tmp1 == null && tmp2 == null)
			khs.add(x);
		else if(tmp1 == null && tmp2 != null) {
			x.setTen(tmp2.getTen());
			khs.add(x);
		}
		else {
			tmp1.setGaden(x.getGaden());
			tmp1.setGiatien(x.getGiatien());
		}
	}
	
	/**
	 * Bán một vé cho khách hàng. Chỉ bán cho người đăng ký trước.
	 * @return
	 */
	public KhachHang banve() {
		KhachHang x = khs.poll();
		if(x != null)
			dsVedaban.add(x);
		return x;
	}
	
	public KhachHang timkh1(String ma) {
		return khs.stream()
				.filter(x -> x.getCmnd().equalsIgnoreCase(ma))
				.findFirst()
				.orElse(null);
	}
	
	public KhachHang timkh2(String ma) {
		return dsVedaban.stream()
				.filter(x -> x.getCmnd().equalsIgnoreCase(ma))
				.findFirst()
				.orElse(null);
	}
	
	public int tongveKHcho() {
		return khs.size();
	}
	
	public int tongveKHdamua() {
		return dsVedaban.size();
	}
	
	public double tongtienbanve() {
		return dsVedaban.stream()
				.collect(Collectors.summingDouble(KhachHang::getGiatien));
	}
	
	public int tongKHdamuave() {
		return (int)dsVedaban.stream()
				.map(KhachHang::getCmnd)
				.distinct()
				.count();
	}
	
	public boolean xoakh(String ma) {
		KhachHang x = timkh1(ma);
		if(x != null)
			return khs.remove(x);
		return false;
	}
	
	public Set<String> dsga(){
		return khs.stream()
				.map(x -> x.getGaden().toUpperCase())
				.distinct()
				.collect(Collectors.toSet());
	}
	
	public Map<String, Long> showdsga(){
		return khs.stream()
				.map(x -> x.getGaden().toUpperCase())
				.collect(Collectors.groupingBy(x -> x,Collectors.counting()));
	}
	
	public void luufile() {
		try(
				FileWriter file = new FileWriter("data/dslk.txt");
				PrintWriter out = new PrintWriter(file);
				){
				khs.forEach(kh -> out.print(kh));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
