import java.util.Scanner;

public class p52_NumerosNa1 {
    public static void main(String[] args) {
        int n, p;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Numeros de n a 1 con paso de p\n");
        System.out.print("Desde donde?: ");
        n = obj.nextInt();
        System.out.print("\nPaso?: ");
        p = obj.nextInt();

        for (int i = n; i > 1; i -= p) {
            System.out.printf("%d ", i);
        }
    }
}