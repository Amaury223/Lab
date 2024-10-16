package p106_Persona;

public class App {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan Perzas", "Sierra de Cardos 123",41);
        Persona p2 = new Persona("Maria", "Lo de Vega 34",25);

        Estudiante e1 = new Estudiante("Carlos Castaneda","Sierra Nevada 123",25,"Ing Software", 2009 , 700);
        Estudiante e2 = new Estudiante("Miguel Perez", "Av Hidalgo 345", 35, "Robotica", 2000,300);

        Apoyo a1 = new Apoyo("Pablo Brayan", "Av Mexico 114", 25, "Jardinero", "Preparatoria", 1500);
        Apoyo a2 = new Apoyo("Maclovia", "Lomas del Pedregal 145", 45, "Secreatria", "Lic Contabilidad", 2500);

        System.out.print("\033[H\033[2J");
        System.out.println("Personas");
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println("\nEstudiantes");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1 instanceof Persona);

        System.out.println("\nPersonal Apoyo");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1 instanceof Persona);
        
    }
}
