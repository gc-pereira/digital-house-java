package aula02;

public class Conta {

	private String cliente;
	private int numero;
	private double saldo;
	
	public void deposita(double valor) {
		saldo += valor;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}