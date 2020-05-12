package aulas.array;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Array_aula {
	// Array_aula também conhecido como coleçao de dados são um conjunto indexados de informação.
	// É indexado devido a relação chave-valor.

	static void arraySimples() {
		//Uma forma de iniciarlizar:
		String[] colaboradores = {"Pedro", "Cidmario", "João", "Gustavo"};

		System.out.println("Buscar um elemento pelo indice: " + colaboradores[0]);
		colaboradores[0] = "Pedro Silva";
		System.out.println("Alterar o valor do elemento para: " + colaboradores[0]);
		System.out.println("Ver a quantidade de elementos do array: " + colaboradores.length);
		System.out.println("Apresentar todos os elementos do array: " + Arrays.toString(colaboradores));
		Arrays.sort(colaboradores, 0, colaboradores.length); // Ordena os elementos crescente > A-Z
		System.out.println("Ardenado: " + Arrays.toString(colaboradores));
		int pos = Arrays.binarySearch(colaboradores, "Gustavo");//Procurar um determinado elemento / devolve a posição
		System.out.println("O valor pesquisado está na posição: " + pos); //retorna a posicao / retornou um numero negativo


		//Outra forma de inicializar um array:
		int[] numeros = new int[5];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		System.out.println("Numeros: " + numeros[0]);

	}

	static void arrayMultidimensional() {
		String[][] pessoas = {
				{"Roberto", "33" , "casado"},
				{"Larissa","26", "Solteira"},
		};
		System.out.println("Nome: "+pessoas[1][0]+"\nEstado civil: "+ pessoas[1][2]);
		pessoas[1][2] = "Cassada";
		System.out.println("Novo estado civil de "+pessoas[1][0]+" é: "+pessoas[1][2]);

//		###Programa que informar uma carta de baralho de forma aleatoria:

		String[] faces = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};

		Random r = new Random();
		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];
		int indiNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiNipe];

		String carta = face + " de " + nipe;
		System.out.println(carta);
	}

	static void arrayList(){
		ArrayList<String> colaboradores = new ArrayList<String>();
		colaboradores.add("Cidmario");
		colaboradores.add("Gustavo");
		colaboradores.add("João");
		colaboradores.add(0,"Pedro");

		System.out.println("Relação de colaboradores: "+colaboradores.toString());
		System.out.println("Quantidade de elementos: "+colaboradores.size());
		System.out.println("Recuperar um elemento: "+colaboradores.get(2)); //Inormar o indice
		System.out.println("Informar o indice de um elemento: "+colaboradores.indexOf("Cidmario"));
		colaboradores.remove("João");
		System.out.println(colaboradores.toString());
		System.out.println("Existe o Elemento? " +colaboradores.contains("João")); // esse metodo retorna um valor booleano.




	}

}
