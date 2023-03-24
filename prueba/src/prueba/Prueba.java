/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author mars gaiming
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Juanjo"; //cadena de carácteres con variable nombre
        int followersInstagram = 2180; //variable Integer para almacenar números enteros
        String frase1 = "Hola mi nombre es " + nombre + ", tengo " + followersInstagram + " followers"; 
        //cadena de carácteres con variable frase es Hola mi nombre es + variable nombre + , tengo 2180 + variable followersInstagram + followers
        
        int followersYT = 5650;
        String frase2 = "Hola mi nombre es " + nombre + ", tengo " + (followersInstagram + followersYT) + " followers";
        /*cadena de carácteres con variable frase es Hola mi nombre es + variable nombre + , tengo + variable followersInstagram 2180 + 
        folowers YT 5650 + total followers*/
        
        System.out.println(frase2); //muestra la variable nombre en pantalla
    }
    
}
