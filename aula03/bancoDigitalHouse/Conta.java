package aula03.bancoDigitalHouse;

public abstract class Conta {

	// Atributos da classe que outras classes irão herdar;
	private int numero;
	private int agencia;
	protected double saldo;
	private Cliente cliente;
	
	// Construtor da classe
	public Conta(int numero, int agencia, double saldo, Cliente cliente) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
		this.cliente.addConta(this); // O próprio cliente vai se adicionar na conta pelo método criado na classe filha Cliente;
	}

	// Método para depositar na conta, o parâmetro valor vai ser adicionado ao saldo;
	public void deposita(double valor) {
		this.saldo += valor; 
	}

	public abstract void saca(double valor); // Método sacar que obrigatóriamente as classes filhas vão implementar;

	public abstract void transfere(double valor, Conta contaDestino); // Método transferir que obrigatóriamente as classes filhas vão implementar;

	// Setter and getters
	public void setCliente(Cliente cliente2) {
		this.cliente = cliente2;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getNumero() {
		return numero;
	}

}