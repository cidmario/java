package exercicios.exercicio02;

public class Divisao {
	static void divisao(int n1, int n2) {
		int div, rest;
		div = n1 / n2;
		rest = n1 % n2;

		System.out.println("Resultado da divisão: " + div);
		System.out.println("Resto da divisão: " + rest);
	}

	static void divisaoComCasaDecimais(int n1, int n2) {
		int div, rest;
		div = n1 / n2;
		rest = n1 % n2;
		if (rest != 0) {
			System.out.printf("Resultado da divisão: %.5f ", (float) div);
		} else {
			System.out.println("Resultado da divisão " + div);
		}
	}
}
