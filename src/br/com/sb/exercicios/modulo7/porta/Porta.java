package br.com.sb.exercicios.modulo7.porta;

public class Porta implements Cloneable {

	private double altura;
	private double largura;
	private boolean aberta;
	
	public Porta(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
	}
	
	private void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}
	
	private void setLargura(double largura) {
		if(largura > 0) {
			this.largura = largura;
		}
	}
	
	
	public boolean isAberta() {
		return aberta;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void abrir() {
		aberta = true;
	}
	
	public void fechar() {
		aberta = false;
	}
	
	private void imprimeSeparador() {
		System.out.println("-------------------------");
	}
	
	public String toString() {
		imprimeSeparador();
		return "id: " + this.hashCode()
			+ "\nAltura: " + getAltura()
			+ "\nLargura: " + getLargura()
			+ "\nStatus: " + (isAberta() == true ? "Aberta" : "Fechada");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
