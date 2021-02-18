package service;

import model.Usuario;
import repository.UsuarioRepository;


/**
 * @author B�rbara Rodrigues, Gabriel Botelho, Guilherme Cruz, Lucas Caputo, Renan Alencar, Wesley Vicente
 *
 */
public class UsuarioService {		
	UsuarioRepository usuarioRepository;
	public boolean AddUser(Usuario usuario) {
		usuarioRepository = new UsuarioRepository();
		return usuarioRepository.AddUser(usuario);
	}
}