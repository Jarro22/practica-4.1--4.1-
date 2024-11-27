package ejercicio4_2.TiendaMascotas;
public class GatosPeloCorto extends Gato{
    enum raza{azulRuso,britanico,manx,devonRex};
    protected raza razaGatosPeloCorto;

    public GatosPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto, raza razaGatosPeloCorto) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.razaGatosPeloCorto = razaGatosPeloCorto;
    }
    void imprimir() {
        super.imprimir();
        System.out.println("La raza del gato es= "+razaGatosPeloCorto);
        System.out.println();
    }
    void sonido() {
        super.sonido();
    }
}
