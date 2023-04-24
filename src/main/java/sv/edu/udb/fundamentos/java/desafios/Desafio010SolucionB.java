package sv.edu.udb.fundamentos.java.desafios;

/**
 * * 1. Realizar un programa que defina un arreglo llamado "edades" de 5 enteros
 * 2. Almacene en cada uno de los índices 5 edades aleatorias (utilice la clase
 * Math con su método random 3. Muestre en pantalla el tamaño del arreglo y el
 * valor de cada elemento.
 * 
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Desafio010SolucionB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // PASO 1: DECLARAR ARREGLO DE EDADES
        int[] edades = new int[5];

        // PASO 2: ASIGNAR VALORES(EDADES) AL ARREGLO 
        // Podemos poner el número 4 en la condición del for o
        // podemos utilzar las propiedades lenght del arreglo para
        // saber la cantidad de elementos
        // 0, 1, 3, 4
        for (int i = 0; i < edades.length; i++) {
            edades[i] = (int)(Math.random() * 100 + 1);
        }
        
        // PASO 3: IMPRIMIR LONGITUD DE ARREGLO
        System.out.println("Tamaño del arreglo: " + edades.length);
        
        // PASO 4: IMPRIMIR VALORES DEL ARREGLO
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad de la persona " + (i+1) + ":" + edades[i]);
        }

    }

}
