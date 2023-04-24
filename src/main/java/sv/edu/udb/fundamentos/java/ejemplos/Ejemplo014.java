package sv.edu.udb.fundamentos.java.ejemplos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Ejemplo014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"Erick Eduardo", "Mauricio Issac", "Alberto Estrada", "Neftali Alexander"};
        System.out.println("Recorrido arreglo utilizando for: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("nombres[" + i + "]" + " = " + nombres[i]);
        }
        
        System.out.println("***********************************************");
        System.out.println("Recorrido del arreglo utilizando foreach: ");
        
        // SINTAXIS
        // for (TIPO DE DATOS nombre_selcionado : nombre_arreglo){}
        int i=0;
        for (String nombre : nombres) {
            System.out.println("nombres[" + i + "]" + " = " + nombre);
            i++;
        }
    }

}
