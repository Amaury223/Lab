import java.util.Scanner;
public class p41_ProcesaCalificaciones {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        int n,C;
        float cal ,suma = 0 , prom = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calcular la suma y el promedio de n calificaciones \n");
        System.out.println("Cuantas calificaciones ?"); n =obj.nextInt();
        
        C = 1;
        while (C<=n) {
            System.out.printf("Caklificacion %d = ",C);
            cal = obj.nextFloat();
            suma = suma + cal;
            C++;
        }
        prom = suma / n;
        System.out.printf("La suma es         :%.2f\n",suma);
        System.out.printf("El promedio es     :%.2f\n",prom);
            
        )

    }
}
