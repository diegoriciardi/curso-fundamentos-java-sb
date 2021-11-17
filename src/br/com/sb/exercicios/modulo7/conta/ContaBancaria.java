package br.com.sb.exercicios.modulo7.conta;

public abstract class ContaBancaria {

	protected double saldo;
	
	protected double getSaldo() {
		return saldo;
	}
	
	public boolean deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean saca(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferePara(ContaBancaria destino, double valor) {
		if(saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public abstract double calcularSaldo();
	
	public String toString() {
		return "Saldo da conta: R$ " + calcularSaldo();
	}
}
