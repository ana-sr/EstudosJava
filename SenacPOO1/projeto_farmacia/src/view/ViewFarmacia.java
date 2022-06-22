package view;

import model.Produto;
import model.TipoPerfumaria;
import model.Medicamento;
import model.Perfumaria;

public class ViewFarmacia {
	public static void main(String[] args) {
	
		Produto produto = new Produto();
		Medicamento medicamento = new Medicamento();
		Perfumaria perfumaria = new Perfumaria();
		
		produto.setPreco(100);
		produto.setNome("Café");
		produto.setTipo('N');
		produto.setCodigo(1020);
		
		TipoPerfumaria tipoPerfumaria = new TipoPerfumaria();
		tipoPerfumaria.setNome("Creme");
		tipoPerfumaria.setDesconto(0.5);
		
		medicamento.setNome("Sigmatriol");
	    medicamento.setPreco(67);
	    medicamento.setCodigo(2020);
	    medicamento.setFaixa("vermelha");
	    medicamento.setBula("duas vezes ao dia");
	    medicamento.setDataValidade(null);
	    medicamento.setTipo('N');
	   
	    perfumaria.setPreco(19);
		perfumaria.setNome("Creme Nivea");
		perfumaria.setTipo('N');
		perfumaria.setTipoPerfumaria(tipoPerfumaria);
		    
	}
}
