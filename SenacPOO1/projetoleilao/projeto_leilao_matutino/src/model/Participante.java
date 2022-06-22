package model; // package -> pacote (pasta) onde est� a classe

import java.util.Calendar; // A classe Calendar n�o pertence ao pacote padr�o(java.lang)

public class Participante { // class -> definir a classe Participante
    // atributos -> s�o caracter�sticas (vari�veis) da classe	
    /*
     * tipo primitivo int - Classe Integer
     * tipo primitivo char - Classe Character
     * tipo primitivo boolean - Classe Boolean
     */
	private String nome, email, telefone; // String -> � uma classe, n�o existe tipo primitivo
	private int id; // int - tipo primitivo, que permitir armazenar um inteiro
	private char sexo; // char - tipo primitivo que armazena um caracter
	private boolean ativo; // boolean - tipo primitivo retorna true ou false
	private Calendar dataNascimento; // Calendar n�o pertence ao pacote padr�o (java.lang)
	
	// m�todos -> a��o - comportamento da classe - regra de neg�cio
	/* Partes de um m�todo
	 * nome
	 * par�metro
	 * implementa��o
	 * tipo
	 */
	
	public void trocarSexo(char sexo) { // set
		this.sexo = sexo;
	}
	
	public char pegarSexo() { // get
		return sexo;
	}
	
	public String mostrarAtivo(){
	    if (ativo)
	    	return "Participante ativo";
	    else
	    	return "Participante inativo";
	   // return ativo?"Ativo":"Inativo"; // usando tern�rio
	}
	
	public String exibirSexo(){
		switch(sexo) {
		case 'M': return "Masculino";
		case 'F': return "Feminino";
		default: return "erro";
		}
		//return sexo=='M'?"Masculino":sexo=='F'?"Feminino":"Erro";
	}
	
	public int incrementarID(int incremento){
		return id+=incremento; // id = id + incremento
	}
	
	 public String mostrarEmail(){            
		 if(email=="adm@gmail.com")
         return "O seu email � de administrador";
        else
         return "o seu email � de usu�rio normal";   
     }

	 public String respostaQuestao() {
	        if (ativo)
	            return "Sim";
	        else
	            return "N�o";
	    }
	 
	 public String mostrarBloqueioIdade(int idade,String tipoParticipante) {
		 if(idade>=18 && tipoParticipante=="Juridica")
		 return "Voc� � maior de idade ou pessoa jur�dica, pode participar do Leil�o";
		 else
		 return "Menor de idade e n�o � pessoa jur�dica, voc� n�o est� autorizado a participar do Leil�o";

		 }
	
}
