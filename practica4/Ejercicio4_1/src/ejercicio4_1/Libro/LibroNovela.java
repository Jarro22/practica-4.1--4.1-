package ejercicio4_1.Libro;

public class LibroNovela extends Libro {
    public enum Tipo {
        HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIA_FICCION, AVENTURAS
    }

    protected Tipo tipoNovela;

    public LibroNovela(String titulo, String autor, double precio, Tipo tipoNovela) {
        super(titulo, autor, precio);
        this.tipoNovela = tipoNovela;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de novela: " + tipoNovela);
    }
}
