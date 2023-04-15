package sv.edu.udb.fundamentos.java.ejemplos;

import java.util.Scanner;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        Scanner in = new Scanner(System.in);
        int mes;

        System.out.println("Digite el número del mes");
        mes = in.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("De Febrero a Abril");
                break;
            case 5:
            case 6:
                System.out.println("De Mayo a Junio");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("De Julio a Diciembre");
                break;
            default:
                System.out.println("El número ingresado no corresponde a ningún mes");

        }
       
        in.close();
    }

}
