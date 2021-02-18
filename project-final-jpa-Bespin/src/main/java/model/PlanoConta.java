package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import enums.TipoLancamento;

@Entity
@Table(name = "tab_planoConta")
public class PlanoConta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 200)
	private String descricao;
	
	@Column(nullable = false, length = 20)
	private String login;
	
	@Column(nullable = false)
	private Boolean padrao;
	
	private TipoLancamento tipoMovimento;

	public PlanoConta(Integer id, String descricao, String login, Boolean padrao, TipoLancamento tipoMovimento) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.login = login;
		this.padrao = padrao;
		this.tipoMovimento = tipoMovimento;
	}

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Boolean getPadrao() {
		return padrao;
	}

	public void setPadrao(Boolean padrao) {
		this.padrao = padrao;
	}

	public TipoLancamento getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(TipoLancamento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

}
