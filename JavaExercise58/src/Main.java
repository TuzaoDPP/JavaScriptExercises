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

        ContaBancaria Gian = new ContaBancaria();
        Gian.numero = 6548712;
        Gian.agencia = 74381;
        Gian.Depositar(2500);

        System.out.println("O saldo do Gian é de: " + Gian.ConsultarSaldo());
        if(Gian.Sacar(700)){
            System.out.println("Seu saque foi validado.");
        }else{
            System.out.println("Seu saldo não é o suficiente.");
        }
        System.out.println("O saldo do Gian é de: " + Gian.ConsultarSaldo());
    }
}