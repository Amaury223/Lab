import java.util.Scanner;
public class p38_AceptarEstudiante_v2 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        char Sexo;
        int edad,cal1,cal2,cal3;
        float prom;

        System.out.println("Universidad Kitty Kat SA\n");

        System.out.println("Ingresa tu sexo \n[H]ombre\n[M]ujer"); Sexo = new Scanner(System.in).next().charAt(0);
        Sexo = Character.toUpperCase(Sexo);

        System.out.println("Ingresa tu edad: ");edad = new Scanner(System.in).nextInt();

        System.out.print("\nIngresa la primera calificacion: ");cal1 = new Scanner(System.in).nextInt();
        System.out.print("\nIngresa la segunda calificacion: ");cal2 = new Scanner(System.in).nextInt();
        System.out.print("\nIngresa la tercera calificacion: ");cal3 = new Scanner(System.in).nextInt();

        prom= ( (cal1 + cal2 + cal3) / 3 );
        if (Sexo=='H') 
            System.out.println("\n\nNo se aceptan hombres en esta universidad\n");
        else 
            if (prom>=8 & prom<=9.5) { 
                if (edad>21) 
                    System.out.println("\n\nIngresaste a Universidad Kitty Kat SA\n");
                else 
                    System.out.println("\n\nNo cumples con la edad\n");
        
            }
            else 
                System.out.println("\n\nNo cumples con las calificaciones\n");

    }
}
