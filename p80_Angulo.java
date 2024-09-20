import java.util.Scanner;

public class p80_Angulo {
    public static String tipoAngulo(int angulo) {
        if (angulo < 90) {
            return "Agudo";
        } else if (angulo == 90) {
            return "Recto";
        } else if (angulo > 90 && angulo < 180) {
            return "Obtuso";
        } else if (angulo == 180) {
            return "Llano";
        } else if (angulo > 180 && angulo < 360) {
            return "Cóncavo";
        } else {
            return "Ángulo no válido";
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        int angulo;

        System.out.print("Ingrese un ángulo entre 0 y 360 grados: ");
        angulo = obj.nextInt();

        if (angulo >= 0 && angulo <= 360) {
            System.out.printf("\nEl tipo de ángulo es: %s", tipoAngulo(angulo));
        } else {
            System.out.println("Ángulo no válido. Debe estar entre 0 y 360 grados.");
        }
    }
}