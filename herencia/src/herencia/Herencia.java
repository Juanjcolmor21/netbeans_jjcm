/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author tarde
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        empleado e = new empleado();
        e.nombre = "Juanjo";
        e.dni = "12345678A";
        e.salario = 1000;
        e.estatura = 1.63;
        
        persona p = new persona();
        p.nombre = "José";
        p.dni = "12345678B";
        p.estatura = 1.75;
        
        System.out.println(e);
        System.out.println(p);
    }
    
}
