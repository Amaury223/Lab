package p113_SegundoExamenParcial;

public abstract class Jugador {
    private String Nombre;
    private char Sexo;
    private String Descripcion;
    private double Salario;
    protected double Total;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
    }

    public abstract double getBono();

    @Override
    public String toString() {
        return "Jugador [Nombre= " + Nombre + ", Sexo=" + Sexo + ", Descripcion= " + Descripcion + ", Salario= " + Salario + "]";
    }

    public double getSalario() {
        return Salario;
    }

    public double getTotal() {
        return Total;
    }
}
