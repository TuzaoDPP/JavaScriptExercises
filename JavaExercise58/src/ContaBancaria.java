public class ContaBancaria {
    public int numero, agencia;
    private double saldo;

    public void Sacar(double valor){
        saldo -= valor;
    }

    public void Depositar(double valor){
        saldo += valor;
    }

    public double ConsultarSaldo(){
        return saldo;
    }
}
