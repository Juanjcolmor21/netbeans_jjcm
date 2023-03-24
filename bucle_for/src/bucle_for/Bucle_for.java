/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_for;
import java.util.Scanner;

/**
 *
 * @author mars gaiming
 */
public class Bucle_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mete un número");
        int num;
        num = sc.nextInt();
        
        //while(){} metes solo la condición
        
        for(int i = 1; i <= 10; i++){ //inicia con la variable i, la condición i es mayor o igual que 10, por lo que la i se incrementa
            System.out.println(i);
        }
    }
    
}
