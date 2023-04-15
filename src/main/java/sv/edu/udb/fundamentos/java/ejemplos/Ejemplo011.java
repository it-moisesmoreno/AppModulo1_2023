package sv.edu.udb.fundamentos.java.ejemplos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desde el 1 hasta el 10 con incremento de 1
        int i = 1;
        while(i <= 10){
            if (i == 10) {
                System.out.println(i);
            } else {
                System.out.println("0" + i);
            }
            i++;
        }
        System.out.println("******");
        
        // Desde el 10 hasta el 1 con decremento de 1
        i = 10;
        while(i >= 1){
            if (i == 10) {
                System.out.println(i);
            } else {
                System.out.println("0" + i);
            }
            i--;
        }
        System.out.println("******");
        
        // Desde el 2 hasta el 10 con incremento de 2
        i = 2;
        while(i <= 10){
            if (i == 10) {
                System.out.println(i);
            } else {
                System.out.println("0" + i);
            }
            i+=2;
        }
    }

}
