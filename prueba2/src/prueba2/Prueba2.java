/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;
import java.util.Scanner;

/**
 *
 * @author mars gaiming
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //% es el resto de la división
        Scanner sc = new Scanner (System.in);
        System.out.println("mete un número");
        int num;
        num = sc.nextInt();
        
        int x = num % 7; //entrada de la variable x = a un número que es resto 7
        int y = 7 - x; //entrada de la variable y = 7 - la variable x
        
        System.out.println("para ser múltiplo de 7 tiene que sumar " + y); //en la salida imprimir el mensaje con la variable y
    }
    
}
