/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sv.edu.udb.fundamentos.java.ejemplos;

/**
 *
 * @author moica
 */
public class Ejemplo003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        
        // Convencion para variables: Las variables inician con minúsculas y
        // si tienen más de una palabra las demás palabras inician con
        String nombre, apellido;
        String estadoCivil;
        int edad;
        float estatura;
        double velocidadKmHora = 20.4;
        
        // Asignar valores a las variables
        nombre = "Salvador";
        apellido = "Peña";
        estadoCivil = "Soltero";
        edad = 23;
        estatura = 1.55f;
        
        System.out.println("Su nombre completo es: " + nombre + " " + apellido);
        System.out.println("Su estado civil es: " + estadoCivil);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su estatura es: " + estatura + "metros");
        System.out.println("Su velocidad en Kilómetros por hora es: " + velocidadKmHora);
        
        
    }
    
}
