package aulas;
import javax.swing.JOptionPane;
public class IMC {
	// IMC= pesoEmQuiloGramas / (alturaEmMetros * alturaEmMetros)

	public static void main(String[] args) {
		String peso = JOptionPane.showInputDialog("Qual o seu peso em 'quilogramas'?");
		String altura = JOptionPane.showInputDialog("Qual a sua altura em 'metros'?");

		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);
		String msg = (imc >= 20 && imc <= 25)? "Peso ideal": "Fora do peso ideal";

		msg = "IMC= " + imc + "\n" + msg;
		JOptionPane.showMessageDialog(null, msg);
		System.out.println(msg);
	}

}
