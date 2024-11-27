package ejercicio4_2.TiendaMascotas;
public class Mascota {
    protected String nombre;
    protected int edad;
    protected String color;

    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    void imprimir() {
        System.out.println("Nombre= " + nombre);
        System.out.println("Edad= " + edad + " años");
        System.out.println("Color= " + color);
    }

    void sonido() {
        System.out.println("La mascota hace un sonido");
    }
}
