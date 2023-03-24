/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3;
import java.util.Scanner; //importar librería scanner

/**
 *
 * @author mars gaiming
 */
public class Prueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //hacer nuevo scanner
        System.out.println("Mete tu edad");
        int edad = 18; //entrada de  la variable edad
        edad = sc.nextInt();
        
        if (edad >= 18){ //si edad es mayor o igual a 10
            System.out.println("Es mayor de edad");
            }else { //si no
                System.out.println("Es menor de edad"); //muestra en pantalla es menor de edad
            }
    }
    
}
