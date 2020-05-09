package aulas.array;

import java.util.Arrays;

public class Array {
	// Array também conhecido como coleçao de dados são um conjunto indexados de informação.
	// É indexado devido a relação chave-valor.
	public static void main(String[] args) {
		//Uma forma de iniciarlizar:
		String[] colaboradores = {"Pedro", "Cidmario", "João", "Gustavo"};

		System.out.println("Buscar um elemento pelo indice: " + colaboradores[0]);
		colaboradores[0] = "Pedro Silva";
		System.out.println("Alterar o valor do elemento para: " + colaboradores[0]);
		System.out.println("Ver a quantidade de elementos do array: " + colaboradores.length);
		System.out.println("Apresentar todos os elementos do array: " + Arrays.toString(colaboradores));
		Arrays.sort(colaboradores, 0, colaboradores.length); // Ordena os elementos crescente > A-Z
		System.out.println("Ardenado: "+Arrays.toString(colaboradores));
		int pos = Arrays.binarySearch(colaboradores, "Gustavo");//Procurar um determinado elemento / devolve a posição
		System.out.println("O valor pesquisado está na posição: " + pos); //retorna a posicao / retornou um numero negativo



//		//Outra forma de inicializar um array:
//		int [] numeros = new int [5];
//		numeros[0] =1;
//		numeros[1] =2;
//		numeros[2] =3;
//		numeros[3] =4;
//		numeros[4] =5;
//		System.out.println("Numeros: "+numeros[0]);
	}

}
