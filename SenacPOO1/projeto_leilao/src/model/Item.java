package model;

class Item {
   /* atributos da classe Item */
   int codigo; 
   String descricao; 
   float lanceMinimo; 
   boolean arrematado; 
   
   /* m�todos da classe Item*/
   String mostrarArrematado(){
	   return arrematado?"Item arrematado"
			   :"Item n�o arrematado";   
   }
   
   boolean verificarLanceMinimo(float lance){
	   if(lance>=lanceMinimo)
		   return true;
	   else
		   return false;
   }
   
   void inicializarDados(){ 
	   codigo=0;
	   descricao="";
	   lanceMinimo=0;
	   arrematado=false;		   
   }
}
