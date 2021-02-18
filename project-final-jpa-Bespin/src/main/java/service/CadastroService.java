package service;

import dto.UsuarioDto;
import enums.TipoConta;
import model.Conta;
import model.Usuario;

public class CadastroService {
	
	public void Cadastrar(UsuarioDto usuarioDto) {
		
		UsuarioService usuarioService = new UsuarioService();
		Usuario usuario = new Usuario(usuarioDto);
		ContaService contaService = new ContaService();
		
		boolean success = usuarioService.AddUser(usuario);

		if(success) {
			Conta contaDebito = new Conta(
					"Conta Debito", usuario.getLogin(), TipoConta.CoBa);
					contaService.addConta(contaDebito);
			
			Conta contaCredito = new Conta(
					"Conta Crédito", usuario.getLogin(), TipoConta.CoCr);
					contaService.addConta(contaCredito);	
		}
		else {
			System.out.println("Login existente!");
		}
	}
}
