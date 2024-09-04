import java.util.Scanner;
//Jaime Amaury Hernandez Frayre
public class p49_ParesDescendente {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner obj = new Scanner(System.in);
        char continuar;
        continuar='0';
        do {
            System.out.print("Ingresa un número para encontrar los pares descendentes desde 100: ");
            int n = obj.nextInt();

            if (n > 100) {
                System.out.println("El número debe ser menor o igual a 100.");
                continue;
            }

            int suma = 0;
            int count = 0;

            System.out.print("Números pares entre 100 y " + n + ": ");
            for (int i = 100; i >= n; i -= 2) {
                System.out.print(i + " ");
                suma += i;
                count++;
            }

            double promedio = (double) suma / count;
            System.out.println("\nLa suma: " + suma/10);
            System.out.println("El promedio: " + promedio);

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = obj.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

       
    }
}