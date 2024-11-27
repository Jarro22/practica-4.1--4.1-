package ejercicio4_2;

public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBaños;
    protected int numeroPisos;
    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion,
                            int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
        this.numeroPisos = numeroPisos;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Habitaciones: " + numeroHabitaciones);
        System.out.println("Número de Baños: " + numeroBaños);
        System.out.println("Número de Pisos: " + numeroPisos);
    }
}

