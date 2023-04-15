package sv.edu.udb.fundamentos.java.desafios;
import java.util.Scanner;
/**
 * Desafío 004: Variables,, if – else , uso de módulo (%)
 * Completa el ejercicio siguiente:
 * Se quiere conocer si un número es par o impar, soliticitar al usuario que ingrese un número y en la
 * salida indicar si este es un par o impar.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Desafio004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        int numero;
        Scanner input = new Scanner(System.in);
        
        // Toma de datos
        System.out.println("Digite un número entero:");
        numero = input.nextInt();
        
        // Impresión de resultados
        if(numero%2 == 0)
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");
    }

}
