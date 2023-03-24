/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones_2;
import java.util.Scanner;

/**
 *
 * @author mars gaiming
 */
public class Funciones_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //hacer nuevo scanner
        System.out.println("Mete un número"); //muestra en pantalla mete un número
        int num; //entrada de número como entero
        num = sc.nextInt(); //scaner del número
        
        eco(num); //llamada de la función eco con la variable num
    }
    
    static void eco(int a){ //funcion vacia eco, entrada de a
        for(int i = 0; i < a; i++){ //bucle for con la entrada de i igual a cero
            System.out.println("Eco..."); //muestra en pantalla Eco...
        }
    }
}
