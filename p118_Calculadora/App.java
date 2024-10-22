package p118_Calculadora;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Calculadora maizoro = new Calculadora();

        maizoro.sumar(10,20);
        maizoro.restar(100,50);
        maizoro.multiplicar(100,100);
        maizoro.dividir(150000,25);
    }
}
