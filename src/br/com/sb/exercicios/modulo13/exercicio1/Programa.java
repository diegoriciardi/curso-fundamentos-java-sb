package com.br.softblue.exercicios.modulos.modulo13.exercicio1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Programa {
	
	
	
	public static void main(String[] args) throws IOException {
		
		String nomeArquivo = "lista.txt";
		String nomeArquivoTemporario = "temporario.txt";
		
		File arquivo = new File(nomeArquivo);
		
		if (arquivo.length() > 0) {
			System.out.println("tem conteúdo...vou manter");
			
			try (InputStream is = new FileInputStream(arquivo) ; 
					Scanner scanner = new Scanner(System.in) ; 
					PrintWriter pw = new PrintWriter(nomeArquivoTemporario)) {
				
				byte[] buffer = new byte[1024];
				
				int bytesLidos;
				
				StringBuilder sb = new StringBuilder();

				while ((bytesLidos = is.read(buffer)) > -1) {
					sb.append(new String(buffer, 0, bytesLidos));
					System.out.println(sb);
					pw.write(sb.toString());
				}
				
				while (true) {
					
					String digitado = scanner.nextLine();
					
					if (digitado.isBlank()) {
						continue;
					}
					
					if (digitado.equals("0")) {
						System.out.println("terminando o programa...");
						break;
					}
					
					pw.write("\n" + digitado);
				
				}
				
				pw.close();
				
				FileInputStream fin = new FileInputStream(nomeArquivoTemporario);
				OutputStream fout = new FileOutputStream(arquivo);
				
				transfer(fin, fout);
				
				new File(nomeArquivoTemporario).getAbsoluteFile().delete();
				
			}
			
		} else {
			System.out.println("está vazio...");
		}
		
	}
	
	private static void transfer(InputStream entrada, OutputStream saida) throws IOException {

		try (InputStream in = entrada; OutputStream out = saida) {
			
			byte[] buffer = new byte[1024];

			int bytesLidos;

			while ((bytesLidos = in.read(buffer)) > -1) {
				out.write(buffer, 0, bytesLidos);
				//System.out.println(bytesLidos);
			}
		}
	}
}
