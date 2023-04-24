package sv.edu.udb.fundamentos.java.ejemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Crear un arreglo que almacene 4 notas(por simplicidad para corroborar los
 * cálculos serán solo 4 en el ejemplo) ● Solicitar al usuario que digite las 4
 * notas (Scanner) ● Recorrer el arreglo y calcular la nota mayor y el promedio
 * de las notas.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dft = new DecimalFormat("#.##");
        double[] notas = new double[4];
        double notaMayor = 0.0;
        double sumaTotal = 0.0;
        
        // Lectura de datos
        System.out.println("*** Introducir las notas del estudiante ***");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota número " + i + ": ");
            notas[i] = scanner.nextDouble();
            sumaTotal += notas[i]; // sumtaTotal = sumaTotal + notas[i]
        }
        
        // Procesar los datos
        // Encontrar la nota mayor
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > notaMayor){
                notaMayor = notas[i];
            }
        }
        
        // Mostrar resultados
        System.out.println("");
        System.out.println("*****NOTAS*****");
        System.out.println("Nota1 | Nota2 | Nota3 | Nota4");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " | ");
        }
        System.out.println("");
        System.out.println("Promedio: " + dft.format(sumaTotal/notas.length));
        System.out.println("Nota mayor: " + dft.format(notaMayor));
    }

}
