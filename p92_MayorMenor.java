
import java.util.Scanner;

public class p92_MayorMenor {
    public static void guardarNumeros(int[] nums, Scanner obj) {
        System.out.println("\nIngrese los " + nums.length + " números: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = obj.nextInt();
        }
    }

    public static void mostrarNumeros(int[] nums) {
        System.out.println("\nElementos del arreglo:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int Mayor(int[] nums) {
        int mayor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > mayor) {
                mayor = nums[i];
            }
        }
        return mayor;
    }

    public static int Menor(int[] nums) {
        int menor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < menor) {
                menor = nums[i];
            }
        }
        return menor;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números a capturar: ");
        int n = obj.nextInt();

        int[] nums = new int[n];

        guardarNumeros(nums, obj);
        mostrarNumeros(nums);

        int mayor = Mayor(nums);
        int menor = Menor(nums);

        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}