package model;

class Lance {
     int id;
     LeilaoItem leilaoItem; // associa��o
     Participante participante; // associa��o
     double valorLance;
     
     boolean verificarLance(){
    	 if (valorLance > leilaoItem.item.lanceMinimo) {
    		 return true;
    	 }else {
    		 return false;
    	 }
     }
     
     
     
}
