
public class Main {

	public static void main(String[] args) {
		Cliente felipe = new Cliente();
		felipe.setNome("Felipe Jhordan");
		
		Conta cc = new ContaCorrente(felipe);
		Conta poupanca = new ContaPoupanca(felipe);

		cc.depositar(222);
		cc.depositar(100);
		cc.transferir(222, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
