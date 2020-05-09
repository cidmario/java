public class HelloWorld {
	public static void main(String[] args) {
		
	System.out.print("utilizando \"\\\" \n");
	System.out.println("Utilizar \"aspas\" no texto");


	//tipos de variaveis
	int idade =31;
	double preco = 12.45;
	char sexo ='M';
	Boolean casado = true;

	byte b = 127; // cem
	short s = 32767; // até 32 mil
	int i = 2_000_000_000; // até 2 bilhões
	long l = 9_000_000_000_000_000_000L; // 9 quintilhões
	double d = 1.7976931348623157E+308; //IEEE 754 
	float f = 123F; // IEEE 754


	byte bb = 0b01010101; //formato binario > 8 bits ou 1 byte
	short ss = 0b0101010101010101; // formato binario > 16 bits ou 2 bytes
	int ii = 0b01010101010101010101010101010101; //formato binario > 32 bits ou 4 bytes 


	//cast Implícito:
	// i = s; 
	// System.out.println("Cast Implícito:");
	// System.out.println(s);
	// System.out.println(i);

	//cast explícito
	i = (int) l;
	System.out.println("Cast Explícito");
	System.out.println(l);
	System.out.println(i);









		
	}

}