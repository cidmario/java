package aulas.operadores;


public class Operadores {

	static void operadoresMatematicos(int n1, int n2) {
		int soma, sub, mult, div, res, preInc, posIncr;
		soma = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;
		div = n1 / n2;
		res = n1 % n2;
		System.out.println("========== OPERADORES MATEMATICOS =========");
		System.out.println("Numeros utilizados para os calculos: " + n1 + " e " + n2);
		System.out.println("A Soma: " + soma);
		System.out.println("A Subtração: " + sub);
		System.out.println("A Multiplicação: " + mult);
		System.out.println("A Divisão: " + div);
		System.out.println("O resto da divisão: " + res);
	}

	static void operadoresComparacao(int n1, int n2) {
		boolean igual, diferente, maior, menor, maiorIgual, menorIgual;
		igual = n1 == n2;
		diferente = n1 != n2;
		maior = n1 > n2;
		menor = n1 < n2;
		maiorIgual = n1 >= n2;
		menorIgual = n1 <= n2;
		System.out.println("========== OPERADORES DE COMPARAÇÃO =========");
		System.out.println("Numeros utilizados para comparação: " + n1 + " e " + n2);
		System.out.println("O numero " + n1 + " é 'igual' ao numero " + n2 + "?: " + igual);
		System.out.println("O numero " + n1 + " é 'diferente' do numero " + n2 + "?: " + diferente);
		System.out.println("O numero " + n1 + " é 'maior' que o numero " + n2 + "?: " + maior);
		System.out.println("O numero " + n1 + " é 'menor' que o numero " + n2 + "?: " + menor);
		System.out.println("O numero " + n1 + " é 'maior ou igual ' ao numero " + n2 + "?: " + maiorIgual);
		System.out.println("O numero " + n1 + " é 'menor ou igual ' ao numero " + n2 + "?: " + menorIgual);
	}

	static void compararObjetos() {
		Integer x = new Integer(1);
		String y = "2";
		System.out.println(x instanceof Integer);
		System.out.println(y instanceof String);
	}

	static void operadoresLogicos(int num) {
		System.out.println("========== OPERADORES LÓGICOS =========");
		System.out.println("Dado o numero: " + num + "posso dizer que:");

		if ((num >= 1) && (num <= 10)) {
			System.out.println(num + ": está entre 01 e 10");
		} else {
			System.out.println(num + ": não está entre 01 e 10");
		}
		if ((num >= 1) || (num <= 10)) {
			System.out.println(num + ": está entre 01 e 10");
		} else {
			System.out.println(num + ": não está entre 01 e 10");
		}
		if (!(num <= 10)) {
			System.out.println("negação");
		}
	}

	static void operadoresAtribuicao(int n1, int n2) {
		int ad, sub, mult, div, mod;
		System.out.println("Dado que recebi " + n1 + " e " + n2 + "\n" +
				"Posso fazer as seguintes operações usando 'OPERADOR DE ATRIBUIÇÃO'");

		ad = n1 += n2;
		sub = n1 -= n2;
		mult = n1 *= n2;
		div = n1 /= n2;
		mod = n1 %= n2;


		System.out.println(
						"Adição '+=': " + ad + "\n" +
						"Subtracao '-=': " + sub + "\n" +
						"Multiplicacão '*=': " + mult + "\n" +
						"Divisão '/=': " + div + "\n" +
						"Resto da divisão '%=': " + mod + "\n");
	}
	static void operadoresEsperciais(int idade) {
		String cidade = "Goiania", sexo = "Masculino";
		String x = idade >=18 ? "Você já é maiorde idade" : "Você ainda é menor de idade";
		System.out.println(x);
		System.out.println("Você é do sexo '"+sexo+"' e morador de '"+cidade +"'" );
	}

}
