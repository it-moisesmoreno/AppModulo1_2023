package sv.edu.udb.fundamentos.java.ejemplos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo010 {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Uso de bucle for
        // operadores de incremento
        // sintaxis

        // for desde 0 hasst 10 con incrementos de 1
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.println(i);
            } else {
                System.out.println("0" + i);
            }
        }

        System.out.println("***************************");

        // for desde 10 hasst 1 con decrementos de 1
        for (int i = 10; i >= 1; i--) {
            if (i == 10) {
                System.out.println(i);
            } else {
                System.out.println("0" + i);
            }
        }

        System.out.println("***************************");
        // for desde 2 hasta 10 con incrementos de 2
        for (int i = 2; i <= 10; i = i + 2) {
            if (i == 10) {
                System.out.println(i);
            } else {
                System.out.println("0" + i);
            }
        }
    }

}
