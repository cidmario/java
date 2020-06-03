package exercicios.issue_4;

import java.util.Random;
import java.util.Scanner;

public class MaiorMenorNumero {
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random gerarNumeros = new Random();

		System.out.println("Quantos numeros serão impressos ? ");
		int numeros = scanner.nextInt();
		int maior =0;
		for(int i=1;i<=numeros;i++){

			int numerosAleatorios = gerarNumeros.nextInt(200);
			System.out.println(numerosAleatorios);
			if(numerosAleatorios>maior){
				maior = numerosAleatorios;
			}
		}
		System.out.println("Maior numero da lista: >>> "+maior);
	}
}
