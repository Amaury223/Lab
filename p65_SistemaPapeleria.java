//Jaime Amaury Hernandez Frayre
//Progra para calcular copias en una papeleria
import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);
        int venta = 1, carta = 0, oficio = 0, doble = 0, cantidad, total = 0, totalT = 0;
        int cartaT = 0, oficioT = 0, dobleT = 0;
        char op, tipo;

        System.out.print("-------------------------------");
        System.out.print("\nPapeleria la Malena, SA. de CV");
        System.out.print("\nSistema de ventas de copias");
        System.out.print("\n-------------------------------\n\n");

        do {
            System.out.printf("Venta %d", venta);
            System.out.print("\nTipo de copia  (C)arta $3,  (O)ficio $4,  (D)oble of $6? ");//Tipo de copia
            tipo = Character.toUpperCase(obj.next().charAt(0));
            System.out.print("Cantidad? ");//Cantidad de copias
            cantidad = obj.nextInt();

            switch (tipo) {
                case 'C'://Copias tipo Carta
                    carta = carta + cantidad;
                    cartaT = cartaT + (cantidad * 3);
                    total = total + cantidad;
                    totalT = totalT + cartaT;
                    break;
                case 'O'://Copias tipo Oficio
                    oficio = oficio + cantidad;
                    oficioT = oficioT + (cantidad * 4);
                    total = total + cantidad;
                    totalT = totalT + oficioT;
                    break;
                case 'D'://Copias tipo Doble
                    doble = doble + cantidad;
                    dobleT = dobleT + (cantidad * 6);
                    total = total + cantidad;
                    totalT = totalT + dobleT;
                    break;

                default://Otras opciones
                    System.out.println("\n\nOpcion Incorrecta");
                    break;
            }

            venta = venta + 1;
            System.out.print("Deseas continuar (S/N) ? ");//Preguntar para repetir ciclo
            op = Character.toUpperCase(obj.next().charAt(0));
            System.out.println();
        } while (op != 'N');

        venta = venta - 1;

        //Reporte de ventas totales
        System.out.print("\n\n-------------------------------");
        System.out.print("\nResumen diario de ventas");
        System.out.print("\n-------------------------------");
        System.out.printf("\n\nVentas realizadas: %d", venta);
        System.out.print("\n------------------------");
        System.out.printf("\nCarta       : %2d  -  $ %2d", carta, cartaT);
        System.out.printf("\nOficio      : %2d  -  $ %2d", oficio, oficioT);
        System.out.printf("\nDoble of.   : %2d  -  $ %2d", doble, dobleT);
        System.out.print("\n------------------------");
        System.out.printf("\nTot. Ventas : %d  -  $ %d\n\n", total, totalT);
        //Tipo de venta
        if (totalT < 50) {
            System.out.println("Esta venta es una  :  venta moderada\n\n");
        } else if (totalT >= 50 & totalT <= 100) {
            System.out.println("Esta venta es una  :  venta frecuente\n\n");
        } else
            System.out.println("Esta venta es una  :  venta superada\n\n");

    }
}
