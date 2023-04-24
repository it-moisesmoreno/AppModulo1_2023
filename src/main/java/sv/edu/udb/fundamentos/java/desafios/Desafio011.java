package sv.edu.udb.fundamentos.java.desafios;

/**
 * Escriba un programa que produzca la siguiente salida:
 *
 * Grupo: Alberto Jose Cubías Lopez, Damaris Raquel Sales Diaz Moisés Ernesto
 * Moreno Cartagena
 */
public class Desafio011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        int[] yardas = new int[10];
        double[] pulgadas = new double[10];

        // Inicialización 
        for (int i = 0; i < 10; i++) {
            yardas[i] = i + 1;
        }

        // Proceso de datos
        for (int i = 0; i < 10; i++) {
            pulgadas[i] = yardas[i] * 36;
        }

        // Imprimimos resultados
        System.out.println("Yardas  Pulgadas");
        for (int i = 0; i < 10; i++) {
            System.out.println(yardas[i] + "         " + pulgadas[i]);
        }
    }

}
