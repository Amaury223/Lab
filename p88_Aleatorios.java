import java.util.Random;
import java.util.Scanner;
public class p88_Aleatorios {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Random rnd = new Random();
        int a1 =rnd.nextInt();
        int a2 =rnd.nextInt(30)+1;
        int min = 50 ;
        int max = 60 ;
        int a3 = rnd.nextInt(max-min + 1) + min ;
        System.out.println("Numero enterpo aleatorio positivo  : " + Math.abs(a1));
        System.out.println("Numero enterpo aleatorio 0...29    : " + Math.abs(a2));
        System.out.println("Numero enterpo aleatorio 50...60   : " + Math.abs(a3));
        
    }
}
