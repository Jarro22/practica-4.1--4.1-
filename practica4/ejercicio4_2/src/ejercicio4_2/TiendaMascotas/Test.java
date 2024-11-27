package ejercicio4_2.TiendaMascotas;

public class Test {
    public static void main(String[] args) {
        PerrosGrandes perro=new PerrosGrandes("Bobi",2,"Negro",14,false, PerrosGrandes.raza.rotweiller);
        GatosPeloCorto gato=new GatosPeloCorto("Enzo",4,"Blanco",40,35, GatosPeloCorto.raza.manx);
        perro.imprimir();
        perro.sonido();
        gato.imprimir();
        gato.sonido();
    }
}
