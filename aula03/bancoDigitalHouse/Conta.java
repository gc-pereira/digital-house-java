package aula03.bancoDigitalHouse;

public abstract class Conta {

	private int numero;
	private int agencia;
	protected double saldo;
	private String cliente;

	public Conta(int numero, int agencia, double saldo, String cliente) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public abstract void saca(double valor);

	public abstract void transfere(double valor, Conta contaDestino);

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public String getCliente() {
		return cliente;
	}

	public int getNumero() {
		return numero;
	}

}