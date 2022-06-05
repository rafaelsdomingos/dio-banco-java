package dio.me;

public abstract class Conta implements IConta{

    //Variáveis e constante
    protected int agencia;
    protected int numero;
    protected double saldo;
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;
    protected Cliente cliente;

    //Construtor
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //Implementação dos métodos de movimentação
    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfo() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %2f", this.saldo));
    }

    //gets
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}

