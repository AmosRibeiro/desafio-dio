public abstract class Conta implements IConta {
    
    private int agencia;
    private int numero;
    private double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        
        throw new UnsupportedOperationException("Unimplemented method 'sacar'");
    }

    @Override
    public void depositar(double valor) {
        
        throw new UnsupportedOperationException("Unimplemented method 'depositar'");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }
}
