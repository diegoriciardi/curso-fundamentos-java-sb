package br.com.sb.exercicios.modulo8.conta;

public class ContaBancaria {

	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) throws ValorInvalidoException {
		
		if(valor <= 0) {
			throw new ValorInvalidoException("Valor deposito menor que 0");
		}
		
		this.saldo += valor;
	}
	
	public void saca(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		
		if(valor <= 0) {
			throw new ValorInvalidoException("Valor saque menor que 0");
		}
		
		if(valor > saldo) {
			throw new SaldoInsuficienteException("Valor de saque " + valor + " excede o saldo da conta " + saldo);
		}
		
		this.saldo -= valor;
	}
	
	public void transferePara(ContaBancaria destino, double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public String toString() {
		return "Saldo Conta (" + this.hashCode() + ") =  " + saldo;
	}
	
	
}
