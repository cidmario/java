package exercicios.issue_8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumerosMenores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random gerarNumeros = new Random();

		System.out.println("Quantos numeros serão analisados ? ");
		int numeros = entrada.nextInt();

		System.out.println("Informe a quantidade de numeros menores deseja encontrar.");
		int qdNumerosMenores = entrada.nextInt();

		//validando para que a quantidade de numereos menores não seja maior que os numeros listados.
		while (qdNumerosMenores > numeros) {
			System.out.println("ATENÇÃO ! A quantida é maior que a lista que será impressa !");
			System.out.println("Informe a quantidade de numeros menores que deseja encontrar");
			qdNumerosMenores = entrada.nextInt();
		}

		//Array que armazena a quantidade de numeros que serão analisados.
		int[] numerosAleatorios = new int[numeros];

		System.out.println();
		//Laço que preenche e imprime aleatoriamente os numeros.
		for (int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = gerarNumeros.nextInt(200) - 40;
			System.out.print(numerosAleatorios[i]+" ");
		}

		Arrays.sort(numerosAleatorios); // Ordenar do menor para o maior antes de buscar os menores numero
		System.out.println("\n\nOs menores numeros encontrados são:");

		for (int y = 0; y < qdNumerosMenores; y++) { // busca e imprime os primeiros numeros que já estão ordenados do menor para o maior.
			System.out.println("O " + y + "º menor numero é: " + numerosAleatorios[y]);
		}
	}


}
