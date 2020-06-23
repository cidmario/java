package exercicios.issue_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DoisMenoresNumeros2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random gerarNumeros = new Random();
		System.out.println("Quantos numeros serão impressos ? ");
		int numeros = entrada.nextInt();

		//Array que define a quantidade de numeros que serão criados, de acordo a entrada do usuário
		int[] numerosAleatorios = new int[numeros];

		//Laço que preenche aleatoriamente os numeros
		for(int i=0;i<numerosAleatorios.length;i++ ){
			numerosAleatorios[i] = gerarNumeros.nextInt(200)-50;
			System.out.println(numerosAleatorios[i]);
		}

		Arrays.sort(numerosAleatorios); // ordeno do menor para o maior
		System.out.println("Menor: "+numerosAleatorios[0]); // Pego o menor numero
		System.out.println("Segundo menor: "+numerosAleatorios[1]); //Pego o segundo menor numero

	}

}
