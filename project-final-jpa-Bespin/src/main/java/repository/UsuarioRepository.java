package repository;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioRepository {
	
	public List<Usuario> usuarios = new ArrayList<Usuario>();	
	
	public Usuario getUser(String login) {
		
		for(Usuario usuario : usuarios) {
			
			if(usuario.getLogin().equals(login)) {
				return usuario;
			}
		}
		return null;
	}
	

	public Usuario getUser(String login, String senha) {
		
		Usuario usuarioLogado = new Usuario();
		
		for(Usuario usuario : usuarios) {
			if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
				return usuarioLogado;
			}
		}	
		return null;
	}
	
	
	public boolean AddUser(Usuario usuario) {
		
		Usuario usuarioRepetido = this.getUser(usuario.getLogin());
			
			if(usuarioRepetido == null) {
				usuarios.add(usuario);
				return true;
			}		
			else {
				return false;
			}		
	}
}
