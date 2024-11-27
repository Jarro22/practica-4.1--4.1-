package ejercicio4_1.Libro;

public class LibroUniversidad extends LibroTexto {
    protected String facultad;
    public LibroUniversidad(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso); // Llama al constructor de LibroTexto.
        this.facultad = facultad;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase padre.
        System.out.println("Facultad: " + facultad);
    }
}
