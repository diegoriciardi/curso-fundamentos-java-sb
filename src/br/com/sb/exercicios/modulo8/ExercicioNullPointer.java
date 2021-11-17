package br.com.sb.exercicios.modulo8;

public class ExercicioNullPointer {

	public static void main(String[] args) {

		Object o = null;
		try {
			o.toString();
		} catch (NullPointerException e) {
			System.out.println("Não foi possivel efetuar a operacao. O objeto o aponta para uma referencia nula" );
			//e.printStackTrace();
		}
	}

}
