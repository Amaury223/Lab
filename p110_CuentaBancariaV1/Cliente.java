package p110_CuentaBancariaV1;

public class Cliente {
    private String Nombre;
    private CuentaBancaria cuenta;

    public Cliente (String nombre, CuentaBancaria cuenta){
        this.Nombre = nombre;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", cuenta=" + cuenta.getSaldo() + "]";
    }
    
  /*   @Override
    public String toString(){
        return "Cliente [Nombre=" + nombre + ""
    }*/
}
