package br.com.sb.exercicios.modulo7.conta;

public class ContaInvestimento extends ContaBancaria {

	private final double ACRESCIMO = 0.05;
	
	public ContaInvestimento(double saldo) {
		deposita(saldo);
		deposita(saldo * ACRESCIMO);
	}
	
	@Override
	public double calcularSaldo() {
		return getSaldo(); 
	}

}
