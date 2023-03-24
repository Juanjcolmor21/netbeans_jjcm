/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso_aplicación_interfaz_gráfica_bucle_while;
import java.util.Scanner; //importar librería scaner
import javax.swing.*; //importar libreria interfaz gráfica

/**
 *
 * @author mars gaiming
 */
public class Acceso_aplicación_interfaz_gráfica_bucle_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //hacer nuevo scanner
        String clave = "Juanjo"; //cadena de caracter clave es juanjo
        
        String password = ""; //cadena de caracter password es vacia
        
        while(clave.equals(password) == false){ //bucle while el texto clave no es igual al texto password
            password = JOptionPane.showInputDialog("Pon la contraseña"); //la variable password muestra una ventana para meter la contraseña
            
            if(clave.equals(password) == false){ // si el texto clave no es igual al texto password
                System.out.println("Contraseña incorrecta"); //muestra en pantalla contraseña incorrecta
            }
        }
        
        System.out.println("Acceso permitido"); //muestra en pantalla acceso permitido
    }
    
}
