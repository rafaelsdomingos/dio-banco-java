package dio.me;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Rafael");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Paulo");

        ContaCorrente cc = new ContaCorrente(cliente);
        cc.depositar(100);

        ContaPoupanca poupanca = new ContaPoupanca(cliente2);
        cc.transferir(30, poupanca);

        cc.imprimirExtrato();
        System.out.println("");
        poupanca.imprimirExtrato();
    }
}
