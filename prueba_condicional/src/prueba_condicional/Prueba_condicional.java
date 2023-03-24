/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_condicional;
import java.util.Scanner;

/**
 *
 * @author mars gaiming
 */
public class Prueba_condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //hacer nuevo scaner
        System.out.println("mete un número"); //muestra en pantalla mete un número
        int num; //entrada de la variable número
        num = sc.nextInt(); //escaner de número
        
        int dato = 5; //entrada de la variable dato es igual a 5
        
        /* operadores
        == es igual
        < es menor
        <= es menor o igual
        > es mayor
        >= es mayor o igual
        ? es ternario
        */
        
        /*
        if si se cumple la condición
        else no se cumple la condición
        */
        
        if (num == dato){ //si el número es igual a la variable dato muestra en pantalla el número es 5
            System.out.println("el número es 5");
        } else{ //si no muestra en pantalla el número es diferente de 5
            System.out.println("el número es diferente de 5");
        }
    }
    
}
