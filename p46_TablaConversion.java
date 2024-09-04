import java.util.Scanner;

public class p46_TablaConversion {
    public static void main(String[] args) {

        int ini, fin, c;
        char resp;
        float tc = 20.74f, te = 25.00f;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Tabla de conversion de $ peso a dolares");
            do {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.print("Dame inicio : ");
                ini = obj.nextInt();
                System.out.print("Dame fin    : ");
                fin = obj.nextInt();
            } while (fin <= ini);// Valida que inicio sea menor que fin
            c = ini;
            System.out.println("Peso \t\t   Dollar \t Euro");
            System.out.println("----------------------------");
            while (c <= fin) {
                System.out.printf("%10d \t %10.2f \t %10.f \n", c, c * tc, c * te);
                c++;
            }
            System.out.println("----------------------------");
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
    }
}
