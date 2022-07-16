/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_final;

/**
 *
 * @author negro
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
       String[][] data = {
           {"Silvestre Cardenas", "8"}, {"Andres Lopez","1"}, {"Andreina Gonzales","5"},
           {"Maria Lopez","0"}, {"Armando Paredes", "10"}
       };
       MostrarSatis(data); 
    }
    
    public static void MostrarSatis(String[][] valores){
         for (String[] cliente:valores){
           String E_Cliente = "clasificacion no registrada";
           int satisfaccion = Integer.valueOf (cliente[1]);
           
             if (satisfaccion<1){
                 E_Cliente="El cliente no entendio";
             }
             
             if ((satisfaccion >0)&&(satisfaccion <5)) {
                 E_Cliente= "El cliente no esta satisfecho";
             }
             
             if (satisfaccion == 5){
                 E_Cliente= "El cliente esta neutro";
             }
             
             if ((satisfaccion >5)&&(satisfaccion <9)) {
                 E_Cliente= "El cliente esta satisfecho";
             }
             
             if ((satisfaccion >8)&&(satisfaccion <11)) {
                 E_Cliente= "El cliente esta muy satisfecho";
             }
             
             System.out.println("El cliente" + cliente[0] + "Tiene un nivel de satisfaccion con respecto a las llamadas de atencion de" + satisfaccion + "por ende" + E_Cliente);
         }
    }
       public static String[] CompletarLista (String[] lista, String texto){
            String [] arrayTexto = texto.split("");
            
            if(arrayTexto.length >1){
            lista[lista.length]=arrayTexto[0];
            String texto_aux="";
                
               for (int i=1; i< arrayTexto.length; i++){
                  texto_aux="+texto_aux";
               }
               return CompletarLista(lista, texto_aux);
            }else{
               return lista;
            }
       }

}
//segundo intento del ejercicio, creo que quedo mejor, hasta diria que mas aceptable
// lastimosamente no consegui el error y mi frustracion aumento.