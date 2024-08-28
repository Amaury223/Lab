import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Ingresa el numero 1:  ");
        n1 = obj.nextInt();
        System.out.print("Ingresa el numero 2:  ");
        n2 = obj.nextInt();
        System.out.print("Ingresa el numero 3:  ");
        n3 = obj.nextInt();

        if (n1 >= 0 & n2 >= 0 & n3 >= 0) {
            if (n1 > n2 & n1 > n3)
                System.out.printf("El numero mayor es %d", n1);
            if (n2 > n1 & n2 > n3)
                System.out.printf("El numero mayor es %d", n2);
            if (n3 > n1 & n3 > n2)
                System.out.printf("El numero mayor es %d", n3);
        } else
            System.out.println("Los numeros no son enteros");

    }
}