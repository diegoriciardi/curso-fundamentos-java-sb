package br.com.sb.exercicios.modulo7.conta;

public class ContaCorrente extends ContaBancaria {

	private final double TAXA = 0.1;
	
	public ContaCorrente(double saldo) {
		deposita(saldo);
		saca(saldo * TAXA);
	}
	
	@Override
	public double calcularSaldo() {
		return getSaldo(); 
	}

}
