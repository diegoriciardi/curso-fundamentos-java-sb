package br.com.sb.exercicios.modulo7;

public interface AreaCalculavel {

	double areaCalculavel();

	default String imprimir() {
		String[] arrayNomeDaClasse = this.getClass().getName().split("\\.");
		return "Area " + arrayNomeDaClasse[arrayNomeDaClasse.length - 1] + " = " + areaCalculavel();
	}
	
}
