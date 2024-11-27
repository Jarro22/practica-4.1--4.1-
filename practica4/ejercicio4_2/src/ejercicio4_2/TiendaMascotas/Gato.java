package ejercicio4_2.TiendaMascotas;

public class Gato extends Mascota{
    protected double alturaSalto;
    protected double longitudSalto;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Altura de salto= "+alturaSalto+" cm");
        System.out.println("Longitud de salto= "+longitudSalto+" cm");
    }

    void sonido() {
        super.sonido();
        System.out.println("Los gatos maullan y ronronean");
        System.out.println();
    }
}
