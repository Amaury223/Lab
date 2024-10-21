package p117_FiguraGeometrica;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Circulo miCirculo = new Circulo(100);
        System.out.println("Probando circulo: ");
        System.out.println(miCirculo);
        miCirculo.Ajustar(0.3);
        System.out.println(miCirculo);

        Rectangulo miRectangulo = new Rectangulo(100, 200);
        System.out.println("\nProbando Rectangulo ...");
        System.out.println(miRectangulo);
        miRectangulo.Ajustar(0.5);
        System.out.println(miRectangulo);
    }
}
