package ejercicio4_1.Libro;

public class LibroTexto extends Libro {
    protected String curso;
    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio); // Llama al constructor de la superclase.
        this.curso = curso;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la superclase.
        System.out.println("Curso: " + curso);
    }
}
