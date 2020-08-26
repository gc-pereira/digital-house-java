package aula03.bancoDigitalHouse;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, int agencia, double saldo) {
		super(numero, agencia, saldo);
	}

	public String chequeEspecial(double cheque) {
		return "O cliente de conta " + super.getNumero() + " tem R$" + cheque + " de cheque especial";
	}

	@Override
	public void saca(double valor) {
		saldo = saldo - valor - 6.9; // TAXA PARA SAQUE
	}

	@Override
	public void transfere(double valor, Conta contaDestino) {
		super.saldo = saldo - valor - 3.98;
		contaDestino.deposita(valor);
		System.out.println("Transferência feita com sucesso");
	}
}
