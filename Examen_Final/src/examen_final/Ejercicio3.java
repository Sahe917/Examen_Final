/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_final;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author negro
 */
public class Ejercicio3 {

    /**
     * @utor Sahenndry Carreño
     */

   //queria que cada ejercicio fuera un main propio pero no me salio, 
    //asi que espero que no haya problema con dejarlos como clases.   
    public class cola {
    
    Clientes primero, ultimo;
    PrintWriter pw;
    int turno;
 
     public cola() {

        primero = null;
        ultimo = null;

    }
    
    boolean isEmpty() {
        return primero == null;

    }
    
    void insertar(String N, int CI) {
        Clientes nuevo = new Clientes (N, CI);
        if (isEmpty()) {
            primero = nuevo;
            ultimo = primero;

        } else {
            ultimo.siguiente = nuevo;
            ultimo = ultimo.siguiente;

        }

    }
   //pinches problemas en el codigo... no se en que me confundi...
    Clientesdequeue() throws IOException {

        if (!isEmpty()) {

            Clientes temp = new Clientes(primero.nombre, primero.cedula);
            primero = primero.siguiente;
            return temp;

        }
        System.out.println("La cola esta vacia. ");

    }
    
    void read(String Nom, cola C) throws IOException {

        FileReader fr = new FileReader(Nom);
        BufferedReader br = new BufferedReader(fr);
        String linea;

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split("//");
            
            C.insertar(datos[0], Integer.parseInt(datos[1]));
            
        }

    }
    
    
    void cedulacion() throws IOException{
    
        pw = new PrintWriter(new FileWriter("tramites.txt", true));
        
        turno++;    
        pw.println(turno + "cedula, tiempo estimado: " + "15 min");
        pw.close();
        
    }
    
    void pasaporte() throws IOException{
    
        pw = new PrintWriter(new FileWriter("tramites.txt", true));
        
        turno++;    
        pw.println(turno + "pasaporte, tiempo estimado: " + "20 min");
        pw.close();
    }
    
    void documentos() throws IOException{
    
        pw = new PrintWriter(new FileWriter("tramites.txt", true));
        
        turno++;    
        pw.println(turno + "retiro de documentos, tiempo estimado: " + "3 min");
        pw.close();
    
    }
  }

}
    

