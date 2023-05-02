package sv.edu.udb.fundamentos.java.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean numeroIncorrecto = true;
        while (numeroIncorrecto) {

            System.out.println("Digite un número entero");
            try {
                num = in.nextInt();
                System.out.println("El cuadrado del número es " + Math.pow(num, 2));
                numeroIncorrecto = false;
            } catch (InputMismatchException e) {
                System.out.println("Ingreso solo números enteros");
                in.next();
            }

        }

        System.out.println("La aplicación sigue funcionando.");

    }

}
