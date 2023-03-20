package com.japones.pratice.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import com.japones.pratice.model.Atividade;
import com.japones.pratice.model.Caractere;
import com.japones.pratice.model.Palavra;
import com.japones.pratice.model.PalavraSorteada;

public class Controller {
	
	public final int qtde_atividades = 26;
	
	public ArrayList<Atividade> gerarListaAtividades(Connection conexao) throws SQLException{
		ArrayList<Atividade> atividades = new ArrayList<Atividade>();
		
		for(int i = 0; i < qtde_atividades; i++) 
			atividades.add(pegarAtividade((i + 1), conexao));
		
		return atividades;
		
	}
	
	public Caractere pegarCaractere(String romaji, Connection conexao) throws SQLException {
		
		Statement st;
		st = conexao.createStatement();
		String sql = "SELECT hiragana, katakana, hiragana_image, katakana_image, atividade\r\n"
				+ "	FROM public.tabela\r\n"
				+ "	WHERE romaji = '" + romaji + "';";
				
				
		ResultSet rs = st.executeQuery(sql);

		rs.next();
		
		Caractere Caractere = new Caractere();
		Caractere.setRomaji(romaji);
		Caractere.setHiragana(rs.getString(1));
		Caractere.setKatakana(rs.getString(2));
		Caractere.setHiragana_image(rs.getString(3));
		Caractere.setKatakana_image(rs.getString(4));
		Caractere.setAtividade(rs.getInt(5));
		
		return Caractere;
		
	}
	
	
	public Atividade pegarAtividade (int id_atividade, Connection conexao) throws SQLException {
		
		Statement st;
		st = conexao.createStatement();
		String sql = "SELECT romaji, hiragana, katakana, hiragana_image, katakana_image, atividade\r\n"
				+ "	FROM public.tabela\r\n"
				+ "	WHERE atividade = " + id_atividade + ";";
				
				
		ResultSet rs = st.executeQuery(sql);
		
		
		
		Atividade atividade = new Atividade();
		atividade.setId(id_atividade);
		atividade.setCaractere(gerarListaCaractere(rs));
		
		return atividade;
	}
	
	public ArrayList<Caractere> pegarRevisao(int atividade_atual, Connection conexao) throws SQLException{
		

		Statement st;
		st = conexao.createStatement();
		String sql = "SELECT romaji, hiragana, katakana, hiragana_image, katakana_image, atividade\r\n"
				+ "					FROM public.tabela\r\n"
				+ "				WHERE atividade >= 1 AND atividade <= " + atividade_atual +" ;";
				
				
		ResultSet rs = st.executeQuery(sql);

	
		
		
		return gerarListaCaractere(rs);
	}
	
	public ArrayList<Caractere> gerarListaCaractere(ResultSet rs) throws SQLException{
		ArrayList<Caractere> aux = new ArrayList<Caractere>();
		
		while(rs.next()) {
			Caractere caractere = new Caractere();
			caractere.setRomaji(rs.getString(1));
			caractere.setHiragana(rs.getString(2));
			caractere.setKatakana(rs.getString(3));
			caractere.setHiragana_image(rs.getString(4));
			caractere.setKatakana_image(rs.getString(5));
			caractere.setAtividade(rs.getInt(6));
			aux.add(caractere);
			
		}
		
		return aux;
	}
	
	
	public Caractere sortearCaractere (ArrayList<Caractere> lista) {
		Random random = new Random();
		
		int sort = random.nextInt(lista.size());
		
		return lista.get(sort);
		
		
	}
	
public PalavraSorteada sortearPalavraHiragana(ArrayList<Caractere> lista) {
	
Random random = new Random();

int max_silabas = random.nextInt(5) + 1;

PalavraSorteada palavra = new PalavraSorteada();

for (int i = 0; i < max_silabas; i++) {
	Caractere c = sortearCaractere(lista);
	palavra.setPalavra(palavra.getPalavra() + c.getHiragana());
	palavra.setResposta(palavra.getResposta() + c.getRomaji());
}


return palavra;
}

public PalavraSorteada sortearPalavraKatakana(ArrayList<Caractere> lista) {
	
Random random = new Random();

int max_silabas = random.nextInt(5) + 1;

PalavraSorteada palavra = new PalavraSorteada();

for (int i = 0; i < max_silabas; i++) {
	Caractere c = sortearCaractere(lista);
	palavra.setPalavra(palavra.getPalavra() + c.getKatakana());
	palavra.setResposta(palavra.getResposta() + c.getRomaji());
}


return palavra;
}

public PalavraSorteada sortearPalavraRomajiHiragana(ArrayList<Caractere> lista) {
	
Random random = new Random();

int max_silabas = random.nextInt(5) + 1;

PalavraSorteada palavra = new PalavraSorteada();

for (int i = 0; i < max_silabas; i++) {
	Caractere c = sortearCaractere(lista);
	String aux = c.getRomaji();
	String aux2 = c.getHiragana();
	palavra.setPalavra(palavra.getPalavra() + " " + c.getRomaji());
	palavra.setResposta(palavra.getResposta() + " " + c.getHiragana());
}


return palavra;
}

public PalavraSorteada sortearPalavraRomajiKatakana(ArrayList<Caractere> lista) {
	
Random random = new Random();

int max_silabas = random.nextInt(5) + 1;

PalavraSorteada palavra = new PalavraSorteada();

for (int i = 0; i < max_silabas; i++) {
	Caractere c = sortearCaractere(lista);
	
	palavra.setPalavra(palavra.getPalavra() + " " + c.getRomaji());
	palavra.setResposta(palavra.getResposta() + " " + c.getKatakana());
}


return palavra;
}


public Palavra sortearPalavraIntermediario(ArrayList<Palavra> lista) throws SQLException {
	
	
	
	Random random = new Random();
	
	return lista.get(random.nextInt(lista.size()));
}

public ArrayList<Palavra> gerarOpcoes(ArrayList<Palavra> lista, Palavra palavra){
	ArrayList<Palavra> opcoes = new ArrayList<Palavra>();
	
	Random random = new Random();
	int pos = 0;
	
	for(int i = 0; i < 3; ) {
		pos = random.nextInt(lista.size());
		if(!lista.get(pos).getPortugues().equals(palavra.getPortugues()) && !opcoes.contains(lista.get(pos))) {
			i++;
		opcoes.add(lista.get(pos));
		}
	}
	
	return opcoes;
}


public ArrayList<Palavra> gerarListaPalavra(Connection conexao, int num_silabas) throws SQLException{
	
	Statement st;
	st = conexao.createStatement();
	String sql ="";
	
	if(num_silabas == 0)
	sql = "SELECT portugues, romaji, hiragana, katakana, num_silabas\r\n"
			+ "	FROM public.intermediario;";
	else
		sql = "SELECT portugues, romaji, hiragana, katakana, num_silabas\r\n"
				+ "	FROM public.intermediario "
				+ "WHERE num_silabas = " + num_silabas;
			
			
	ResultSet rs = st.executeQuery(sql);
	
	
	ArrayList<Palavra> lista = new ArrayList<Palavra>();
	
	while(rs.next()) {
		Palavra p = new Palavra();
		
		p.setPortugues(rs.getString(1));
		p.setRomaji(rs.getString(2));
		p.setHiragana(rs.getString(3));
		p.setKatakana(rs.getString(4));
		p.setSilabas(rs.getInt(5));
		
		lista.add(p);
	}
	return lista;
}

}
