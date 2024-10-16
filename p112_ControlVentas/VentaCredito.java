package p112_ControlVentas;

public class VentaCredito extends Venta {
    private int Meses;
    private double Interes;
    
    public VentaCredito(String articulo, int cantidad, double precio, double total, int meses, double interes) {
        super(articulo, cantidad, precio, total);
        Meses = meses;
        Interes = interes;
    }

    
}
