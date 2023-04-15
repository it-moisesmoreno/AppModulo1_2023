package sv.edu.udb.fundamentos.java.desafios;

import java.util.Scanner;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Desafio007 {

    /**
     * Cree una solución que permita ver una película si se cumplen las dos
     * condiciones: 1) El precio de la película sea mayor o igual a $25 2) La
     * clasificación de la película sea igual a 5 Muestra la salida como “Voy a
     * ir a ver la película” De lo contrario muestre “No vor a ir a ver la
     * película”
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        double precioPelicula;
        int clasificacionPelicula;
        Scanner input = new Scanner(System.in);

        // Toma de datos
        System.out.println("Ingrese precio pelicula: ");
        precioPelicula = input.nextDouble();
        System.out.println("Ingrese clasificacion pelicula: ");
        clasificacionPelicula = input.nextInt();

        // Impresión de resultados
        if (precioPelicula >= 25.0 && clasificacionPelicula == 5) {
            System.out.println("Voy a ir a ver la película");
        } else {
            System.out.println("No voy a ir a ver la película");
        }
        
        input.close();
    }

}
