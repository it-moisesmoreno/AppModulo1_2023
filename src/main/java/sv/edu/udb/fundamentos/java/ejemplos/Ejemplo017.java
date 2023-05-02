package sv.edu.udb.fundamentos.java.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int numerador = 0;
        int denominador = 0;
        try {
            System.out.println("Ingrese el numerador");
            numerador = in.nextInt();
            System.out.println("Ingrese el denominador");
            denominador = in.nextInt();
            System.out.println(numerador + "/" + denominador + " " + (numerador % denominador));
        } 
        catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser cero");
        }
        catch (InputMismatchException e) {
            System.out.println("Por favor solo ingrese números enteros");
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error");
           e.printStackTrace();
        }
        
        System.out.println("La aplicación sigue funcionando");
    }

}
