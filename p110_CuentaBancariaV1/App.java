package p110_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("Saldo Inicial: " + c1.getSaldo());
        c1.deposita(10000);
        System.out.println("Saldo despues del 1er deposito " + c1.getSaldo());
        double cr = 400;
        boolean rsn = c1.retira(cr);
        if (rsn) System.out.println("Retiraste " + cr + " te quedan " + c1.getSaldo());
        else System.out.println("No tienes ni para los cigarros, ponte a trabajar ");

        System.out.println("\nProbando clase Cliente");
        Cliente cliente1 = new Cliente("Juan Perez", c1);
        System.out.println("Cliente 1 " + cliente1);
        Cliente cliente2 = new Cliente("Carlos Castaneda", new CuentaBancaria(1000));
        System.out.println(cliente2);
        cliente1.getCuenta().retira(900);
        System.out.println(cliente2);
        cliente1.getCuenta().retira(9000);
        System.out.println(cliente1);
        cliente2.getCuenta().deposita(10000);
        System.out.println(cliente2);
        Cliente mumujer = new Cliente ("Rocio", cliente2.getCuenta());
        mumujer.getCuenta().retira(10100);
        System.out.println(cliente2);

        System.out.println("\nProbando la clase banco");
        Banco mibanco = new Banco("Banco del Bienestar", "Campus Siglo XXI");
        mibanco.agregarCliente(cliente1);
        mibanco.agregarCliente(cliente2);
        mibanco.agregarCliente(mumujer);
        mibanco.agregarCliente(new Cliente("Claudia la Presi", new CuentaBancaria(100000000)));
        mibanco.getClientes().get(3).getCuenta().retira(90000);
        mibanco.getClientes().get(0).getCuenta().retira(30000);
        mibanco.getClientes().get(1).getCuenta().retira(30000);
        mibanco.getClientes().get(2).getCuenta().retira(30000);
        System.out.println("Los clientes del banco");
        double total = 0;
        for(Cliente cte : mibanco.getClientes()){
            System.out.println(cte);
            total = total + cte.getCuenta().getSaldo();
        }


        
        System.out.printf("Total de dinero en el banco %,.2f", total);
    }
}
