package sv.edu.udb.fundamentos.java.ejemplos;

import java.util.Scanner;

/**
 *
 * @author moica
 */
public class Ejemplo007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite su nota (del 1 al 100)");
        int nota = input.nextInt();
        
        char NotaLiteral;
        if(nota >= 90)
            NotaLiteral = 'A';
        else if(nota >= 80)
            NotaLiteral = 'B';
        else if(nota >= 70)
            NotaLiteral = 'C';
        else if(nota >= 60)
            NotaLiteral = 'D';
        else
            NotaLiteral = 'F';
        
        System.out.println("Nota: " + nota + " Nota Literal: " + NotaLiteral);
    }

}
