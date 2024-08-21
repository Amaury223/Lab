import java.io.Console;
import java.util.Scanner;

public class p23_ConvertirTemperatura {
    public static void main(String[] args) {

        int op;
        float temp, res;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Convertir de grados celcius a farenheit y viceversa\n");
        System.out.println("[1]farenheit a Centigrados");
        System.out.println("[2]centigrados a Farenheit ");
        System.out.print("Elije una opcion ? "); op = obj.nextInt();
       
        if( op == 1 ) {
            System.out.println("\nConvertir de Farenheit a Centigrados\n");
            System.out.print("Dame los grados Farenheit ? "); temp = obj.nextFloat();
            res = ( temp - 32 ) * 5 / 9;
            System.out.printf("%.2f Farenheit, equivale a %.2f Centigrados", temp, res);
            
        }
        else if( op == 2 ){
            System.out.println("\nConvertir de Centigrados a Farenheit\n");
            System.out.print("Dame los grados Centigrados ? "); temp = obj.nextFloat();
            res = ( temp * 9 / 5 ) + 32;
            System.out.printf("%.2f Centigrados, equivale a %.2f Farenheit", temp, res);
            
        }
        else
            System.out.println("\nAcaso estas .... loco");    
        
        System.out.println("\nGracias por utilizar este programa");
    }
}
