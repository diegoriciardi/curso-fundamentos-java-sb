package com.br.softblue.exercicios.modulos.modulo9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto {

	private String nome;
	private double peso;
	private Date dataDeValidade;

	public Produto(String nome, double peso, Date dataDeValidade) {
		this.nome = nome;
		this.peso = peso;
		this.dataDeValidade = dataDeValidade;
	}
	
	public Produto(String nome, double peso, String dataDeValidadeString) {
		this.nome = nome;
		this.peso = peso;
		setDataDeValidade(dataDeValidadeString);
	}
	
	public String getNome() {
		return this.nome;
	}
		
	public double getPeso() {
		return this.peso;
	}
		
	public Date getDataDeValidade() {
		return this.dataDeValidade;
	}
	
	private void setDataDeValidade(String dataDeValidadeString) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataDeValidade = sdf.parse(dataDeValidadeString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
