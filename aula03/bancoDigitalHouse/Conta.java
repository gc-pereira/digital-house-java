package aula03.bancoDigitalHouse;

public class Conta {
	
	private int numero;
	private int agencia;
	private double saldo;
	private String cliente;
	
	public Conta(int numero, int agencia, double saldo, String cliente) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public void deposita (double valor) {
		this.saldo +=valor;
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta contaDestino) {
		this.saca(valor);
		contaDestino.deposita(valor);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public String getCliente() {
		return cliente;
	}

}