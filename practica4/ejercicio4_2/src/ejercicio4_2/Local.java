package ejercicio4_2;

public class Local extends Inmueble {
    public enum Tipo { INTERNO, CALLE }
    protected Tipo tipoLocal;
    public Local(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de Local: " + tipoLocal);
    }
}
