package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Produto;

public class ProdutoDAO {
	private Connection conexao;
	private String sql;
	private PreparedStatement preparar;
	
	
	public ProdutoDAO() throws SQLException{
		this.conexao = new Conexao().getConexao();
	}
	
	public void insert(Produto produto) throws SQLException {
		sql ="INSERT INTO tbproduto(nome, descricao, saldo) VALUES (?,?,?)";
		preparar = conexao.prepareStatement(sql);
		preparar.setString(1, produto.getNome());
		preparar.setString(2, produto.getDescricao());
		preparar.setString(3, produto.getSaldo());
		preparar.execute();
		preparar.close();
	}
	

}
