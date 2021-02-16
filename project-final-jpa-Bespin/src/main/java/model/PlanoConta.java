/**
 * 
 */
package model;

import enums.TipoLancamento;

/**
 * @author B�rbara Rodrigues, Gabriel Botelho, Guilherme Cruz, Lucas Caputo,
 *         Renan Alencar, Wesley Vicente
 *
 */
public class PlanoConta {
	private long id;
	private String descricao;
	private String login;
	private Boolean padrao;
	private TipoLancamento tipoMovimento;

	public PlanoConta(long id, String descricao, String login, Boolean padrao, TipoLancamento tipoMovimento) {
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

	public void setId(long id) {
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
