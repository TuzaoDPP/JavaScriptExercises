public class Main {
    public static void main(String[] args) {
        ContaBancaria Arthur = new ContaBancaria();

        Arthur.numero = 5609847;
        Arthur.agencia = 74381;
        Arthur.Depositar(1200);

        System.out.println("O saldo do Arthur é de: " + Arthur.ConsultarSaldo());
        Arthur.Sacar(500);
        System.out.println("O saldo do Arthur é de: " + Arthur.ConsultarSaldo());
        Arthur.Depositar(150);
        System.out.println("O saldo do Arthur é de: " + Arthur.ConsultarSaldo());
    }
}