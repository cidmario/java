package exercicios.exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		piramide();
	}

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
				// Define quem ficará no topo da piramede: '0' ou '1'
				// se for true: imprime o resto de i/2 que sempre vai ser '1' >> Se for false impreme o resto de i+1/2 que sempre vai ser '0'
				int caracter = (topo.equals("1")) ? (i % 2) : (i + 1) % 2;

				for (int j = 0; j < i; j++) { //Define a quantidade de elementos que será impresso em cada linha >> "j" representa o indice de cada elemento
					if (i > 1 && j > 0) {
						System.out.print('-'); // Inicia depois da primeira linha && depois do primeiro elemento de cada linha
					}
					System.out.print(caracter);
				}
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
}
