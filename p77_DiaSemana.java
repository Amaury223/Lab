import java.util.Scanner;

public class p77_DiaSemana {
    public static String DiaSemana(int dianum) {
        String dia = "X";
        switch (dianum) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;

            default:
                dia = "Dia invalido";
                break;
        }
        return dia;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);

        int dianum;

        System.out.print("Dime un número del 1 al 7 y te dire el dia de la semana: ");
        dianum = obj.nextInt();

        System.out.printf("\nEl dia de la semana es: %s", DiaSemana(dianum));
    }
}