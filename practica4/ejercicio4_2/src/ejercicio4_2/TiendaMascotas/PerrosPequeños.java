package ejercicio4_2.TiendaMascotas;
public class PerrosPequeños extends Perro{
    enum raza{caniche,yorkshireTerrier,schnauzer,chihuahua};
    protected raza razaPerroPequeno;

    public PerrosPequeños(String nombre, int edad, String color, double peso, boolean muerde,raza razaPerroPequeño) {
        super(nombre, edad, color, peso, muerde);
        this.razaPerroPequeno = razaPerroPequeño;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Raza del perro= "+razaPerroPequeno);
        System.out.println();
    }

    void sonido() {
        super.sonido();
    }
}
