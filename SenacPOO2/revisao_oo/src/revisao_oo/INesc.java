package revisao_oo;

import java.util.Scanner;

public class INesc {
	// Method
	String nomeCurso;
	
	// Constructor
	
	public INesc() {
		
	}
	
	public INesc(String nome) {
		nomeCurso = nome;
	}

	public void setNomeCurso (String nome) {
		nomeCurso = nome;
	}
	
	public String getNomeCurso () {
		return nomeCurso;
	}
	
	public void MostrarMensagem() {
		System.out.println("Bem vindo ao Curso; " + getNomeCurso());	
	}//end method
	
	//main
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		INesc obj = new INesc ("Desenvolvimento de Sistemas");
		
		//chama o method MostrarMensagem 
		obj.MostrarMensagem();//lembrar de passar o parametro
		obj.setNomeCurso("Analise de desenvolvimento");
		obj.MostrarMensagem();
		
		System.out.printf("Digite o nome do curso");
		String aux= input.nextLine();//let string do teclado
		obj.setNomeCurso(aux);
		obj.MostrarMensagem();
		
		INesc obj2 = new INesc();
		obj2.MostrarMensagem();
		obj2.setNomeCurso("ads");
		obj2.MostrarMensagem();
	}
	
}
