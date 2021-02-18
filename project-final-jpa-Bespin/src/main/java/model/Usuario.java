/**
 * 
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import dto.UsuarioDto;

@Entity
@Table(name = "tab_usuario")
public class Usuario {
	
	@Column(nullable = false, length = 20)
	private String login;
	
	@Column(nullable = false, length = 20)
	private String senha;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false, length = 11)
	private String cpf;

	public Usuario() {
		
	}
	
	public Usuario(int id, String login, String senha, String nome, String cpf) {
		super();
		
		
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Usuario(UsuarioDto usuarioDto) {
		this.login = usuarioDto.getLogin();
		this.senha = usuarioDto.getSenha();
		this.nome = usuarioDto.getNome();
		this.cpf = usuarioDto.getCpf();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", nome=" + nome + ", cpf=" + cpf + "]";
	}

}
