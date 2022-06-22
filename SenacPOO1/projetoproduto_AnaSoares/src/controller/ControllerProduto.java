package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.ProdutoDAO;
import model.Produto;

public class ControllerProduto {

	public void pegarProduto(String nome,String descricao,String saldo) {
		Produto produto = new Produto(nome, descricao, saldo);
		
		try {
			ProdutoDAO dao = new ProdutoDAO();
			dao.insert(produto);
			JOptionPane.showMessageDialog(null,"gravado");
		} catch (SQLException e1) {
		
		
		}
	}

	

	
	
}
