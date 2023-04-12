package sv.edu.udb.fundamentos.java.ejemplos;

import java.util.Scanner;
//import sv.edu.udb.fundamentos.java.desafios.Desafio02;

/**
 *
 * @author moica
 */
public class Ejemplo005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        String nombre;
        String apellido;
        String estadoCivil;
        int edad;
        float estaturaMetros;
        
        Scanner datos = new Scanner(System.in);
        
        //Desafio02 objeto =  new Desafio02();
        // Captura de datos
        System.out.println("Digite su nombre:");
        nombre = datos.nextLine();
        
        System.out.println("Digite su apellido:");
        apellido = datos.nextLine();
        
        System.out.println("Digite su estado civil:");
        estadoCivil = datos.nextLine();
        
        System.out.println("Digite su edad:");
        edad = datos.nextInt();
        
        System.out.println("Digite su estatura en metros:");
        estaturaMetros = datos.nextFloat();
        
        // Impresión o salida de datos
        System.out.println("Su nombre completo es: " + nombre + " " + apellido);
        System.out.println("Su estado civil es: " + estadoCivil);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su estatura en metros es: " + estaturaMetros);
    }

}
