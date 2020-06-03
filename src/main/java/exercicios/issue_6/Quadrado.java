package exercicios.issue_6;


import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		//variaveis que serão utilizadas ao longo do método main
		final Scanner scanner = new Scanner(System.in);
		final String definirIntervalo = "Será impresso o quadrado dos numeros de 15 a 200. \n" +
				"Deseja definir outro intervalo? (Sim/Não)";

		int inicioIntervalo = 15;
		int fimIntervalo = 200;

		System.out.println("\n>>>>>>>>>>>>>> INICIANDO >>>>>>>>>>>>>>\n");

		//Dá a opção para o usuário definir um intervalo numerico, se ele quiser.
		System.out.println(definirIntervalo);
		String respDefinirIntervalo = scanner.nextLine();

		//valida a primeira resposta sobre definir ou não um intervalo
		while ((!respDefinirIntervalo.equalsIgnoreCase("sim")) && (!respDefinirIntervalo.equalsIgnoreCase("não"))) {
			System.out.println("Resposta Invalida !");
			System.out.println( definirIntervalo);
			respDefinirIntervalo = scanner.nextLine();
		}

		//Se a resposta for sim, solicita que o usuário informe os limites do intervalo, executa e imprime o resultado.
		//Se a resposta for não, simplismente executa e imprime o resultado do intervalo definido pelo sistema.
		if (respDefinirIntervalo.equalsIgnoreCase("sim")) {
			System.out.println("Usando numeros 'inteiros', informe o 'inicio' do intervalo:");
			inicioIntervalo = scanner.nextInt();
			System.out.println("Usando numeros 'inteiros', informe o 'fim' do intervalo");
			fimIntervalo = scanner.nextInt();

			//Verificando se o intervalo é valido.
			while (inicioIntervalo > fimIntervalo) {
				System.out.println("                         ATENÇÃO !!!!\n" +
						"O Inicio do intervalo deve ser maior que o fim. Ex: 'inicio' = " + fimIntervalo + " e 'fim' = " + inicioIntervalo);

				System.out.println("\n Usando numeros 'inteiros', informe o 'inicio' do intervalo:");
				inicioIntervalo = scanner.nextInt();
				System.out.println("\n Usando numeros 'inteiros', informe o 'fim' do intervalo");
				fimIntervalo = scanner.nextInt();
			}
			//executa e imprime o resultado do intervalo informado pelo usuário
			for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
				int quadrado = i * i;
				System.out.println("O valor de " + i + " ao quadado é >> " + quadrado);
			}
		} else {
			//Executa e imprime o resultado definido pelo sistema.
			for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
				int quadrado = i * i;
				System.out.println("O valor de " + i + " ao quadado é >> " + quadrado);
			}
		}
	}
}


