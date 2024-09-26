
import java.util.Random;

public class p93_ParesImpares {

    public static void Mostrar(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void NumerosAleatorios(int[] nums) {
        Random aleatorio = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = aleatorio.nextInt(21);
        }
    }

    public static void Pares(int[] nums) {
        int Pares = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
                Pares++;
            }
        }
        System.out.println("\nCantidad de números pares: " + Pares);
    }

    public static void Impares(int[] nums) {
        int Impares = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                System.out.print(nums[i] + " ");
                Impares++;
            }
        }
        System.out.println("\nCantidad de números impares: " + Impares);
    }
    
    public static void main(String[] args) {
        int[] numsA = new int[100];
        int[] numsB = new int[100];
        
        System.out.print("\033[H\033[2J");System.out.flush();
        NumerosAleatorios(numsA);

        System.out.println("Elementos del arreglo:");
        Mostrar(numsA);

        System.out.println("\nNúmeros pares:");
        Pares(numsA);

        System.out.println("\nNúmeros impares:");
        Impares(numsA);
    }
}