import java.util.Scanner;

 class p13_VolumenCilindro {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        double radio,altura,volumen;
        System.out.print("Ingresa el radio:  ");radio = obj.nextDouble();
        System.out.print("Ingresa la altura: ");altura = obj.nextDouble();
        volumen = Math.PI*(radio * radio) * altura;
        System.out.println("El volumen del cilindro es: "+volumen);

    }
}
