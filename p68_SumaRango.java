import java.util.Scanner;
public class p68_SumaRango {

    public static int SumaRango(int ini , int fin){
        int suma = 0;
        for (int i =ini; i<=fin ; i++){
            suma = suma + i;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner obj = new Scanner(System.in);
        int ini , fin  , suma = 0;

        do {
            System.out.print("Dame el inicio ? "); ini = obj.nextInt();
            System.out.print("Dame el fin    ? "); fin = obj.nextInt();
        } while (ini>fin);
        suma = SumaRango(ini, fin);
        System.out.println("\nLa suma del rango es " + suma);
        System.out.println("\n");
    }
}
