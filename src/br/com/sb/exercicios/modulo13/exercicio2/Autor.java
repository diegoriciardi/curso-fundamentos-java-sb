package br.com.sb.exercicios.modulo13.exercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Date;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.IOException;



public class Autor implements Recordable {

	private String nome;
	private LocalDate dataNascimento;
	
	public Autor(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		
		Scanner scanner = new Scanner(new InputStreamReader(in));		
		
		while(scanner.hasNext()) {
			
			String[] partes = scanner.nextLine().split(",");
			
			int numeroInformacoes = 2;
			
			for (int i = 0; i < (partes.length) / numeroInformacoes ; i++) {
				
				String nome_ = partes[0];
				LocalDate ldt = LocalDate.parse(partes[1], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				
				System.out.println(new Autor(nome_, ldt).toString());
				
			}
			
		}
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		out.writeBytes(getNome());
		out.writeBytes(",");
		out.writeBytes(getDataNascimento().toString());
		out.writeBytes("\n");
	}
	
	public String toString() {
		
		String resultado = "nome: " + getNome() + " - data de nascimento: " + getDataNascimento();
		return resultado;
		
	}
	
}
