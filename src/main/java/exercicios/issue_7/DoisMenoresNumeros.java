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

		for (int i = 1; i <= numeros; i++) {
			int numerosAleatorios = gerarNumeros.nextInt(200) - 50;
			//Armazena o primeiro numero como maior e menor, pois sera
			if(i==1){
				menor=numerosAleatorios;
			}
			//Descobre quem é o menor numero
			if (numerosAleatorios < menor) {
				menor = numerosAleatorios;
			}
			System.out.println(numerosAleatorios);
		}
		System.out.println("\nMenor numero da lista: >>> " + menor);
	}
}

