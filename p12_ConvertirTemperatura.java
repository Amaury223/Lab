import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        
        double celsius, fahrenheit;
        Scanner obj = new Scanner(System.in);
        System.out.print("Ingresa los grados fahrenheit a convertir a celsius: ");fahrenheit = obj.nextDouble();
        celsius = (fahrenheit - 32) * (5.0/9.0);
        System.out.print(String.format("\nLos grados fahrenheit %.2f \n Son %.2f grados celsius",fahrenheit,celsius));
    }
}
