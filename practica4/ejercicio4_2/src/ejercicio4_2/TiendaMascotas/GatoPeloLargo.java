package ejercicio4_2.TiendaMascotas;

public class GatosPeloLargo extends Gato {
       enum raza {angora, himalayo, balinés, somalí};
    protected raza razaGatosPeloLargo;
       public GatosPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, raza razaGatosPeloLargo) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.razaGatosPeloLargo = razaGatosPeloLargo;
    }
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("La raza del gato de pelo largo es: " + razaGatosPeloLargo);
        System.out.println();
    }
    @Override
    void sonido() {
        System.out.println("El gato de pelo largo maúlla suavemente...");
    }
}
