package ejercicio4_2.TiendaMascotas;

public class GatosSNPelo extends Gato {
    enum raza { esfinge, elfo, donskoy };
    protected raza razaGatosSNPelo;

    public GatosSNPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, raza razaGatosSNPelo) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.razaGatosSNPelo = razaGatosSNPelo;
    }
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("La raza del gato sin pelo es: " + razaGatosSNPelo);
        System.out.println();
    }
     @Override
    void sonido() {
         System.out.println("El gato sin pelo hace un sonido suave...");
    }
}

