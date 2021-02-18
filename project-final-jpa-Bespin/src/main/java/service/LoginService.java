package service;

import dto.ContaDto;
import dto.LoginDto;
import dto.SessaoDto;
import dto.UsuarioDto;
import enums.TipoConta;
import model.Conta;
import model.Usuario;
import repository.ContaRepository;
import repository.UsuarioRepository;

public class LoginService {
	UsuarioRepository usuarioRepository;
	ContaRepository contaRepository;
	public SessaoDto Logar(LoginDto loginDto) {
		SessaoDto sessaoDto = new SessaoDto();
		usuarioRepository = new UsuarioRepository();
		contaRepository = new ContaRepository();
		Usuario usuario = usuarioRepository.getUser(loginDto.getUsuario(), loginDto.getSenha());
		sessaoDto.setUsuario(new UsuarioDto(usuario));//Precisa Implementar na classe
		Conta contaDebito = contaRepository.getConta(loginDto.getUsuario(), TipoConta.CB);		
		sessaoDto.setContaDebito(new ContaDto(contaDebito));//Precisa Implementar na classe
		Conta contaCredito = contaRepository.getConta(loginDto.getUsuario(), TipoConta.CC);
		sessaoDto.setContaCredito(new ContaDto(contaCredito));//Precisa Implementar na classe
		return sessaoDto;
	}
}
