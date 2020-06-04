package exercicios.issue_4;

import java.util.Random;
import java.util.Scanner;

public class MaiorMenorNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random gerarNumeros = new Random();

		System.out.println("Quantos numeros serão impressos ? ");
		int numeros = scanner.nextInt();
		int maior = 0;
		int menor = 0;

		for (int i = 1; i <= numeros; i++) {
			int numerosAleatorios = gerarNumeros.nextInt(200) - 50;
			//Armazena o primeiro numero como maior e menor, pois sera
			if (i == 1) {
				maior = numerosAleatorios;
				menor = numerosAleatorios;
			}
			    //Descobre quem é o maior numero
			if (numerosAleatorios > maior) {
				maior = numerosAleatorios;
				//Descrobre o menor numero
			} else if (numerosAleatorios < menor) {
				menor = numerosAleatorios;
			}

			System.out.print(numerosAleatorios);
			System.out.print(" ");
		}
		System.out.println("\nMaior numero da lista: >>> " + maior);
		System.out.println("Menor numero da lista >>> " + menor);
	}
}
