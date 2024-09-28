package p99_Rectangulo;

public class Rectangulo {
    private float Largo;
    private float Ancho;
    private float Area;
    private float Perimetro;

    public Rectangulo() {
    }
    public Rectangulo(float largo, float ancho) {
        Largo = largo;
        Ancho = ancho;
    }

    public float getLargo() {
        return Largo;
    }
    public void setLargo(float largo) {
        Largo = largo;
    }
    public float getAncho() {
        return Ancho;
    }
    public void setAncho(float ancho) {
        Ancho = ancho;
    }
    
    public float getArea() {
        Area = Largo * Ancho;
        return Area;
    }
    public float getPerimetro() {
        Perimetro = 2 * Largo + 2 * Ancho;
        return Perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo [Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }   
}