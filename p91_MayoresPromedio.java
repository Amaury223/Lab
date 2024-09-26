
import java.util.Scanner;

public class p91_MayoresPromedio {

    public static void Mostrar(float[] x) {
        System.out.println();
        System.out.print("Calificaciones: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static void guardarCalificaciones(Scanner obj, float[] cal, int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            cal[i] = obj.nextFloat();
        }
    }

    public static float Suma(float[] cals) {
        float suma = 0;
        for (int i = 0; i < cals.length; i++) {
            suma += cals[i];   
        }
        return suma;
    }

    public static float Promedio(float suma, int n){
        return suma / n;
    }

    public static int CalMayoresPromedio(float[] cals, float promedio) {
        int totalMayores = 0;
        System.out.println("\nCalificaciones mayores al promedio:");
        for (int i = 0; i < cals.length; i++) {
            if (cals[i] > promedio) {
                System.out.print(cals[i] + " ");
                totalMayores++;
            }
        }
        System.out.println();
        return totalMayores;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Cuantas calificaciones vas a ingresar?: ");
        int n = obj.nextInt();
        float [] cal = new float[n];

        guardarCalificaciones(obj, cal, n);
        Mostrar(cal);

        float suma = Suma(cal);
        float promedio = Promedio(suma, n);
        System.out.println("\nSuma: " + suma);
        System.out.println("\nPromedio: " + promedio);

        int totalMayores = CalMayoresPromedio(cal, promedio);
        System.out.println("\nCantidad de calificaciones mayores al promedio: " + totalMayores);
    }
}