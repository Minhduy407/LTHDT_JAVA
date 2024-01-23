package iuh.fit.ql;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import iuh.fit.cr.CauLacBo;
import iuh.fit.cr.CauThu;
import iuh.fit.cr.Nguoi;



public class QuanLyChung implements CauLacBo{
	private List<Nguoi> connguois;
	
	public QuanLyChung() {
		this.connguois = new ArrayList<>();

	}

	public List<Nguoi> getNguoi(){
		return connguois;
	}
	

	public boolean them(Nguoi x) {
		return connguois.add(x);
	}

	public boolean xoa(String ma) {
		Nguoi x = connguois.stream().filter(cn-> cn.getMa().equalsIgnoreCase(ma))
				.findFirst()
				.orElse(null);
		if(x != null) {
			connguois.remove(x);
			return true;
		}
		return false;
	}

	public List<Nguoi> dsU23(int tu,int den){
		return connguois.stream()
				.filter(cn -> cn instanceof CauThu)
				.map(cn -> (CauThu)cn)
				.filter(x -> x.tinhtuoi() >= tu && x.tinhtuoi() <= den)
				.collect(Collectors.toList());
	}
	
	public Set<CauThu> dssapxep(){
		return  connguois.stream()
				.filter(cn -> cn instanceof CauThu)
				.map(cn -> (CauThu)cn)
				.sorted(Comparator.comparing(CauThu::getNamsinh))
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}
}
