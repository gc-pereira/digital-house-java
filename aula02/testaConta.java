package aula02;

public class testaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.setCliente("Gabriel Pereira");
		//conta.setNumero(2544);
		//conta.setSaldo(20.00);

		conta.deposita(500.00);
		System.out.println(conta.getSaldo());
		//conta.setSaldo(5.00);
		System.out.println(conta.getSaldo());
	}
}
