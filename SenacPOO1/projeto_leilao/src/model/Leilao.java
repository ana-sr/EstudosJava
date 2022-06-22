package model;

class Leilao {
    int id;
    String dataInicio, dataTermino,
           horaInicio, horaTermino,
           descricao;
    
    int calcularDias(){
    	return Integer.parseInt(dataTermino) - 
    		   Integer.parseInt(dataInicio);
    }
   
    int calcularHoras() {
    	return Integer.parseInt(horaTermino) - 
     		   Integer.parseInt(horaInicio);
    }
}
