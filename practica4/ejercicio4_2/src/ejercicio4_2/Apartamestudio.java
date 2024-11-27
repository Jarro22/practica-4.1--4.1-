package Ejercicio4_2;

public class Apartaestudio extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBaños;
    protected double valorArea;
    protected double precioVenta;

    public Apartaestudio(int identificadorInmobiliario, int area, String direccion,
                         int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
        this.valorArea = 1200000;
    }

    public void calcularPrecioVenta(double valorArea) {
        this.precioVenta = area * valorArea;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Habitaciones: " + numeroHabitaciones);
        System.out.println("Número de Baños: " + numeroBaños);
        System.out.println("Precio de Venta: $" + precioVenta);
    }
}
