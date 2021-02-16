/**
 * 
 */
package model;

import dto.UsuarioDto;


public class Usuario {
	private String login;
	private String senha;
	private String nome;
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
