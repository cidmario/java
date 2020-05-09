
public class Aula10 {

	/*Aula 10: Classes WRAPPER são empacotadores de tipos primitivos. 
		 -> oferecem alguns recursos de conversão.
		 -> representa um envólucro de um tipo primitivo.
		 -> para cada tipo primitivo temos um empacotador desse tipo. 

	    	Byte bt = new Byte();
	    	Short s = new Short();
   	    	Integer i = new Integer();
			Float f = new Float();
			Double d = new Double();
			Long l = new Long();
			Character c = new Character();
			Boolean b = new  Boolean();		
         */ 

	public static void main(String[] args) {

		Double valorD = new Double("12.45");
		double d = valorD.doubleValue();
		double i = valorD.intValue();
		byte b = valorD.byteValue();

		//conversão estática - sem a necessidade de criar um novo objeto, usando os métodos estático das classes Wrapper
		double d1 = Double.parseDouble("123.45");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		int i2 = Integer.valueOf("101011", 2);

		System.out.println(i2);

	}

}