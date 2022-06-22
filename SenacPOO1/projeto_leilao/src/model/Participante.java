package model; 

import java.util.Calendar;

class Participante {
	//atributos
	int id; 
	String nome;
	char sexo;
	Calendar dataNascimento;
	String tipoParticipante;
	int numero_lances;
	String email;
	boolean ativo;
	
	
	//metodos
	 boolean verificarlancefeito (){
		   if(numero_lances>0)
			   return true;
		   else
			   return false;
	 }
	 String mostrarAtivo() {
		 if (ativo)
			 return "PArticipante Ativo";
		 else
			 return "Participante Inativo";
	 }
}
