import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        int cont;

        System.out.print("[1]Asia\n");
        System.out.print("[2]Africa\n");
        System.out.print("[3]America del Norte\n");
        System.out.print("[4]America del Sur\n");
        System.out.print("[5]Antartida\n");
        System.out.print("[6]Europa\n");

        System.out.print("\n\nIngresa el continente:  ");
        cont = new Scanner(System.in).nextInt();
        switch (cont) {
            case 1:
                System.out.println("\nElejiste Asia\n");
                break;
            case 2:
                System.out.println("\nElejiste Africa\n");
                break;
            case 3:
                System.out.println("\nElejiste America del Norte\n");
                break;
            case 4:
                System.out.println("\nElejiste del Sur\n");
                break;
            case 5:
                System.out.println("\nElejiste Antartida\n");
                break;
            case 6:
                System.out.println("\nElejiste Europa\n");
                break;

            default:
                System.out.println("\nElije uno correcto\n");
                break;
        }
    }
}
