package exercicios.issue_6;


import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		System.out.println();
			quadrado();
	}

	static void quadrado() {
		System.out.println("Será impresso o quadrado dos numeros de 15 a 200. \n" +
				"Deseja informar outro intervalo? (Sim/Não)");
		Scanner s = new Scanner(System.in);
		String resp = s.nextLine();
		System.out.println(resp);

		if (resp.equalsIgnoreCase("sim")) {
			informaIntervalo();
		} else {
			intevaloDefinidoPeloSistema();
		}
	}

	static void informaIntervalo() {
		Scanner s = new Scanner(System.in);
		int inicio = 0, fim = 0, quadrado = 0;
		System.out.println("Usando numeros 'inteiros', informe o 'inicio' do intervalo:");
		inicio = s.nextInt();
		System.out.println("Usando numeros 'inteiros', informe o 'fim' do intervalo");
		fim = s.nextInt();
		for (int i = inicio; i <= fim; i++) {
			quadrado = i * i;
			System.out.println("O valor de " + i + " ao quadado é >> " + quadrado);
		}
	}

	static void intevaloDefinidoPeloSistema() {
		int quadrado;
		for (int i = 15; i <= 200; i++) {
			quadrado = i * i;
			System.out.println("O valor de " + i + " ao quadado é >> " + quadrado);
		}
	}
}
