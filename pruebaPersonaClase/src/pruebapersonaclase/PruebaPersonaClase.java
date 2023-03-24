/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapersonaclase;

/**
 *
 * @author tarde
 */

class persona{ 

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }
//clase persona
    private String nombre; //nombre
    private int edad; //edad

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
}

public class PruebaPersonaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona p; //persona es p hace referencia a clase persona
        p = new persona(); //se crea el objeto persona
        System.out.println(p); //muestra el objeto persona
        
        p.nombre = "Juan"; //nombre de la persona es juan
        p.edad = 18; //edad de la persona 18
        
        System.out.println("\n" + p.getNombre()); //muestra nombre
        
        System.out.println("\n" + p.getEdad()); //muestra edad
    }
    
}
