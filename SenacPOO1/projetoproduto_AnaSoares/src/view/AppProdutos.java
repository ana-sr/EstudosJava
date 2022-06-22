package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Produto;
import dao.ProdutoDAO;
import controller.ControllerProduto;

public class AppProdutos extends JFrame {
	private JLabel lblNome, lblDescricao, lblSaldo;
    private JTextField txtNome,txtSaldo;
    private JButton btnSalvar;
    private JTextArea txtDescricao;

    
    public AppProdutos() {
		super("Cadastro de Produtos");
		setSize(500,500);
		setLocation(100,100);
		addComponents();
		setLayout(new FlowLayout());
		setVisible(true);
	}
    
    
    public void addComponents() {
    	lblNome = new JLabel("Nome do Produto:    ");
    	txtNome = new JTextField(30);
    	lblDescricao = new JLabel("Descrição :              ");
    	txtDescricao = new JTextArea(5, 30);
    	lblSaldo = new JLabel("Saldo :");
    	txtSaldo = new JTextField(5);
    	btnSalvar = new JButton("Salvar");  
    	btnSalvar.addActionListener(new ActionListener() {
    		

			 public static void main (String [] args) {
			    	AppProdutos appProdutos = new AppProdutos();
			    }

			@Override
			public void actionPerformed(ActionEvent e) {
				new ControllerProduto().pegarProduto(txtNome.getText(), txtDescricao.getText(), txtSaldo.getText());
				
			}

		});

    	
    	
    	add(lblNome); add(txtNome);
    	add(lblDescricao); add(txtDescricao);
    	add(lblSaldo); add(txtSaldo);
    	add(btnSalvar);
}
    
    
    
    public static void main (String [] args) {
    	AppProdutos appProdutos = new AppProdutos();
    }
}

