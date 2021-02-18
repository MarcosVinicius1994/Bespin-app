package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	private static String serverName = "localhost";    //caminho do servidor do BD
	private static String mydatabase = "bespin";        //nome do seu banco de dados
	private static String porta = ":3306";        //porta do seu banco de dados
	private static String useTimezone = "true";
	private static String serverHora = "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String url = "jdbc:mysql://" + serverName + porta+  "/" + mydatabase +"?" + serverHora ;
	private static String username = "root";        //nome de um usuário de seu BD      
	private static String password = "";      //sua senha de acesso
	private static Connection connection = null;
	static {
		conectar();
	}
	private static void conectar() {
		try {

			if(connection == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = (Connection) DriverManager.getConnection(url, username, password);
				((java.sql.Connection) connection).setAutoCommit(false);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao conectar com o banco de dados");
		}
		
	}

	public static Connection getConnection() {
		return connection;
	}
}
