import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        
        double hipotenusa,longitud1,longitud2;
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingresa la longitud 1: ");longitud1 = obj.nextDouble();
        System.out.println("Ingresa la longitud 2: ");longitud2 = obj.nextDouble();

        hipotenusa = Math.sqrt((longitud1 * longitud1) + (longitud2*longitud2));
        System.out.println("La Hipotenusa es: "+ hipotenusa);
       
    } 
}
