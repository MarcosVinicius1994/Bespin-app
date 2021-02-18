package sistema;

import dto.LoginDto;
import dto.UsuarioDto;
import service.CadastroService;
import service.LoginService;

public class Sistema {

	public static void main(String[] args) {
		
		LoginService loginService = new LoginService();
		CadastroService cadastroService = new CadastroService();
		
		
		/*Rout Cadastro	
		 * Login
		 */
		cadastroService.Cadastrar(
			new UsuarioDto(
			"00000000", "Nome Completo de Alguem", "NomeCompleto", "Nome000"));
		
		System.out.println(
			loginService.Logar(
				new LoginDto(
						"GabrielBotelho", "Gabriel123")).toString());
		
		
	}

}
