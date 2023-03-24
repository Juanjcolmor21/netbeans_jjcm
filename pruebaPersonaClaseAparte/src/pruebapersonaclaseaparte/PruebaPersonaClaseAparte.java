/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapersonaclaseaparte;

/**
 *
 * @author tarde
 */
public class PruebaPersonaClaseAparte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona p; //persona es p hace referencia a clase persona
        p = new persona(); //se crea el objeto persona
        System.out.println(p); //muestra el objeto persona
        
        p.nombre = "Juan"; //nombre de la persona es juan
        p.edad = 18; //edad de la persona 18
        
        System.out.println("\n" + p.nombre); //muestra nombre
        
        System.out.println("\n" + p.edad); //muestra edad
    }
    
}
