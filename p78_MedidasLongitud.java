
import java.util.Scanner;

public class p78_MedidasLongitud {
    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        int opcion;

        System.out.println("Menú de Conversiones:");
        System.out.println("1. Convertir pulgadas a centímetros");
        System.out.println("2. Convertir metros a pies");
        System.out.println("3. Salir");
        System.out.print("\nSeleccione una opción: ");
        opcion = obj.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese el valor en pulgadas: ");
            double pulgadas = obj.nextDouble();
            System.out.printf("\nLas pulgadas son igual a: " + pulgadasACentimetros(pulgadas) + " centimetros");
        } else if (opcion == 2) {
            System.out.print("Ingrese el valor en metros: ");
            double metros = obj.nextDouble();
            System.out.printf("\nLos metros son igual a: " + metrosAPies(metros) + " pies");
        } else if (opcion == 3) {
            System.out.println("Saliendo del programa.");
        } else {
            System.out.println("Opción inválida, por favor intente nuevamente.");
        }
    }
}