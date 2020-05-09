package exercicios.exercicio01;

import java.io.IOException;
import java.util.Scanner;

class TestarPedirNome {
	public static void main(String[] args) throws IOException {
		String op = "";
		Scanner s = new Scanner(System.in);
		do {
			ExercicioJoao.pedirNome();
			System.out.println("Deseja Continuar: 1- Continuar | 2- Sair");
			op = s.nextLine();


			while (((!op.equals("1")) && (!op.equals("2")))) {
				System.out.println("Opção Invalida !!! " + "\n" +
						"Deseja Continuar: 1- Continuar | 2- Sair");
				op = s.nextLine();
			}

			if (op.equals("2")) {
				System.out.println("Saindo do sistema, obrigado !");
			}

		} while (op.equals("1"));

	}
}
