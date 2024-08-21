import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {
        
        int angulo1,angulo2,angulo3;
        Scanner obj = new Scanner(System.in);
        System.out.print("Ingresa el primer angulo del triángulo:  ");angulo1 = obj.nextInt();
        System.out.print("Ingresa el segundo angulo del triángulo: ");angulo2 = obj.nextInt();

        angulo3 = 180 - (angulo1 + angulo2);
        
        System.out.println("El angulo 3 es: " + angulo3);
        
    }
}
