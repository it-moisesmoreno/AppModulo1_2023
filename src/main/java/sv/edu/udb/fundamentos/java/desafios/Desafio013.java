package sv.edu.udb.fundamentos.java.desafios;

/**
 * Descargue el desafio 11 del aula virtual. No modifique el código que ya
 * contiene el archivo. Genere una contraseña de acuerdo a la longitud
 * solicitada por el usuario para letras, números y caracteres especiales. Este
 * ejercicio puede tener múltiples soluciones. La primera parte consiste en
 * generar aleatoriamente las letras, luego el texto aleatorio para numeros y
 * finalemente generar el texto para la cantidad de caracteres especiales
 * elegidos. Para la elección aleatoria de un elemento de un arreglo puede
 * utilizar la clase Random, la cual tiene el método nextInt que devuelve un
 * entero aleatorio entre 0 y el número pasado como argumento –1.
 *
 * Al ir agregando los elementos al arreglo, observará que el
 * arreglo_password_generado queda ordenado primero letras, luego numeros y
 * finalmente caracteres especiales. El siguiente paso será desordenarlo para
 * que no queden juntos. Investigue el uso del método shuffle de la clase
 * Collections para este punto.
 * 
 * Grupo:
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Desafio013 {

    public static void main(String[] args) {
        //*****VARIABLES******
        Scanner scanner = new Scanner(System.in);

        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
            "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
            "X", "Y", "Z"};

        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] caracteres = {"*", "_", "-", "$", "%", "/", "(", ")",
            "=", "[", "]", "+"};

        int longitud_password = 0;
        int cantidad_numeros = 0;
        int cantidad_caracteres = 0;
        int cantidad_letras = 0;
        String password = "";
        //********CAPTURA DE DATOS******************       

        System.out.println("¿De que longitud desea la contraseña a generar?");
        longitud_password = scanner.nextInt();

        String[] arreglo_password_generado = new String[longitud_password];

        System.out.println("¿Cantidad de letras?");
        cantidad_letras = scanner.nextInt();

        System.out.println("¿Cantidad de números?");
        cantidad_numeros = scanner.nextInt();

        cantidad_caracteres = longitud_password - cantidad_letras - cantidad_numeros;
        Random rand = new Random();

        rand.nextInt(100); //Genera un entero aleatorio entre 0 y 99

        //********PROCESO DE DATOS******************  
        // Generamos las letras
        for (int i = 0; i < cantidad_letras; i++) {
            arreglo_password_generado[i] = letras[rand.nextInt(letras.length)];
        }

        // Generamos los numeros
        for (int i = cantidad_letras; i < cantidad_letras + cantidad_numeros; i++) {
            arreglo_password_generado[i] = numeros[rand.nextInt(numeros.length)];
        }

        // Generamos los caracteres
        for (int i = cantidad_letras + cantidad_numeros; i < cantidad_letras + cantidad_numeros + cantidad_caracteres; i++) {
            arreglo_password_generado[i] = caracteres[rand.nextInt(caracteres.length)];
        }

        //********IMPRESIÓN DE RESULTADOS******************
        // Desordenamos el arreglo
        Collections.shuffle(Arrays.asList(arreglo_password_generado));

        System.out.println("");
        System.out.println("La clave generada es: ");

        for (int i = 0; i < arreglo_password_generado.length; i++) {
            password += arreglo_password_generado[i];
        }

        System.out.println(password);

    }

}
