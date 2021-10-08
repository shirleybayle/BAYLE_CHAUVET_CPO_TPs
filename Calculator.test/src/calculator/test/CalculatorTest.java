/*TP0 
 * Calculator
 * BAYLE Shirley TDC
 * 27 Septembre 2021
 */
package calculator;
//modification
import java.util.Scanner;

/**
 *
 * @author shirl
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator :");
        System.out.println("1)add");
        System.out.println("2)substract");
        System.out.println("3)multiply");
        System.out.println("4)divide");
        System.out.println("5)modulo");
        int operateur;
        Scanner sc = new Scanner (System.in);
        operateur = sc.nextInt();
        while (operateur<1 || operateur>5) {
            System.out.println("Erreur, veuillez rentrer une valeur comprise entre 1 et 5.");
            operateur = sc.nextInt();
        }
        if (operateur>=1 && operateur<=5) {
        System.out.println("Choisissez un nombre.");
        int operande1;
        operande1 = sc.nextInt();
        int operande2;
        System.out.println("Choisissez un autre nombre.");
        operande2 = sc.nextInt();
        if (operateur == 1) {
            System.out.println(operande1+operande2);
        }
        else {
            if (operateur == 2) {
                System.out.println(operande1-operande2);
            }
            else {
                if (operateur == 3) {
                    System.out.println(operande1*operande2);
                }
                else {
                    if (operateur == 4) {
                        System.out.println(operande1/operande2);
                    }
                    else {
                    System.out.println(operande1%operande2);
                    }
                }
            }
        }
    }
    }
}
