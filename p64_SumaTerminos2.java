import java.util.Scanner;

public class p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i, n;
        long s, na;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            s = 0;
            System.out.print("Cuantos números ? ");
            n = obj.nextInt();

            na = 1;
            System.out.print("\nSalida: ");
            for (i = 1; i <= n; i++) {
                System.out.printf("%d %s", na, (i == n ? "" : "+ "));
                s += na;
                na = na * 10 + 1;
            }
            System.out.printf("\nSuma:  %d\n", s);
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}