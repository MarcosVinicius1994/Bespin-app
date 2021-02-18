package service;

import dto.UsuarioDto;
import enums.TipoConta;
import model.Conta;
import model.Usuario;

public class CadastroService {
	public void Cadastrar(UsuarioDto usuarioDto) {
		UsuarioService usuarioService = new UsuarioService();
		ContaService contaService = new ContaService();
		
		Usuario usuario = new Usuario(usuarioDto);
		boolean sucesso = usuarioService.AddUser(usuario);
		if(sucesso) {
			//Primeiro temos que criar a conta de d�bito			
			Conta contaDebito = new Conta("Conta D�bito", usuario.getLogin(), TipoConta.CB);
			contaService.addConta(contaDebito);
			
			//Agora criamos a conta de cr�dito
			Conta contaCredito = new Conta("Conta Cr�dito", usuario.getLogin(), TipoConta.CC);
			contaService.addConta(contaCredito);			
		}
		else {
			System.out.println("Já existe usuário com esse login");
		}
	}
}
