package br.com.sb.exercicios.modulo13.exercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Month;

public class TesteAplicacao {

	public static void main(String[] args) throws IOException, ParseException {
		

//		DataOutputStream out = new DataOutputStream(new FileOutputStream(nomeArquivo));

		
//		autor1.write(out);
//		autor2.write(out);
//		autor1.read(in);
		
		//String sDate1="31/12/1998";
		//Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		
		//System.out.println(date1 + " apareceu assim");
		
//		
//		livro1.read(in);
		
		String nomeArquivo = "livros.txt";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha por favor uma opção");
		System.out.println("1 - para gravar dados");
		System.out.println("2 - para ler dados do arquivo 'livros.txt'");
		
		String opcao = scanner.nextLine();
		
		System.out.println("a opção escolhida foi..." + opcao);
		System.out.println();
		
		while (!opcao.equals("1") && !opcao.equals("2")) {
			System.out.println("opção " + opcao + " inválida...");
			System.out.println("digite novamente por favor: ");
			opcao = scanner.nextLine();
		}
		
		LocalDate data2 = LocalDate.parse("04/03/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate data1 = LocalDate.parse("11/01/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate data4 = LocalDate.parse("23/05/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate data3 = LocalDate.parse("23/05/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		
		Autor autor1 = new Autor("matheus", data1);
		Autor autor2 = new Autor("ziraldo", data2);
		Autor autor3 = new Autor("bruninha", data3);
		Autor autor4 = new Autor("naruto", data4);
		
		Livro livro1 = new Livro("estudando Java", 200, autor1);
		Livro livro2 = new Livro("programação", 140, autor2);
		Livro livro3 = new Livro("A tormenta de espadas", 800, autor3);
		Livro livro4 = new Livro("A guerra dos tronos", 1240, autor4);
		Livro livro5 = new Livro("stowe", 240, autor1);
		
		
		if (opcao.equals("1")) {
			try (DataOutputStream out = new DataOutputStream(new FileOutputStream(nomeArquivo))) {
				
				livro1.write(out);
				livro2.write(out);
				livro3.write(out);
				livro4.write(out);
				livro5.write(out);
				
				System.out.println("foram gravados no arquivo os seguintes livros: \n");
				System.out.println("=============================================");
				System.out.println(livro1.getTitulo());
				System.out.println(livro2.getTitulo());
				System.out.println(livro3.getTitulo());
				System.out.println(livro4.getTitulo());
				System.out.println(livro5.getTitulo());
			}
		} else {
			try (DataInputStream in = new DataInputStream(new FileInputStream(nomeArquivo))) {
				livro1.read(in);	
			}
		}
	
		
	}
}
