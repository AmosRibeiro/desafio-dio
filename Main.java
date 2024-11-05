public class Main {
    public static void main(String[] args) {

        Cliente amos = new Cliente();
        amos.setNome("Amós");
        Conta cc = new ContaCorrente(amos);
        Conta poupanca = new ContaPoupanca(amos);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        poupanca.sacar(10);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
