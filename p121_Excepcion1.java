public class p121_Excepcion1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        int a = 100;
        int b = 0;
        
        try {
            int c = a / b;
            System.out.println("El resultado es " + c);
            
        } catch (Exception e) {
            System.out.println("No se puede dividir entre 0, no seas ... " + e);
        } finally {
            System.out.println("Este mensaje se imprime se genera o no la excepcion");
        }
    }
}
