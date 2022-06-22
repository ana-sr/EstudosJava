package model;
// java é fortemente tipado
public class Item {
   /* atributos da classe Item */
   int codigo; // byte, short, long
   String descricao; // String é uma classe, não existe tipo primitivo
   float lanceMinimo; // double
   boolean arrematado; // true ou false
   
   /* métodos da classe Item*/
   // possui 4 partes: nome, parâmetro(),implementação{}, tipo
   String mostrarArrematado(){
	   /*if(arrematado)
		   return "Item arrematado";
	   else
		   return "Item não arrematado";*/
	   
	   // usando ternário
	   return arrematado?"Item arrematado"
			   :"Item não arrematado";   
   }
   
   boolean verificarLanceMinimo(float lance){
	   if(lance>=lanceMinimo)
		   return true;
	   else
		   return false;
	   //return lance>=lanceMinimo?true:false;
   }
   
   void inicializarDados(){ // caso não tenha return, use void
	   codigo=0;
	   descricao="";
	   lanceMinimo=0;
	   arrematado=false;		   
   }
   
   
   
}
