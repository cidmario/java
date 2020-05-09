import javax.swing.JOptionPane;

public class Aula12 {
	// Aula 12: Entrada Geafica de dados com JoptionPane.

	public static void main(String[] args) {

		//String nome = JOptionPane.showInputDialog("Qual o seu nome ? ");
		//System.out.println(nome);
		//JOptionPane.showMessageDialog(null, nome);

		//JOptionPane.showConfirmDialog(null, "Deseja Continuar ", "Confirme a mensagem a baixo:", JOptionPane.YES_NO_OPTION);

		 Object[] possiveisValores = {"Homem", "mulher", "Não sei quem sou"};
		 Object selecioneValor = JOptionPane.showInputDialog(null,
		 	"Como vc se considera? ", "Genero", JOptionPane.INFORMATION_MESSAGE, null, possiveisValores, possiveisValores[0]);		
		 JOptionPane.showConfirmDialog(null, selecioneValor);
	}

}