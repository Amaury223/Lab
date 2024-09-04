//Jaime Amaury Hernandez Frayre
import java.util.Scanner;

public class p50_ConversionTemperaturas {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner obj = new Scanner(System.in);
        char continuar;
        continuar='0';
        do {
            // Obtener temperatura inicial y final del usuario
            System.out.print("Ingrese la temperatura inicial en grados Centígrados: ");
            int tempInicial = obj.nextInt();
            System.out.print("Ingrese la temperatura final en grados Centígrados: ");
            int tempFinal = obj.nextInt();

            // Validar el rango
            if (tempFinal < tempInicial) {
                System.out.println("La temperatura final no puede ser menor que la temperatura inicial.");
                continue; // Volver a pedir los valores
            }

            // Mostrar tabla de conversiones
            System.out.println("------------------------------------");
            System.out.println("Centígrados   Farenheit");
            System.out.println("------------------------------------");

            for (int celsius = tempInicial; celsius <= tempFinal; celsius++) {
                double fahrenheit = (celsius * 9.0 / 5.0) + 32;
                System.out.printf("%d\t\t%.1f%n", celsius, fahrenheit);
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = obj.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        System.out.println("Programa terminado.");
       
    }
}