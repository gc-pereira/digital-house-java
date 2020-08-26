package aula03.bancoDigitalHouse;

public abstract class Conta {

	// Atributos da classe que outras classes irão herdar;
	private int numero;
	private int agencia;
	protected double saldo;
	
	// Construtor da classe
	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	// Método para depositar na conta, o parâmetro valor vai ser adicionado ao saldo;
	public void deposita(double valor) {
		this.saldo += valor; 
	}

	public abstract void saca(double valor); // Método sacar que obrigatóriamente as classes filhas vão implementar;

	public abstract void transfere(double valor, Conta contaDestino); // Método transferir que obrigatóriamente as classes filhas vão implementar;

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

}