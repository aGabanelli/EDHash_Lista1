package view;
import controller.DoceiraController;
import javax.swing.JOptionPane;
import model.Chocolate;
public class Principal {

	public static void main(String[] args) {
		DoceiraController doceCont = new DoceiraController();
		int opc = 0;
		
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1- Adicionar Barra\n2- Listar Receitas\n9- Finalizar"));
			
			switch(opc) {
			case 1:
				try {
					Chocolate chocolate = new Chocolate();
					int volume = Integer.parseInt(JOptionPane.showInputDialog("Digite o volume da barra de chocolate:"));
					chocolate.setVolume(volume);
					doceCont.identificarDoce(chocolate);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
				
			case 2:
				try {
					doceCont.listarReceitas();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Finalizando...");
				System.exit(0);
				
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida");
					break;
			}
		}
		
	}

}