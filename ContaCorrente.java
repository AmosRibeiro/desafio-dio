public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    public void imprimirExtrato() {
        System.out.println("=== Extato Conta Corrente ===");
        super.imprimirAtributos();
    }

}

