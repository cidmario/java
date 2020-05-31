package exercicios.issue_6;

public class Quadrado {
	public static void main(String[] args) {
		quadrado();
	}

	static void quadrado() {
		int quadrado;
		for (int i = 15; i <= 200; i++) {
			quadrado = i * i;
			System.out.println("O valor de "+ i +" ao quadado é >> "+ quadrado);
		}
	}
}
