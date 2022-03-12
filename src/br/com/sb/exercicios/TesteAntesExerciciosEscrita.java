package com.br.softblue.exercicios.modulos.modulo13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class TesteAntesExerciciosEscrita {
	
	public static void main(String[] args) throws IOException {
		
		String s = "texto para ser gravado no arquivo";

//		try (OutputStream os = new FileOutputStream("saida.txt")) {
//						
//			byte[] buffer = s.getBytes();
//			
//			os.write(buffer);
//		}
		
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt2"))) {
//			writer.write(s);
//		}

//		try (PrintWriter pw = new PrintWriter("saida.txt4")) {
//			pw.println(s);
//		}

		String inputFile = "original.txt";
		String outputFile = "copia.txt";
		
//		try (InputStream in = new FileInputStream(inputFile); 
//				OutputStream out = new FileOutputStream(outputFile)) {
//			
//			byte[] buffer = new byte[1024];
//			
//			int bytesLidos;
//			
//			while ((bytesLidos = in.read(buffer)) > -1) {
//				out.write(buffer, 0, bytesLidos);
//			}
//		}
		
		try (Scanner scanner = new Scanner(new File(inputFile));
				PrintWriter pw = new PrintWriter(outputFile)) {
			
			while (scanner.hasNextLine()) {
				pw.write(scanner.nextLine() + "\n");
			}
		}
		
	}
}
