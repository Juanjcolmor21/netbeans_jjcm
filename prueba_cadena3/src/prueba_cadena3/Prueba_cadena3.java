/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_cadena3;

/**
 *
 * @author alumno
 */
public class Prueba_cadena3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //conversion de char a int, viceversa
        //int e = 'a'; //asigna un carácter a una variable int
        //System.out.println(e); //muestra 97
        
        //e = '\u0061'; //asigna un carácter a una variable int
        //System.out.println(e); //muestra 97
        
        //char c = 97; //asigna un entero a una variable char
        //System.out.println(c); //muestra 'a'
        
        //converrsion con un cast
        
        char c = 'a';
        System.out.println((int) c); // muestra 97
        
        int e = 97;
        System.out.println((char) e); //muestra 'a'
    }
    
}
