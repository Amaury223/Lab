import java.util.Scanner;
public class p39_Numeros1a100 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        System.out.println("Imprimiendo los numeros de 1 a n ");
        System.out.println("Hasta donde        ? "); int n = new Scanner(System.in).nextInt();
        System.out.println("En incrementos de  ? "); int i = new Scanner(System.in).nextInt();

        int C = 0;
        while (C<=n){
            System.out.printf("%d ",C);
            C = C + i;
        }
        System.out.println("\nEl ciclo ha terminado");
        System.out.println(C);
    }
}
