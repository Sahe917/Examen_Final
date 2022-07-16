/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_final;

/**
 *
 * @author Sahenndry Carreño
 */
public class Clientes {
    String nombre;
    int cedula;
    String tramite;
    
    Clientes siguiente;
    
     Clientes(String N, int CI) {
        this.nombre = N;
        this.cedula  = CI;
    }
public class Usuarios {
    
    String nombre;
    int valoracion;
    String experiencia;
    
    
    Usuarios(String N, int V, String E){
        this.nombre = N;
        this.valoracion = V;
        this.experiencia = E;
    
    }
    
     void mostrar(){
        System.out.println("Nombre: " + nombre + " Valoracion: " + valoracion + " Experiencia: " + experiencia); 
                        
    }
}
}
