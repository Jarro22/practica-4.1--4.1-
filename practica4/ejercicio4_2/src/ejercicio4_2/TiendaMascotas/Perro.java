package ejercicio4_2.TiendaMascotas;
public class Perro extends Mascota {
    protected double peso;
    protected boolean muerde;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Peso= " + peso + " Kg");
        if (muerde = true) {
            System.out.println("Muede");
        } else {
            System.out.println("No muerde");
        }
    }

    void sonido() {
        super.sonido();
        System.out.println("Los perros ladran");
        System.out.println();
    }
}
