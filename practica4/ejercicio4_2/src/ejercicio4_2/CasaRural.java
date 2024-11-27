package ejercicio4_2;

public class CasaRural extends Inmueble {
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos); // Llama al constructor de la clase base
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }
    @Override
    public void imprimir() {
        super.imprimir(); // Llama al método imprimir de la clase base
        System.out.println("Distancia a la cabecera municipal: " + distanciaCabera + " km");
        System.out.println("Altitud sobre el nivel del mar: " + altitud + " mts");
        System.out.println();
    }
}
