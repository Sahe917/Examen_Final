/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_final;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sahenndry Carreño
 */

public class Ejercicio2 {
    
    class nodo {

    String contenido;
    nodo sig;
    nodo(String valor){
      this.contenido = valor;
        
    }
      nodo L;
      
       nodo insertar (nodo n, String valor){
         
        if (L == null){
            L = new nodo(valor);
            return L;
            
        }else if (n.sig == null) {
            
            n.sig = new nodo (valor);
            return n.sig;
        }else {
            
            return insertar (n.sig, valor);
        }
       } 
        
        void read (String Nom, Ejercicio2 list) throws IOException {
             FileReader fr = new FileReader (Nom);
             BufferedReader br = new BufferedReader (fr);
             String lin;
             
                while ((lin = br.readLine()) != null){
                       
                     String [] datos = lin.split ("");
                       
                     for (int i=0; i<datos.length;i++){
                       
                        list.insertar(L, datos[i]); //no logro comprender el error.
                     }
                } 
        } 
        

    String imprimir(nodo n){
        if (n.sig == null) {
            return n.contenido;
        }
        return n.contenido + "-->" + imprimir(n.sig);
    
    }
    
    }
}
//espero que si lo lograra hacer correctamente, tantos nodos me suelen confundir
//el texto esta en Archivo.in (no se me ocurrio otro nombre que ponerle)