package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria acc1 = new CuentaBancaria("232132", 1200000, "Ahorro");

        System.out.println("Saldo actual: " + acc1.saldo);
        acc1.setSaldo(1500);
        System.out.println("Nuevo saldo: " + acc1.numeroCuenta);

        acc1.mostrarDetalles();
    }
}

