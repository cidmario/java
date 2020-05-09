import java.util.*;

public class Aula11 {
	
	//	Aula11: Entrada de dados com Scanner
	

	public static void main(String[] args) {
		/// recuperar dados atráves da chamado do programa
		//System.out.println(args[0]);

		/// classe Scanner
		  Scanner s = new Scanner(System.in);
		  //System.out.println(s.nextLine());


		///recuperar dados interagindo com o Usuário
		 System.out.println ("Qual o Seu nome ? ");
		  String nome = s.nextLine();
		  System.out.println("Bem vindo " + nome);

		
	}
}