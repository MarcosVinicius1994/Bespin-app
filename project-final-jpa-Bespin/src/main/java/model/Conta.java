/**
 * 
 */
package model;

import java.util.List;

import enums.TipoConta;


public class Conta {
	private int id;
	private String descricao;
	private String loginUsuario;
	private double saldo = 0;
	private TipoConta tipoConta;
	private List<Lancamento> lancamentos;	
	
	public Conta(int id, String descricao, String loginUsuario, double saldo, TipoConta tipoConta) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.loginUsuario = loginUsuario;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}
	
	public Conta(String descricao, String loginUsuario, TipoConta tipoConta) {
		super();		
		this.descricao = descricao;
		this.loginUsuario = loginUsuario;		
		this.tipoConta = tipoConta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}

	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}

}
