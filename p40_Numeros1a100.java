import java.util.Scanner;
public class p40_Numeros1a100 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        System.out.println("Imprimiendo los numeros de 100 a n ");
        System.out.println("Desde donde deseas descender        ? "); int C = new Scanner(System.in).nextInt();
        System.out.println("En decremntos  de  ? "); int d = new Scanner(System.in).nextInt();

        
        while (C>=1){
            System.out.printf("%d ",C);
            C = C - d;
        }
        System.out.println("\nEl ciclo ha terminado");
        System.out.println(C);
    }
}