package p116_Juego;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        JuegoDados miDados = new JuegoDados();

        miDados.iniciar();
        miDados.jugar();
        miDados.finalizar();

        JuegoAdivina miaAdivina = new JuegoAdivina();
        miaAdivina.iniciar();
        miaAdivina.jugar();
        miaAdivina.finalizar();
    }
}
