package model;

public class Lance {
	int id;
	LeilaoItem leilaoItem;
	Participante participante;
	double valorLance;
	
	boolean verificarLance(){
		if (valorLance > leilaoItem.item.lanceMinimo) {
			return true;
		}else{
			return false;
		}
		}
	}
