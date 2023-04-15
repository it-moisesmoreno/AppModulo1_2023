package sv.edu.udb.fundamentos.java.ejemplos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i == 10) {
                System.out.println(i);
            } else {
                System.out.println("0" + i);
            }
            i++;
        } while (i <= 10);
    }

}
