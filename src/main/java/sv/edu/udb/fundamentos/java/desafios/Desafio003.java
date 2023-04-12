package sv.edu.udb.fundamentos.java.desafios;

import java.util.Scanner;

/**
 *
 * @author moica
 */
public class Desafio003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite la edad del usuario: ");
        int edad = input.nextInt();
        boolean conductorMenorEdad = false;

        if (edad <= 18) {
            conductorMenorEdad = true;
        }

        System.out.println("conductorMenorEdad: " + conductorMenorEdad);
    }

}
