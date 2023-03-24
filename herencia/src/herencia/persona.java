/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author tarde
 */
public class persona {
    String nombre;
    String dni;
    double estatura;
}

class empleado extends persona { //la clase empleado coge los atributos de la clase persona
    double salario;
}