package sv.edu.udb.fundamentos.java.desafios;
import java.util.Scanner;
/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Desafio006 {

    /**
     * Desafío 006: Variables, operadores matemáticos, if else if.
     * Una zapatería ofrece un descuento del 15% sobre el total de compra y un cliente desea saber cuánto
     * deberá pagar finalmente por su compra.
     * El cliente tiene derecho al descuento del 15% si su compra es mayor o igual a 150, en cambio, si la
     * compra fuese menor a esa cantidad sólo tendrá derecho al 5% de descuento.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        double compra, descuento, total;
        Scanner input = new Scanner(System.in);
        
        // Toma de datos
        System.out.println("Digite el total de la compra:");
        compra = input.nextDouble();
        
        // Procesamiento de datos
        if( compra >= 150) 
            descuento = compra * 0.15;
        else
            descuento = compra * 0.05;
        
        descuento = Math.round(descuento * 100.0) / 100.0;
        total = Math.round((compra - descuento) * 100.0) / 100.0;
        
        // Impresión de resultados
        System.out.println("El descuento es: " + descuento);
        System.out.println("El total a pagar es: " + total);
    
        input.close();
    }

}
