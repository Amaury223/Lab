
import java.util.Scanner;

public class p90_Temperaturas {    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        float [] Temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        for (int i = 0; i<=8; i++){
            if (i==0) System.out.println(Temperaturas[i]);
            if (i==2) System.out.println(Temperaturas[i]);
        }
        for (int i = 0; i<=8; i++)
            System.out.print(Temperaturas[i] + "  ");
        
        System.out.println();
        
        for (int i = 0; i<=8; i++)
        if (Temperaturas[i]>10)
        Temperaturas[i]=0;
        
        System.out.println();

            for (int i = 0; i<=8; i++)
                System.out.print(Temperaturas[i] + "  ");
       
    }
}
