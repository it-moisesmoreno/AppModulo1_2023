package sv.edu.udb.fundamentos.java.desafios;

/**
 * Crear una solución que imprima “divisible tres” cuando un numero sea
 * divisible entre 3, que imprima “divisible cinco” cuando un numero sea
 * divisible entre 5 y “divisible tres y cinco” cuando se divisible entre ambos.
 * Incluir los números del 1 al 100.
 *
 * Grupo: Alberto Jose Cubías Lopez, Damaris Raquel Sales Diaz Moisés Ernesto
 * Moreno Cartagena
 */
public class Desafio012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        int[] numeros = new int[100];

        // Inicialización de datos
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Procesamiento de datos e impresión
        for (int i = 0; i < 100; i++) {

            if (numeros[i] % 3 == 0 && numeros[i] % 5 == 0) {
                System.out.println("Divisible 3 y 5");
            } else if (numeros[i] % 3 == 0) {
                System.out.println("Divisible 3");
            } else if (numeros[i] % 5 == 0) {
                System.out.println("Divisible 5");
            } else {
                System.out.println(numeros[i]);
            }

        }
    }

}
