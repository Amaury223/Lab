import java.util.Scanner;

public class p79_SumaMultiplos {
    public static int SumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        int ini, fin, constante;

        System.out.println("Menú de Suma de Múltiplos:");
        System.out.println("[1] Sumar múltiplos de 3");
        System.out.println("[2] Sumar múltiplos de 4");
        System.out.print("\nSelecciona una opción [1 o 2]: ");
        int opcion = obj.nextInt();

        if (opcion == 1) {
            constante = 3;
        } else if (opcion == 2) {
            constante = 4;
        } else {
            System.out.println("Opción inválida.");
            return;
        }

        System.out.print("\nIngrese el valor inicial: ");
        ini = obj.nextInt();
        System.out.print("\nIngrese el valor final  : ");
        fin = obj.nextInt();

        if (ini >= fin) {
            System.out.println("El rango no es válido. Asegúrese de que ini < fin.");
        } else {
            System.out.printf("\nLa suma de los multiplos de " + constante + " entre " + ini + " y " + fin + " es: %d",
                    SumaMultiplos(ini, fin, constante));
        }
    }
}