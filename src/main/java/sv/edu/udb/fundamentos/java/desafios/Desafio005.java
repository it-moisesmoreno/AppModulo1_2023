package sv.edu.udb.fundamentos.java.desafios;

import java.util.Scanner;

/**
 * Desafío 005: Variables, operadores matemáticos, if else if, precedencia de operadores,
 * conversiones
 * Crear una aplicación que devuelva el IMC (Índice de masa corporal de una persona).
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Desafio005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        double estatura, peso, imc, imcRedondeado;
        Scanner input = new Scanner(System.in);

        // Toma de datos
        System.out.println("Digite su estatura en metros:");
        estatura = input.nextDouble();

        System.out.println("Digite su peso en kilogramos:");
        peso = input.nextDouble();

        // Procesamiento de datos
        imc = peso / (Math.pow(estatura, 2));
        imcRedondeado = Math.round(imc * 100.0) / 100.0;
        
        // Impresión de resultados
        System.out.print("Imc: " + imc);
        System.out.println("");
        System.out.print("El cáculo de su IMC es: " + imcRedondeado);
        System.out.println("");

        if (imcRedondeado < 18.5) {
            System.out.print("Usted tiene Bajo peso");
        } else if (imcRedondeado < 24.9) {
            System.out.print("Usted tiene Rango normal");
        } else if (imcRedondeado < 29.9) {
            System.out.print("Usted tiene Sobrepeso");
        } else {
            System.out.print("Usted tiene Obesidad");
        }
    }
}
