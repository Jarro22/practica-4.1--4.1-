package ejercicio4_2.TiendaMascotas;
public class PerrosGrandes extends Perro{
    enum raza{pastorAlemán,doberman,rotweiller};

    protected raza razaPerroGrande;

    public PerrosGrandes(String nombre, int edad, String color, double peso, boolean muerde, raza razaPerroGrande) {
        super(nombre, edad, color, peso, muerde);
        this.razaPerroGrande = razaPerroGrande;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Raza del perro= "+razaPerroGrande);
        System.out.println();
    }

    void sonido() {
        super.sonido();
    }
}
