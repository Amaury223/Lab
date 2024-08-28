import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);

        int cal1, cal2, cal3, cal4, cal5;
        float prom;

        System.out.print("\nIngresa la primera calificacion:  ");
        cal1 = obj.nextInt();
        System.out.print("\nIngresa la segunda calificacion:  ");
        cal2 = obj.nextInt();
        System.out.print("\nIngresa la tercera calificacion:  ");
        cal3 = obj.nextInt();
        System.out.print("\nIngresa la cuarta calificacion:  ");
        cal4 = obj.nextInt();
        System.out.print("\nIngresa la quinta calificacion:  ");
        cal5 = obj.nextInt();

        prom = ((cal1 + cal2 + cal3 + cal4 + cal5) / 5);
        if (prom > 0 & prom <= 6)
            System.out.println("Quedas reprobado");
        else if (prom > 6 & prom <= 7)
            System.out.println("Pasas de panzazo");
        else if (prom > 7 & prom <= 8)
            System.out.println("Muy bien, puedes mejorar");
        else if (prom > 8 & prom <= 9)
            System.out.println("Excelente sigue así");
        else if (prom > 9 & prom <= 10)
            System.out.println("Perfecto tu esfuerzo valió la pena");
    }
}
