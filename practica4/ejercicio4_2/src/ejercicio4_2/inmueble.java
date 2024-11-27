package ejercicio4_2;

public class Inmueble {
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected int numeroHabitaciones;
    protected int numeroBaños;
    protected int numeroPisos;
    public Inmueble(int identificadorInmobiliario, int area, String direccion,
                    int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
        this.numeroPisos = numeroPisos;
    }
    public void imprimir() {
        System.out.println("Identificador Inmobiliario: " + identificadorInmobiliario);
        System.out.println("Área: " + area + " m²");
        System.out.println("Dirección: " + direccion);
        System.out.println("Número de Habitaciones: " + numeroHabitaciones);
        System.out.println("Número de Baños: " + numeroBaños);
        System.out.println("Número de Pisos: " + numeroPisos);
    }
}
