package com.br.softblue.exercicios.modulos.modulo13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;
import java.io.IOException;

public class TestesAntesExerciciosLeitura {

	public static void main(String[] args) throws IOException {
		
		/*
		 * trabalhando com tamanho fixo de buffer
		 */
	
//		try (InputStream is = new FileInputStream("entrada.txt")) {
//			
//			byte[] buffer = new byte[1024];
//			
//			int bytesLidos = is.read(buffer);
//			
//			String s = new String(buffer, 0, bytesLidos);
//			
//			System.out.println(s);
//			System.out.println(s.length());
//			System.out.println(s.length() + " tamanho total");
//			System.out.println(bytesLidos + " bytes lidos");
//		}
		
		/* trabalhando com tamanho variavel de buffer a partir de 4 bytes
		 * 
		 */
		
//		try (InputStream is = new FileInputStream("entrada.txt")) {
//			
//			byte[] buffer = new byte[4];
//			
//			int bytesLidos;
//			
//			String s = "";
//			StringBuilder sb = new StringBuilder();
//			
//			while((bytesLidos = is.read(buffer)) > -1 ) {
//				//s += new String(buffer, 0, bytesLidos);
//				sb.append(new String(buffer, 0, bytesLidos));
//			}
//			
//			System.out.println(s);
//			System.out.println(s.length());
//			
//			System.out.println(sb.toString());
//			System.out.println(sb.length());
		
		/*
		 * trabalhando com arquivos de texto
		 */
		
		/*
		try (BufferedReader reader = new BufferedReader(new FileReader("entrada.txt2"))) {
			
			StringBuilder sb = new StringBuilder();
			String line;
//			String nova = "";
			
			while ((line = reader.readLine()) != null) {

				sb.append(line + "\n");
				
//				nova += line + "\n";
				
			}
			
			System.out.println(sb.toString());
//			System.out.println(nova);
			
		}
		
			*/
		
		
		/*
		 * Usando a classe Scanner
		 */
		
		try(Scanner scanner = new Scanner(new File("entrada.txt2"))) {
			StringBuilder sb = new StringBuilder();
			while(scanner.hasNextLine()) {
				sb.append(scanner.nextLine() + "\n");
			}
			System.out.println(sb.toString());
		}
	}
}
