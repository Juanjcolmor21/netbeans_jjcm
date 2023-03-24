/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mars gaiming
 */
public class Prueba4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in); //leer lo que ponga por teclado
        BufferedReader buffer = new BufferedReader(capturarTeclado); //leer buffer, hacer captura para el teclado
        
        System.out.println("Mete tu edad");
        String strEdad = buffer.readLine(); //leer la variable edad que se ponga por teclado
        
        Integer edad = Integer.parseInt(strEdad); //edad se covierte a número entero
        
        if (edad >= 18){ //si edad es mayor o igual a 10
            System.out.println("Es mayor de edad");
            }else { //si no
                System.out.println("Es menor de edad"); //muestra en pantalla es menor de edad
            }
    }
    
}
