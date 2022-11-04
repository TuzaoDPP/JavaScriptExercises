public class ContaBancaria {
    public int numero, agencia;
    private double saldo;

    public boolean Sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public void Depositar(double valor){
        saldo += valor;
    }

    public double ConsultarSaldo(){
        return saldo;
    }
}
