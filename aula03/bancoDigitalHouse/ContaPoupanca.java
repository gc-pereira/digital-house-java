package aula03.bancoDigitalHouse;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, int agencia, double saldo, Cliente cliente) {
		super(numero, agencia, saldo, cliente);
	}

	@Override
	public void saca(double valor) {
		super.saldo = saldo - valor - 6.9;
	}

	@Override
	public void transfere(double valor, Conta contaDestino) {
		super.saldo = saldo - valor - 2.00;
		contaDestino.deposita(valor);
		System.out.println("Transferência feita com sucesso");
	}
}
