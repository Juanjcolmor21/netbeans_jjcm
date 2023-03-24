/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba5;
import java.util.Scanner; //importar librería scanner

/**
 *
 * @author mars gaiming
 */
//hacer un programa que muestre tres números diga cual es mayor y menor 
public class Prueba5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //nuevo scanner
        System.out.println("Mete el primer número"); //muestra en pantalla mete el primer número
        int num1; //entrada del número 1
        num1 = sc.nextInt(); //scaner del número 1
        
        System.out.println("Mete el segundo número"); //muestra en pantalla mete el segundo número
        int num2; //entrada del número 2
        num2 = sc.nextInt(); //scaner del número 2
        
        System.out.println("Mete el tercer número"); //muestra en pantalla mete el tercer número
        int num3; //entrada del número 3
        num3 = sc.nextInt(); //scaner del número 3
        
        if(num1 > num2 && num1 > num3){ //si el número uno es mayor que el segundo
            System.out.println("El número uno es mayor");
        } if(num2 > num3 && num2 > num1){ //si el número dos mayor que el tercero
            System.out.println("El número dos es mayor");
        }else if(num3 > num1 && num3 > num1){ //si el número tres es mayor que el primero
            System.out.println("El número tres es mayor");
        } if(num1 < num2 && num1 < num3){
            System.out.println("El número uno es mennor");
        } if(num2 < num3 && num2 < num1){
            System.out.println("El número dos es menor");
        }else if(num3 < num1 && num3 < num2){
            System.out.println("El número tres es menor");
        }
    }
    
}
