package jdbc;


import jdbc.FabricaConexao;

public class Sistema {
	public static void main(String[] args) {
	System.out.println("main");
		FabricaConexao.getConnection();
	}
}

