
//Jaime Amaury Hernandez Fryare
import java.util.Scanner;

public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner obj = new Scanner(System.in);
        int edad, participante = 1, rechazados = 0;
        int alumnosT = 0, docentesT = 0, trabajadoresT = 0, hombresT = 0, mujeresT = 0, totalP = 0, promEdad = 0;
        int montoA = 0, montoD = 0, montoT = 0, montoTotal = 0;
        char op, sexo, tipo;
        String nombre;
        
        do {
            System.out.println("----------------------------------------");
            System.out.print("Participante " + participante + "\n");
            System.out.print("Ingresa el nombre del participanete: ");
            nombre = obj.nextLine();obj.nextLine();

            System.out.print("Ingresa la edad: ");
            edad = obj.nextInt();
            System.out.print("(H)ombre  -  (M)ujer ");
            sexo = Character.toUpperCase(obj.next().charAt(0));
            System.out.println("(A)lumno  -  (D)ocente  -  (T)rabajador");
            tipo = Character.toUpperCase(obj.next().charAt(0));

            if (edad >= 23) {
                promEdad = promEdad + edad;
                System.out.println("----------------------");
                System.out.printf("Bienvenido, has pasado\n");
                System.out.printf("%s \n%d\n", nombre, edad);
                if (sexo == 'H') {
                    System.out.println("Hombre");
                    hombresT++;
                } else {
                    System.out.println("Mujer");
                    mujeresT++;
                }

                switch (tipo) {
                    case 'A':
                        montoA = montoA + 40;
                        montoTotal = montoTotal + 40;
                        alumnosT++;
                        break;
                    case 'D':
                        montoD = montoD + 60;
                        montoTotal = montoTotal + 60;
                        docentesT++;
                        break;
                    case 'T':
                        montoT = montoT + 80;
                        montoTotal = montoTotal + 80;
                        trabajadoresT++;
                        break;

                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                participante++;

            } else {
                rechazados = rechazados + 1;
                System.out.printf("Has sido rechazado %d", rechazados);
            }
            System.out.print("\nDeseas continuar (S/N) ? ");
            op = Character.toUpperCase(obj.next().charAt(0));

        } while (op != 'N');
        System.out.println("--------");
        System.out.printf("\n\nAlumnos Totales     : %d", alumnosT);
        System.out.printf("\nDocentes Totales      : %d", docentesT);
        System.out.printf("\nTrabajadores Totales  : %d", trabajadoresT);
        System.out.printf("\nHombres Totales       : %d", hombresT);
        System.out.printf("\nMujeres Totales       : %d", mujeresT);
        System.out.printf("\nParticipantes Totales : %d", participante);
        System.out.printf("\nPromedio de edad      : %d", promEdad / participante);
        System.out.printf("\nRechazados Totales    : %d", rechazados);
        System.out.printf("\n\nDinero total recaudado de Alumnos     : $ %d", montoA);
        System.out.printf("\nDinero total recaudado de Docentes      : $ %d", montoA);
        System.out.printf("\nDinero total recaudado de trabajadores  : $ %d", montoA);
        System.out.printf("\nDinero total recaudado                  : $ %d", montoTotal);

        if (montoTotal<50) {
            System.out.println("\nEl evento concluye con ganancias BAJAS");
        } else if(montoTotal>50 & montoTotal<1000){
            System.out.println("\nEl evento concluye con ganancias MODERADAS");
            
        } else System.out.println("\nEl evento concluye con BUENAS ganancias");
        System.out.println("\n\n");
    }
}
