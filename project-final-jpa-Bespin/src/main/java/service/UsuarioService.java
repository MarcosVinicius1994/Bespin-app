package service;

import model.Usuario;
import repository.UsuarioRepository;


public class UsuarioService {		
	
	UsuarioRepository usuarioRepository;
	
	public boolean AddUser(Usuario usuario) {
		
		usuarioRepository = new UsuarioRepository();
		
		
		return usuarioRepository.AddUser(usuario);	
	}
}