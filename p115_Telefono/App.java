package p115_Telefono;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Telefono miTelefono = new Telefono();

        miTelefono.obtenerCoordenadas();
        miTelefono.iniciarRadio();
        miTelefono.detenerRadio();
    }
}
