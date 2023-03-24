/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_contador;
import java.util.Scanner; //importar librería scaner

/**
 *
 * @author mars gaiming
 */
public class Prueba_contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //hacer nuevo scanner
        System.out.println("Digitalize un número"); //muesta en pantalla digitalize un número
        int num = 1; //entrada de número entero igual a 1
        
        int contador; //entrada de contador como entero
        contador = sc.nextInt(); //scaner de contador
        
        while(num <= contador){ //bucle while contador mayor o igual a número
            System.out.println(num); //muestra en pantalla número
            num++; //número icrementa
        }
    }
    
}
