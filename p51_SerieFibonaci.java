//Jaime Amaury Hernandez Frayre
import java.util.Scanner;

public class p51_SerieFibonaci {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char continuar;
        continuar='0';
        
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            // Obtener el número de términos del usuario
            System.out.print("¿Número de términos que deseas imprimir?: ");
            int n = obj.nextInt();

            // Validar la entrada
            if (n <= 0) {
                System.out.println("El número de términos debe ser mayor que 0.");
                continue; // Volver a pedir el número de términos
            }

            // Imprimir los primeros n términos de la serie de Fibonacci
            System.out.println("Los primeros " + n + " términos de la sucesión Fibonacci son:");
            imprimirFibonacci(n);

            // Preguntar al usuario si desea continuar
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = obj.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Programa terminado.");
        
    }

    // Método para imprimir los primeros n términos de la serie de Fibonacci
    public static void imprimirFibonacci(int n) {
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}