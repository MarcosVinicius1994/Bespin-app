package enums;

public enum TipoConta {
	CoBa("Conta Banco"),
	CoCr("Conta Credito");
	
	private String desc;
	
	private TipoConta(String descricao) {
		this.desc = descricao;
	}
	
	public String getDescricao() {
		return desc;
	}
}
