package sv.edu.udb.fundamentos.java.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        Scanner in = new Scanner(System.in);
        int edad;

        // Captura de datos
        System.out.println("Digite su edad: ");
        edad = in.nextInt();

        // If aninado o dependiente
        if (edad < 0) {
            System.out.println("Fase pre natal");
        } else if (edad >= 0 && edad < 6) {
            System.out.println("Infancia");
        } else if (edad >= 6 && edad < 12) {
            System.out.println("Niñez");
        } else if (edad >= 12 && edad < 20) {
            System.out.println("Adolescencia");
        } else if (edad >= 20 && edad < 60) {
            System.out.println("Adultez");
        } else {
            System.out.println("Ancianidad");
        }

        in.close();
    }

}
