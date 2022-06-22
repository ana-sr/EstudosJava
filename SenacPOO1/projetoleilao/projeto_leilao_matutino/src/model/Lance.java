package model;

class Lance {
     int id;
     LeilaoItem leilaoItem; // associação
     Participante participante; // associação
     double valorLance;
     
     boolean verificarLance(){
    	 if (valorLance > leilaoItem.item.lanceMinimo) {
    		 return true;
    	 }else {
    		 return false;
    	 }
     }
     
     
     
}
