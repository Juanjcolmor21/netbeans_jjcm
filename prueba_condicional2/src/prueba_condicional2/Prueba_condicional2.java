/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_condicional2;
import java.util.Scanner;

/**
 *
 * @author mars gaiming
 */
public class Prueba_condicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //hacer nuevo scanner
        System.out.println("mete un número"); //muestra en pantalla mete un número
        int num; //entrada del número
        num = sc.nextInt(); //scaner de número
        
        switch(num){ //condición múltiple
            case 1: System.out.println("es el número 1"); //caso 1 es el número 1
                    break; //rompe la secuencia
            case 2: System.out.println("es el número 2"); //caso 2 es el número 2
                    break; //rompe la secuencia
            case 3: System.out.println("es el número 3"); //caso 3 es el número 3
                    break; //rompe la secuencia
            case 4: System.out.println("es el número 4"); //caso 4 es el número 4
                    break; //rompe la secuencia
            case 5: System.out.println("es el número 5"); //caso 5 es el número 5
                    break; //rompe la secuencia
            default: System.out.println("El número no está en el rango de 1-5"); //no hay caso en la sentencia para números superiores a 5
        }
    }
    
}
