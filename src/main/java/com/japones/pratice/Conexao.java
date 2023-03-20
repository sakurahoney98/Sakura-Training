package com.japones.pratice;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	private String url;
	private String usuario;
	private String senha;
	private Connection conexao;

	public Conexao() {
		// Dados de conex�o
		url = "jdbc:postgresql://localhost:5432/japones";
		usuario = "postgres";
		senha = "postgres";

		// Tentando fazer conex�o com o banco de dados
		try {
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conex�o estabelecida");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Connection getConexao() {
		return conexao;
	}

	public static void main(String[] args) {
		Conexao con = new Conexao();
		con.getConexao();
	}

}
