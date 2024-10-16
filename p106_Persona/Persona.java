package p106_Persona;

public class Persona {
    private String Nombre;
    private String Direccion;
    private int Edad;

    public Person(){}

    public Persona(String nombre, String direccion) {
        Nombre = nombre;
        Direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String toString() {
        return 
    }
    public String toString(){
        return String.format("Nombre:  %s , Direccion:  %s, Edad:  %d",Nombre,Direccion,Edad);
    }
}
