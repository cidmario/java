package aulas.fluxos_loops;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fluxos {
	//if else: A forma mais simples >> Permite que vc faça uma avaliação, e de acordo com essa avaliação execute ou não um trecho de codigo.
	static void fluxosIfElse(double nota) {


		if (nota >= 7) {
			System.out.println("Passou");
		} else {
			System.out.println("Reprovou");
			if (nota >= 6) {
				System.out.println("Mais pode fazer a recuperação");
			}
		}
	}
//	switch: Também permite que vc avalie condições dentro da aplicação (de igualdade). Porém ele normalmente é utilizado em um caso muito especifico
//  		e também é mais perfomatico.

	static void fluxo_switch(char sexo) {

		if (sexo == 'm') {
			System.out.println("Macho");
		} else if (sexo == 'f') {
			System.out.println("Femea");
		} else {
			System.out.println("indefinido");
		}

//		switch (sexo) {
//			case 'm':
//				System.out.println("Macho");
//				break;
//			case 'f':
//				System.out.println("Femea");
//				break;
//			default:
//				System.out.println("indefinido");
//		}
	}

	static void desafioDados(int palpite) {

		Random n = new Random();
		int dado = n.nextInt(6) + 1;

		System.out.println("O numero informado foi: " + palpite);
		System.out.println("O numero que saiu no dado: " + dado);

		if (palpite == dado) {
			System.out.println("Acertou miseravi !");
		} else {
			System.out.println("Errou, só lamento !");
		}
	}

	static void repeticaoFor() {
//       FOR: é uma estrutura de repeticão ou loop que inicializa, testa e se for verdadeira executa uma ação ou bloco de codigo
//       fazendo incremento ou decremento


		System.out.println("Exemplo simples: incremento ");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

	System.out.println("\nExemplo simples: decremento ");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

//		System.out.println("QUADRADO DE '*': ");
//		int tamanho = 5;
//		for (int x = 0; x < tamanho; x++) {
//			for (int i = 0; i < tamanho; i++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}


//		System.out.println("Percorrer um array e imprimir numeros pares:");
//		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		for (int i = 0; i < numeros.length; i++) {
//			if (numeros[i] % 2 == 0) {
//				int par = numeros[i];
//				System.out.println(par);
//			}
//		}
	}

	static void repeticaoForEach() {
//			foreach: É um for aprimorado usado para  percorrer um array ou arraylist
//					 Iformo um tipo que ele vai percorrer juntamente com a variavel e após ':' informo a coleção de dados
//			         Limitações: Não temos acesso a variavel 'i' & Só percorre os elementos para 'frente'

		System.out.println("Percorrento array com 'foreach' e imprimindo numeros pares: ");
		int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (int par : numeros) { //vai percorrer todos os elementos : dentro de pares e armazenar em par
			if (par % 2 == 0) { // vai separar os elementos que são par
				System.out.println(par); // imprimir somente elementos pares
			}
		}
//
//		System.out.println("\nPercorrendo ArrayList com foreach: ");
//		ArrayList<Integer> list = new ArrayList<Integer>(); // criacão da lista
//		for(int i=-0; i<10;i++){  // gerar 10 elementos
//			list.add(i);           // adiciono os elementos
//		}
//		for(Integer numeros : list){ // percorro todos elementos da lista e salvo em uma variavel
//			System.out.println(numeros); // apresento todos os elementos encontrados
//		}

	}

	static void repeticaoWhileEDoWhile() {


		System.out.println("Exemplo 01: ");
		int i =0;
		while (i <= 2) {  // se i > 2 não entra no loop
			System.out.println(i);
			i++;
		}

		System.out.println("\nExemplo 02: ");
		int x =0;
		do {
			System.out.println(x); // se i > 2 vai imprimir o valor de i e encerrar, pois entra pelo menos uma vez dentro do bloco de codigo.
			x++;

		} while (x <= 2);


//		ArrayList<String> lista = new ArrayList<String>();
//		Scanner c = new Scanner(System.in);
//		System.out.println("Informe uma lista de coisas, quando terminar digite fim para sair.");
//		String coisa;
//
//		while (!"fim".equalsIgnoreCase(coisa = c.nextLine())) {
//			lista.add(coisa);
//		}
//		System.out.println("Lista informada: "+lista.toString());

	}
}

