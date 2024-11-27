package ejercicio4_1;

public class Cuenta {

    protected float Saldo;
    protected int NumeroConsignaciones = 0;
    protected int NumeroRetiros = 0;
    protected float TasaAnual;
    protected float ComisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.Saldo = saldo;
        this.TasaAnual = tasaAnual;
    }

    public void Consignar(float cantidad) {
        if (cantidad > 0) {
            Saldo += cantidad;
            NumeroConsignaciones++;
        } else {
            System.out.println("La cantidad a consignar debe ser positiva.");
        }
    }

    public void Retirar(float cantidad) {
        if (cantidad > 0) {
            if (Saldo >= cantidad) {
                Saldo -= cantidad;
                NumeroRetiros++;
            } else {
                System.out.println("La cantidad a retirar excede el saldo actual.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    public void CalcularInteres() {
        if (TasaAnual > 0) {
            float tasaMensual = TasaAnual / 12;
            float interesMensual = Saldo * tasaMensual;
            Saldo += interesMensual;
        }
    }

    public void ExtractoMensual() {
        Saldo -= ComisionMensual;
        CalcularInteres();

    }

    public float getSaldo() {
        return Saldo;
    }

    public void setTasaAnual(float tasaAnual) {
        if (tasaAnual >= 0) {
            this.TasaAnual = tasaAnual;
        } else {
            System.out.println("La tasa anual no puede ser negativa.");
        }
    }
}
