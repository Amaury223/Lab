import java.util.Scanner;
public class p14_CalculoTiempo {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int horas;
        System.out.print("Ingresa las horas: ");horas = obj.nextInt();
        System.out.print(String.format("\nLos dias son %d",horas/24));
        System.out.print(String.format("\nLos minutos son %d",horas*60)); 
        System.out.print(String.format("\nLos Segundos son %d",horas*60*60)); 
    }
}
