import java.util.Scanner;

public class p06_PromedioCalificaciones {
    public static void main(String[] args) {
        
        float cal1, cal2, cal3;
        float suma, prom , min, max;
        cal1 = cal2 = cal3 = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calculando el promedio de 3 calificaciones, tambien la mayor y la menor de ellas: /n");
        System.out.println("Dame la calificacion 1 : "); cal1 = obj.nextFloat();
        System.out.println("Dame la calificacion 2 : "); cal2 = obj.nextFloat();
        System.out.println("Dame la calificacion 3 : "); cal3 = obj.nextFloat();

        suma = cal1 + cal2 + cal3;
        prom = suma / 3;
        max = Math.max(Math.max(cal1, cal2), cal3);
        min = Math.min(Math.min(cal1, cal2), cal3);
        
        System.out.println(String.format("/nLos valores de las calificaciones son %.2f , %.2f , %.2f/n",cal1,cal2,cal3));
        System.out.printf("La suma : %.2f \n",suma);
        System.out.printf("El promedio : %.2f \n",prom);
        System.out.printf("La menor : %.2f \n",min);
        System.out.printf("La mayor : %.2f \n",max);


    }
}
