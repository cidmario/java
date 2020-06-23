package exercicios.issue_7;

import java.util.Random;
import java.util.Scanner;

public class DoisMenoresNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random gerarNumeros = new Random();

		System.out.println("Quantos numeros serão impressos ? ");
		int numeros = scanner.nextInt();
		int menor = 0;
		int menor2 = 0;

		for (int i = 1; i <= numeros; i++) { // determina a quantidade de numeros que será impresso de acordo com a entrada do usuário.
			int numerosAleatorios = gerarNumeros.nextInt(200) - 50; // Gera aleatoriamente os numeros negativos ou positivos.

			if (i == 1) { //Armazena o primeiro numero como maior e menor, pois sera
				menor = numerosAleatorios;
				menor2 = numerosAleatorios;
			}
			if (numerosAleatorios < menor) { //Descobre quem é o menor numero a partir de i==2
				menor2 = menor;
				menor = numerosAleatorios;

			} else { //Descrobre quém é o segundo menor numero
				menor = menor2;
				menor2 = numerosAleatorios;
			}
			System.out.println(numerosAleatorios);
		}
		System.out.println("\nMenor numero da lista: >>> " + menor);
		System.out.println("\nO Segundo menor numero da lista: >>> " + menor2);
	}
}

