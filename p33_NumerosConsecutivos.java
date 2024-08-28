import java.util.Scanner;

public class p33_NumerosConsecutivos {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("Ingresa el numero 1:  ");
        n1 = obj.nextInt();
        System.out.print("Ingresa el numero 2:  ");
        n2 = obj.nextInt();
        System.out.print("Ingresa el numero 3:  ");
        n3 = obj.nextInt();
        if (n2 == n1 + 1 & n3 == n2 + 1 | n2 == n3 - 1 & n1 == n2 - 1)
            System.out.printf("\nLos numeros %d-%d-%d son consecutivos", n1, n2, n3);

        else
            System.out.println("No son consecutivos");

    }
}