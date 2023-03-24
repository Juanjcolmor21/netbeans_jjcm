/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;
import java.util.Scanner; //importar librería scanner

/**
 *
 * @author mars gaiming
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //factorizar es multiplicar dos números para que de el número resultante
        
        int resultado = sumaNumeros(1, 10); //llamada de la función variable resultado igual a suma de números 1 y 10
        
        System.out.println(resultado); //muestra en pantalla resultado
    }
    
    static int sumaNumeros(int a, int b){ //función suma de números entrada de a y b
        int resultado = a + b; //entrada del resultado
        return resultado; //devuelve el valor de resultado
    }
    
}
