package sv.edu.udb.fundamentos.java.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Guiar al usuario a la solución
        //2. Guiar al desarrollador a la solución
        //3. Para que la aplicación continua funcionando normal
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Digite un número entero");
        try {
            num = in.nextInt();
            System.out.println("El cuadrado del número es " + Math.pow(num, 2));
        } catch (InputMismatchException e) {
            System.out.println("Ingreso solo números enteros");
        }
        System.out.println("La aplicación sigue funcionando.");
    }

}
