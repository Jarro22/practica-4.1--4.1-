package ejercicio4_2;

public class Apartamento extends Inmueble {
    public Apartamento(int identificadorInmobiliario, int area, String direccion,
                       int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }
    @Override
    public void imprimir() {
        super.imprimir();
    }
}
