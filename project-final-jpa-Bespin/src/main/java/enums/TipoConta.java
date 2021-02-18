package enums;

public enum TipoConta {
	CB("Conta Banco"),
	CC("Conta Credito");
	
	private String descricao;
	
	private TipoConta(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
