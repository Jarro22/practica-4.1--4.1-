package ejercicio4_1;

public class Ahorros extends Cuenta {
    private boolean activa;
    public Ahorros(float saldo, float tasa) {
        super(saldo, tasa);
        activa = saldo >= 10000;
    }
    @Override
    public void Retirar(float cantidad) {
        if (activa) {
            super.Retirar(cantidad);
        } else {
            System.out.println("La cuenta no está activa. No se pueden realizar retiros.");
        }
    }
    @Override
    public void Consignar(float cantidad) {
        super.Consignar(cantidad);
        if (Saldo >= 10000) {
            activa = true;
        }
    }
    @Override
    public void ExtractoMensual() {
        if (NumeroRetiros > 4) {
            ComisionMensual += (NumeroRetiros - 4) * 1000;
        }
        super.ExtractoMensual();
        if (Saldo < 10000) {
            activa = false;
        }
    }
    public void Imprimir() {
        System.out.println("Saldo = $ " + Saldo);
        System.out.println("Comisión mensual = $ " + ComisionMensual);
        System.out.println("Número de transacciones = " + (NumeroConsignaciones + NumeroRetiros));
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
        System.out.println();
    }
}



