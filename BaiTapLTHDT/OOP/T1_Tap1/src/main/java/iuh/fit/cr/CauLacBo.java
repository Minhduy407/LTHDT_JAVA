package iuh.fit.cr;

import java.util.List;
import java.util.Set;

public interface CauLacBo {
	boolean them(Nguoi x);
	boolean xoa(String ma);
	List<Nguoi> dsU23(int tu,int den);
	Set<CauThu> dssapxep();
}
