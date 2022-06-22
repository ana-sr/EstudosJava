package model; // pacote da classe
/* comentario */
 public class Leilao { // definir a classe Leilao
    private int id; // tipo inteiro id
    protected String dataInicio, dataTermino,
           horaInicio, horaTermino,
           descricao;
    
    private int calcularDias(){
    	return Integer.parseInt(dataTermino) - 
    		   Integer.parseInt(dataInicio);
    }
   
    int calcularHoras() {
    	return Integer.parseInt(horaTermino) - 
     		   Integer.parseInt(horaInicio);
    }
}
