package view;

import javax.swing.JOptionPane;

import model.Consumidor;
import model.Endereco;
import model.Funcionario;
import model.NivelFuncionario;
import model.Passageiro;

public class AplicacaoAvaliacao {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua transversal");
		endereco.setNumero(06);
		endereco.setComplemento("Casa");
		endereco.setBairro("Morro Azul");
		endereco.setCidade("São Sebastião");
		endereco.setEstado("DF");
		endereco.setPais("Brasil");
		JOptionPane.showMessageDialog(null, endereco);

		Passageiro passageiro = new Passageiro();
		passageiro.setConsumidor(Consumidor.OTIMO);
		passageiro.setNumeroCartao("958746235");
		passageiro.setDocumento("0123456");
		JOptionPane.showMessageDialog(null, passageiro);

		Funcionario funcionario = new Funcionario();
		funcionario.setNivelfuncionario(NivelFuncionario.REGULAR);
		funcionario.setCodigo("012345");
		funcionario.setContaCorrente("745812");
		JOptionPane.showMessageDialog(null, funcionario);

	}

}
