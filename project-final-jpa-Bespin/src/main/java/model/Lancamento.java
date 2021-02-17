/**
 * 
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import enums.TipoConta;

@Entity
@Table(name = "tab_conta")
public class Lancamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private Integer idConta;
	
	@Column(nullable = false, length = 10)
	private String data;
	
	@Column(length = 200)
	private String descricao;
	
	@Column(nullable = false, length = 20)
	private PlanoConta planoConta;
	
	@Column(nullable = false, length = 10)
	private TipoConta tipoConta;
	
	@Column(nullable = false, length = 20, precision = 9, scale = 2)
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
