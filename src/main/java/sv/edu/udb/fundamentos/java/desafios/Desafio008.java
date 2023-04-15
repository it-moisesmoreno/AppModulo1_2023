package sv.edu.udb.fundamentos.java.desafios;

import java.util.Scanner;

/**
 * Solicitar al usuario que digite el nombre del día. Cuando se digite lunes(sin
 * importar mayusculas o minúsculas) muestre en pantalla “Inicio de semana”.
 * Cuando se digite martes, miercoles o jueves muestre en pantalla “Media
 * semana” Cuando se digite viernes que muestre en pantalla “Fin de semana
 * laboral” Cuando digite sabado o domingo que muestre en pantalla “Fin de
 * semana”
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Desafio008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        String dia;
        Scanner in = new Scanner(System.in);
        
        // Solicitud de data
        System.out.println("Digite el día: ");
        dia = in.nextLine();
        dia = dia.toLowerCase();
        
        // Salida
        switch(dia){
            case "lunes" -> System.out.println("Inicio de seamana");
            case "martes", "miercoles", "jueves" -> System.out.println("Media semana");
            case "viernes" -> System.out.println("Fin de semana laboral");
            case "sabado", "domingo" -> System.out.println("Fin de semana");
            default -> System.out.println("Día inválidoF");
        }
        
        in.close();
    }

}
