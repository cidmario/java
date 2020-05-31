package exercicios.issue_5;

public class Soma {
	public static void main(String[] args) {
		soma();
	}

	static void soma() {
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma += i;
			System.out.println(i);
		}
		System.out.println(soma);
	}
}
