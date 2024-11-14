package p147_TercerExamenParcial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Juan Perez", 22, 'M', "Soltero", "Delantero", 1000.0));
        datos.add(new Jugador("Maria Jimenez", 18, 'F', "Soltera", "Portera", 1200.0));
        datos.add(new Jugador("Carlos Fuentes", 30, 'M', "Casado", "Defensor", 1100.0));
        return datos;
    }

    public static void grabarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }

    public static ArrayList<Jugador> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo));
        datos = (ArrayList<Jugador>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
}
