import java.util.Scanner;

public class p54_ArribaAbajo {
    public static void main(String[] args) {
        int n, op;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Numeros de 1 a N... [1]");
            System.out.println("Numeros de N a 1... [2]");
            System.out.println("Salir ............. [3]");
            System.out.print("\nElije: ");
            op = obj.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nHasta donde?: ");
                    n = obj.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.printf("%d ", i);
                    }
                    break;
                case 2:
                    System.out.print("\nDesde donde?: ");
                    n = obj.nextInt();
                    for (int i = n; i >= 1; i--) {
                        System.out.printf("%d ", i);
                    }
                    break;
                case 3:
                    System.out.print("\nTe vas porque quieres nadie te corre");
                    break;

                default:
                    System.out.print("\nOpcion invalida");
                    break;
            }
            System.out.println("\n\nPresiona <Enter> para continuar");
            obj.nextLine();
            obj.nextLine();
        } while (op != 3);
        System.out.println("\nProceso Ternimado...");
    }
}