package sv.edu.udb.fundamentos.java.desafios;

/**
 * 1. Realizar un programa que defina un arreglo llamado "edades" de 5 enteros
 * 2. Almacene en cada uno de los índices 5 edades aleatorias (utilice la clase
 * Math con su método random 3. Muestre en pantalla el tamaño del arreglo y el
 * valor de cada elemento.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Desafio010SolucionA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Corrreción de errores
        int[] notas = new int[20];
        
        // PASO 1: DECLARAR ARREGLO DE EDADES
        int[] edades = new int[5];

        // PASO 2: ASIGNAR VALORES(EDADES) AL ARREGLO Número aleatorio entre 1 y 100
        edades[0] = (int)(Math.random() * 100 + 1);
        edades[1] = (int)(Math.random() * 100 + 1);
        edades[2] = (int)(Math.random() * 100 + 1);
        edades[3] = (int)(Math.random() * 100 + 1);
        edades[4] = (int)(Math.random() * 100 + 1);
        /*for (int i = 0; i < edades.length; i++) {
            double randNumber = Math.random();
            int randomInt = (int) (randNumber * 100) + 1;
            edades[i] = randomInt;
        }*/
        
        // PASO 3: IMPRIMIR LONGITUD DE ARREGLO
        System.out.println("Tamaño del arreglo: " + edades.length);
        
        // PASO 4: IMPRIMIR VALORES DEL ARREGLO
        /*for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad "+ (i+1) +": " + edades[i]);
        }*/
        System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
        System.out.println(edades[3]);
        System.out.println(edades[4]);

    }

}
