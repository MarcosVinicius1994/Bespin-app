/**
 * 
 */
package dto;

import java.util.List;

import model.Conta;
import model.Lancamento;


public class ContaDto {
	private long id;
	private List<Lancamento> lancamentos;
	private double saldo;
	
	
	
	public ContaDto() {
		super();
	}

	public ContaDto(Conta conta) {
		this.id = conta.getId();
		this.lancamentos = conta.getLancamentos();
		this.saldo = conta.getSaldo();
	}
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}

	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	
}
