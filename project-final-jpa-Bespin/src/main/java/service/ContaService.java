package service;

import enums.TipoConta;
import model.Conta;
import repository.ContaRepository;

public class ContaService {
	ContaRepository contaRepository;
	public void addConta(Conta conta) {
		contaRepository = new ContaRepository();
		contaRepository.addConta(conta);		
	}
	
	public Conta getConta(String login, TipoConta tipoConta) {
		contaRepository = new ContaRepository();
		return contaRepository.getConta(login, tipoConta);
	}
}
