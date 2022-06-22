package model; // package -> pacote (pasta) onde está a classe

import java.util.Calendar; // A classe Calendar não pertence ao pacote padrão(java.lang)

public class Participante { // class -> definir a classe Participante
    // atributos -> são características (variáveis) da classe	
    /*
     * tipo primitivo int - Classe Integer
     * tipo primitivo char - Classe Character
     * tipo primitivo boolean - Classe Boolean
     */
	private String nome, email, telefone; // String -> é uma classe, não existe tipo primitivo
	private int id; // int - tipo primitivo, que permitir armazenar um inteiro
	private char sexo; // char - tipo primitivo que armazena um caracter
	private boolean ativo; // boolean - tipo primitivo retorna true ou false
	private Calendar dataNascimento; // Calendar não pertence ao pacote padrão (java.lang)
	
	// métodos -> ação - comportamento da classe - regra de negócio
	/* Partes de um método
	 * nome
	 * parâmetro
	 * implementação
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
	   // return ativo?"Ativo":"Inativo"; // usando ternário
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
         return "O seu email é de administrador";
        else
         return "o seu email é de usuário normal";   
     }

	 public String respostaQuestao() {
	        if (ativo)
	            return "Sim";
	        else
	            return "Não";
	    }
	 
	 public String mostrarBloqueioIdade(int idade,String tipoParticipante) {
		 if(idade>=18 && tipoParticipante=="Juridica")
		 return "Você é maior de idade ou pessoa jurídica, pode participar do Leilão";
		 else
		 return "Menor de idade e não é pessoa jurídica, você não está autorizado a participar do Leilão";

		 }
	
}
