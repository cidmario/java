package exercicios.exercicio3;

import java.util.Scanner;

public class Exercicio3 {


	static void piramide() {
		Scanner r = new Scanner(System.in);
		String linhaS, topo, op;

		do {

			System.out.println("Informe uma quantidade de linha para a pirâmede entre 3 e 10");
			linhaS = r.nextLine();

			// Válida se o usuário digitou a quantidade  de linha correta de 3 a 10 (string):
			while (!linhaS.equals("3") && !linhaS.equals("4") &&
					!linhaS.equals("5") && !linhaS.equals("6") &&
					!linhaS.equals("7") && !linhaS.equals("8") &&
					!linhaS.equals("9") && !linhaS.equals("10")) {

				System.out.println("Atenção !");
				System.out.println("Informe uma quantidade de linha para a pirâmede entre 3 e 10");
				linhaS = r.nextLine();
			}
			//converte a linha de String p/ inteiro onde será usado nos laços de repetição
			int linha = Integer.parseInt(linhaS);

			System.out.println("Informe qual caracter ficára no top da pirâmede: '0' ou '1'?");
			topo = r.nextLine();

			//valida se o usuário digitou os valores do topo da piramede '0' ou '1' corretamente.
			while (!topo.equals("0") && !topo.equals("1")) {
				System.out.println("Informe qual caracter ficára no top da pirâmede: '0' ou '1'?");
				topo = r.nextLine();
			}

			for (int i = 1; i <= linha; i++) { // define a quantidade de linhas que serão impressas >> "i" representa o indice da de cada linha
				String caracter;
				int primeiroFor = 0;
				int segundoFor = 0;
				int terceiroFor = 0;

				if (topo.equals("0")) {
					caracter = (i % 2 == 0) ? "1" : "0"; // Onde o i for impar imprime '0' onde for par imprime '1' (i: Sempre começa impar)
				} else {
					caracter = (i % 2 == 0) ? "0" : "1"; // onde o i for impar imprime '1' onde for par imprime '0' (i: Sempre começa impar)
				}

				for (int j = 0; j < i; j++) { //Define a quantidade de elementos que será impresso em cada linha >> "j" representa o indice de cada elemento
					for (int x = 0; x < j; x = x + j) { // Define a quantidade de "-" que será impresso >> "x" representa o indice de cada traço
						System.out.print("-"); // imprime um "-" após cada elemento enquanto a quntidade de
						terceiroFor = x;
					}

					System.out.print(caracter);
					segundoFor = j;
				}
				primeiroFor = i;
				System.out.print("                     >>>>>>>> " + primeiroFor + ", " + segundoFor + ", " + terceiroFor);
				System.out.println(" ");
			}
			// valida a resposta sobre continuar ou não no programa
			System.out.println("\n\nDeseja continuar? digite 'Sim' ou 'Não' ");
			op = r.nextLine();
			while (!op.equalsIgnoreCase("Sim") && !op.equalsIgnoreCase("Não")) {
				System.out.println("\nAtenção ! Resposta inválida !");
				System.out.println("Deseja continuar? digite 'Sim' ou 'Não'! ");
				op = r.nextLine();
			}

			if (op.equalsIgnoreCase("Não")) {
				System.out.println("Estamos encerrando por aqui, obrigado !");
			}

		} while (op.equalsIgnoreCase("Sim"));
	}

	static void soma() {
		int soma = 0;
		for (int i = 1; i <= 3; i++) { // Indice começa com 1 e vai até que seja menor ou igual a 5
			soma += i;
			//soma = soma +i;
			System.out.println(i);
		}
		System.out.print(soma);
	}

	static void quadrado() {
		int quadrado;
		for (int i = 15; i <= 200; i++) {
			quadrado = i * i;
			System.out.println("O Valor de " + i + " ao quadrado é  >> " + quadrado);
		}
	}

	public static void main(String[] args) {
	piramide();
//		soma();
//		quadrado();


	}
}
