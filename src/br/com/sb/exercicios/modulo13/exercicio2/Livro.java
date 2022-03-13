package br.com.sb.exercicios.modulo13.exercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Livro implements Recordable {
	
	private String titulo;
	private int numeroPaginas;
	private Autor autor;
	
	public Livro(String titulo, int numeroPaginas, Autor autor) {
		this.titulo = titulo;
		this.numeroPaginas = numeroPaginas;
		this.autor = autor;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	public Autor getAutor() {
		return this.autor;
	}
	
	public String toString() {
		
		String resultado = "titulo: " + getTitulo() + " - numero de Páginas: " + getNumeroPaginas() + " - Autor: " + getAutor().getNome();
		
		return resultado;
		
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		
		Scanner scanner = new Scanner(new InputStreamReader(in));		
		
		while(scanner.hasNext()) {
			
			String[] partes = scanner.nextLine().split(",");
			
			int numeroInformacoes = 4;
			
			for (int i = 0; i < (partes.length) / numeroInformacoes; i++) {
				
				String titulo_ = partes[0];
				int numero_ = Integer.parseInt(partes[1]);
				String nomeAutor_ = partes[2];
				LocalDate ldt = LocalDate.parse(partes[3], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				
				System.out.println(new Livro(titulo_, numero_, new Autor(nomeAutor_, ldt)).toString());
				
			}
			
		}
		
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeBytes("\"" + getTitulo() + "\"");
		out.writeBytes(",");
		out.writeBytes(getNumeroPaginas() + "");
		out.writeBytes(",");
		out.writeBytes(getAutor().getNome());
		out.writeBytes(",");
		out.writeBytes(getAutor().getDataNascimento().toString());
		out.writeBytes("\n");
	}

}
