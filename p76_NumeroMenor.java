import java.util.Scanner;

public class p76_NumeroMenor {

    public static int NumMenor(int num1, int num2, int num3, int num4) {
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        if (num4 < menor) {
            menor = num4;
        }

        return menor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        System.out.println("Introduce el cuarto número: ");
        int num4 = scanner.nextInt();

        int menor = NumMenor(num1, num2, num3, num4);

        System.out.println("El menor de los cuatro números es: " + menor);
    }
}