package com.br.softblue.exercicios.modulos.modulo13;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TesteAntesExerciciosPolimorfismoIO {

	public static void main(String[] args) throws IOException {

//		FileInputStream fin = new FileInputStream("original.txt");
//		FileOutputStream fout = new FileOutputStream("1-saida.txt");
		
//		FileInputStream fin = new FileInputStream("original.txt");
//		OutputStream fout = System.out;
		
//		InputStream fin = System.in;
//		OutputStream fout = new FileOutputStream("1-saida.txt");
		
		FileInputStream fin = new FileInputStream("original.txt");
		ByteArrayOutputStream fout = new ByteArrayOutputStream();
		transfer(fin, fout);
		
		byte[] bytes = fout.toByteArray();
		String s = new String(bytes);
		System.out.println(s);

	}

	private static void transfer(InputStream entrada, OutputStream saida) throws IOException {

		try (InputStream in = entrada; OutputStream out = saida) {
			
			byte[] buffer = new byte[1024];

			int bytesLidos;

			while ((bytesLidos = in.read(buffer)) > -1) {
				out.write(buffer, 0, bytesLidos);
			}
		}
	}
}
