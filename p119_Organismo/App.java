package p119_Organismo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Perro miperro = new Perro("Firulais");
        Perico miperico = new Perico("Chip");


        System.out.println("Mi perro se llama " + miperro.getNombre());
        miperro.respiracion();
        miperro.movimiento();
        miperro.crecimiento();
        miperro.multiCelular();
        miperro.sangreCaliente();
        miperro.correr();
        miperro.cuatroPatas();
        System.out.println("");

        System.out.println("Mi perico se llama " + miperico.getNombre());
        miperico.respiracion();
        miperico.movimiento();
        miperico.crecimiento();
        miperico.multiCelular();
        miperico.sangreCaliente();
        miperico.volar();
        miperico.dosPatas();
    }
}
