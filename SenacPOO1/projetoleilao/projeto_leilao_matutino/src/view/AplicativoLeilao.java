package view;

import javax.swing.JOptionPane;

import model.Item;
import model.Leilao;
import model.Participante;

public class AplicativoLeilao {

	public static void main(String[] args) { // rodar um aplica��o desktop
		Participante participante;
		Item item = new Item(); // criar o objeto
		Leilao leilao;
		
		// criar um objeto (inst�ncia um objeto)
		
		Participante participante2 = new Participante();
		participante2.trocarSexo('F');
		
		
		participante = new Participante();
		participante.trocarSexo('M');
		//participante.nome = "Glauco";
		//participante.email = "glaucoteacher@gmail.com";
	    JOptionPane.showMessageDialog(null, participante2.exibirSexo());
	}

}
