import java.util.Scanner;
public class p91_MayoresPromedio {

    public static int suma(int n,int[] x){
        int suma=0;

        for (int i = 0 ; i<=n ; i++){
            suma = suma + x[i]; 
        }
        return suma;
    }
    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        
        int n,x;
        
        System.out.print("Numero de calificaciones? ");n=obj.nextInt();
        int [] calificaciones = new int[n];

        for(int i = 0; i<n ; i++){
            System.out.println("Calificacion " + i + " ? ");x = obj.nextInt();
            calificaciones[i]=x; 
        }

        System.out.println(calificaciones);
        suma(n, calificaciones);
    }
}