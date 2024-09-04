import java.util.Scanner;
//Jaime Amaury Hernandez Frayre
public class p48_ImparesAscendente {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner obj = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Ingresa un número para encontrar los impares: ");
            int n = obj.nextInt();

            int suma = 0;
            int count = 0;

            System.out.print("Números impares entre 1 y " + n + ": ");
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
                suma += i;
                count++;
            }

            double promedio = (double) suma / count;
            System.out.println("\nLa suma: " + suma);
            System.out.println("El promedio: " + promedio);

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = obj.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        
    }
}