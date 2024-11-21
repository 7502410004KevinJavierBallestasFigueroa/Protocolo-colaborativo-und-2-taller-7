package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Kevin", 4000000);
        Empleado empleado2 = new Empleado("Lina", 600000);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println("Se modificará el salario de: "+empleado2.nombre);
        empleado2.setSalario(-600000);
        System.out.println("nuevo salario de " + empleado2.nombre + ": " + empleado2.getSalario());
    }
}

