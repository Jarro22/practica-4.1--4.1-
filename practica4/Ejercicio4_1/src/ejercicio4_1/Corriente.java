package ejercicio4_1;
public class Corriente extends Cuenta {
    private float Sobregiro;
    public Corriente(float saldo, float tasa) {
        super(saldo, tasa);
        Sobregiro = 0;
    }
    @Override
    public void Retirar(float cantidad) {
        float resultado = Saldo - cantidad;
        if (resultado < 0) {
            Sobregiro += -resultado;
            Saldo = 0;
        } else {
            super.Retirar(cantidad);
        }
    }
    @Override
    public void Consignar(float cantidad) {
        if (Sobregiro > 0) {
            if (cantidad >= Sobregiro) {
                cantidad -= Sobregiro;
                Sobregiro = 0;
                super.Consignar(cantidad);
            } else {
                Sobregiro -= cantidad;
            }
        } else {
            super.Consignar(cantidad);
        }
    }
    @Override
    public void ExtractoMensual() {
        super.ExtractoMensual();
    }
    public void Imprimir() {
        System.out.println("Saldo = $" + Saldo);
        System.out.println("Cargo mensual = $" + ComisionMensual);
        System.out.println("Número de transacciones = " + (NumeroConsignaciones + NumeroRetiros));
        System.out.println("Valor de sobregiro = $" + Sobregiro);
        System.out.println();
    }
}
