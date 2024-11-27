package Ejercicio4_2;

public class ApartamentoFamiliar extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBaños;
    protected double valorArea;
    protected double precioVenta;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion,
                               int numeroHabitaciones, int numeroBaños, double valorArea) {
        super(identificadorInmobiliario, area, direccion);  // Llamada al constructor base
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
        this.valorArea = valorArea;
    }

    public void calcularPrecioVenta() {
        this.precioVenta = this.area * this.valorArea;
    }

    @Override
    public void imprimir() {
        calcularPrecioVenta();
        super.imprimir();
        System.out.println("Número de Habitaciones: " + numeroHabitaciones);
        System.out.println("Número de Baños: " + numeroBaños);
        System.out.println("Precio de Venta: $" + precioVenta);
    }
}

