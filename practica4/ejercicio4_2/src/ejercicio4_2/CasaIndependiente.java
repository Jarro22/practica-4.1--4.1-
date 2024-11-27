package ejercicio4_2;

public class CasaIndependiente extends Inmueble {
    protected static double valorArea = 3000000;
    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }
    @Override
    public void imprimir() {
        super.imprimir(); // Llama al método imprimir de la clase base.
        System.out.println("Tipo: Casa Independiente");
        System.out.println("Valor por área: $" + valorArea);
    }
}

