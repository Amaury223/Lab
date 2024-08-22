import java.util.Scanner;
public class p28_LeyDeNewton {
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
         float f,m,a;
         char op;
         System.out.print("\033[H\033[2J");

         System.out.println("Elige lo que deseas calcular");
         System.out.println("[F]uerza       ( f = m * a )");
         System.out.println("[M]asa         ( m = f / a )");
         System.out.println("[A]celeracion  ( a = f / m )");
         System.out.println("[S]alir del sistema...");
         System.out.print("Elige una opcion ? "); op = obj.next().charAt(0);
         op = Character.toUpperCase(op);
         f = m = a = 0;

         if( op == 'F' ){
            System.out.println("Calculando la Fuerza");
            System.out.print("Dame la Masa        ? "); m = obj.nextFloat();
            System.out.print("Dame la Aceleracion ? "); a = obj.nextFloat();
            f = m * a;
            System.out.printf("\nLa Fuerza es %.2f \n",f);


        } else if( op == 'M' ){
                System.out.println("Calculando la Masa");
                System.out.print("Dame la Fuerza      ? "); f = obj.nextFloat();
                System.out.print("Dame la Aceleracion ? "); a = obj.nextFloat();
                 m = f / a;
                 System.out.printf("\nLa Masa es %.2f \n",m);


        } else if( op == 'A'){
                System.out.println("Calculando la Aceleracion");
                System.out.print("Dame la fuerza    ? "); f = obj.nextFloat();
                System.out.print("Dame la Masa      ? "); m = obj.nextFloat();
                a = f / m;
                System.out.printf("\nLa Aceleracion es %.2f \n",a);


        } else if( op == 'S'){
                System.out.println("Te vas por que yo quiero que te vayas, a la hora que yo quiera te detengo");
        } else
                System.out.println("Opcion invalida...");
        System.out.println("Jale o no jale nos vamos a lonchar ...\n");
    }
}
