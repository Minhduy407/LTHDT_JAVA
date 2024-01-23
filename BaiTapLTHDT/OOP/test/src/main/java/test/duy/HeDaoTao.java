package test.duy;

public enum HeDaoTao {
	CHINH_QUY("Chính quy"), LIEN_THONG("Liên thông"), TU_XA("Từ xa"), LIEN_KET("Liên kết");
	
	private String heDaotao;

	private HeDaoTao(String heDaotao) {
		this.heDaotao = heDaotao;
	}
	
	@Override
	public String toString() {
		return heDaotao;
	}
}

