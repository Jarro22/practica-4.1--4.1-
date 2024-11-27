package ejercicio4_1.Libro;

public class Test {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Necronomicón", "H.P. Lovecraft", 70);
        LibroUniversidad libroUniversidad1 = new LibroUniversidad("Termodinámica", "Sheldon Cooper", 50, "Tercero", "Física");
        LibroNovela libroNovela1 = new LibroNovela("Dune", "Frank Herbert", 75, LibroNovela.Tipo.CIENCIA_FICCION);
        LibroTexto libroTexto1 = new LibroTexto("Literatura", "Coquito", 55, "Cuarto");
        System.out.println("=== Información del Libro ===");
        libro1.mostrarInformacion();
        System.out.println("\n=== Información del Libro de Universidad ===");
        libroUniversidad1.mostrarInformacion();
        System.out.println("\n=== Información del Libro de Novela ===");
        libroNovela1.mostrarInformacion();
        System.out.println("\n=== Información del Libro de Texto ===");
        libroTexto1.mostrarInformacion();
    }
}
