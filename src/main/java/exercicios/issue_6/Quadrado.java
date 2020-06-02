package exercicios.issue_6;


import java.util.Scanner;

public class Quadrado {

	static Scanner s = new Scanner(System.in);
	static String solicitarIntevalo = "Será impresso o quadrado dos numeros de 15 a 200. \n" +
			"Deseja informar outro intervalo? (Sim/Não)";
	static String parada = "Deseja continuar ? (Responda Sim/Não)";

	public static void main(String[] args) {
		quadrado();
	}

	static void quadrado() {

		System.out.println(solicitarIntevalo);
		String resp1 = s.nextLine();

		validarRespostaDoUsuario(resp1, solicitarIntevalo);

		if (resp1.equalsIgnoreCase("sim")) {
			definirIntevaloPeloUsuario();
		} else {
			definirIntervaloPeloSistema();
		}
	}


	static void definirIntevaloPeloUsuario() {
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

	static void definirIntervaloPeloSistema() {
		int quadrado;
		for (int i = 15; i <= 200; i++) {
			quadrado = i * i;
			System.out.println("O valor de " + i + " ao quadado é >> " + quadrado);
		}
	}

	static void validarRespostaDoUsuario(String resp, String mensagem) {
		//validando resposta do usuário
		for (int i = 0; (!resp.equalsIgnoreCase("sim")) && (!resp.equalsIgnoreCase("não")); i++) {
			System.out.println("Resposta Invalida !");
			System.out.println(mensagem);
			resp = s.nextLine();
		}
	}
}

