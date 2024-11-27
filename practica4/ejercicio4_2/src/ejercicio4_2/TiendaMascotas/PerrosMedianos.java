package ejercicio4_2.TiendaMascotas;

public class PerrosMedianos extends Perro{
    enum raza{collie,dalmata,bulldog,galgo,sabueso};
    protected raza razaPerroMediano;

    public PerrosMedianos(String nombre, int edad, String color, double peso, boolean muerde,raza razaPerroMediano) {
        super(nombre, edad, color, peso, muerde);
        this.razaPerroMediano = razaPerroMediano;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Raza del perro= "+razaPerroMediano);
        System.out.println();
    }

    void sonido() {
        super.sonido();
    }
}
