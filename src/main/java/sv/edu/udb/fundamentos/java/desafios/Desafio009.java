package sv.edu.udb.fundamentos.java.desafios;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Desafio009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 2) {
            if (i == 10) {
                System.out.println(i);
            } else {
                System.out.println("0" + i);
            }
        }
    }

}
