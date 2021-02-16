/**
 * 
 */
package model;

import enums.TipoConta;


public class Lancamento {
	private int id;
	private int idConta;
	private String data;
	private String descricao;
	private PlanoConta planoConta;
	private TipoConta tipoConta;
	private double valor;

	public Lancamento(int id, int idConta, String data, String descricao, PlanoConta planoConta, TipoConta tipoConta,
			double valor) {
		super();
		this.id = id;
		this.idConta = idConta;
		this.data = data;
		this.descricao = descricao;
		this.planoConta = planoConta;
		this.tipoConta = tipoConta;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public PlanoConta getPlanoConta() {
		return planoConta;
	}

	public void setPlanoConta(PlanoConta planoConta) {
		this.planoConta = planoConta;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
