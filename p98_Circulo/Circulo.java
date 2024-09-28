package p98_Circulo;

public class Circulo {
    private double Radio;
    private double Area;
    private double Circunferencia;

    
    public Circulo() {
    }
    public Circulo(double radio) {
        Radio = radio;
    }


    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }

    public double getArea() {
        Area = Math.PI * Math.pow(Radio, 2);
        return Area;
    }
    public double getCircunferencia() {
        Circunferencia = 2 * Radio * Math.PI;
        return Circunferencia;
    }

    @Override
    public String toString() {
        return "Circulo [Radio=" + Radio + "]";
    }
}