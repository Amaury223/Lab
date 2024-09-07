import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {

        int i, n;
        double s;
        char resp;

        Scanner obj = new Scanner(System.in);

        do {

            System.out.print("\033[H\033[2J");System.out.flush();

            s = 0;
            System.out.print("Cuantos números ? ");
            n = obj.nextInt();

            System.out.print("\nSalida: ");
            for (i = 1; i <= n; i++) {
                System.out.printf("1/%d %s", i, (i == n ? "" : "+ "));
                s += 1.0 / i;
            }
            System.out.printf("\nSuma:  %f\n", s);
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}