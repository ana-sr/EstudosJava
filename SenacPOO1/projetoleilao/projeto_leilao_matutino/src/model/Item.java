package model;
// java � fortemente tipado
public class Item {
   /* atributos da classe Item */
   int codigo; // byte, short, long
   String descricao; // String � uma classe, n�o existe tipo primitivo
   float lanceMinimo; // double
   boolean arrematado; // true ou false
   
   /* m�todos da classe Item*/
   // possui 4 partes: nome, par�metro(),implementa��o{}, tipo
   String mostrarArrematado(){
	   /*if(arrematado)
		   return "Item arrematado";
	   else
		   return "Item n�o arrematado";*/
	   
	   // usando tern�rio
	   return arrematado?"Item arrematado"
			   :"Item n�o arrematado";   
   }
   
   boolean verificarLanceMinimo(float lance){
	   if(lance>=lanceMinimo)
		   return true;
	   else
		   return false;
	   //return lance>=lanceMinimo?true:false;
   }
   
   void inicializarDados(){ // caso n�o tenha return, use void
	   codigo=0;
	   descricao="";
	   lanceMinimo=0;
	   arrematado=false;		   
   }
   
   
   
}
