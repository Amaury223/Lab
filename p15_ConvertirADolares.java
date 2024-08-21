import java.util.Scanner;
public class p15_ConvertirADolares {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        float pesos,dolares;
        
        System.out.print("Ingresa la cantidad de pesos: ");pesos = obj.nextFloat();
        System.out.print("Ingresa la cotización del dólar: ");dolares = obj.nextFloat();
        System.out.print(String.format("La equivalencia en dólares es: %.130f",pesos/dolares));

    }
}
