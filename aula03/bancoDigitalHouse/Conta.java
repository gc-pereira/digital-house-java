package aula03.bancoDigitalHouse;

public abstract class Conta {

	// Atributos da classe que outras classes ir�o herdar;
	private int numero;
	private int agencia;
	protected double saldo;
	
	// Construtor da classe
	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	// M�todo para depositar na conta, o par�metro valor vai ser adicionado ao saldo;
	public void deposita(double valor) {
		this.saldo += valor; 
	}

	public abstract void saca(double valor); // M�todo sacar que obrigat�riamente as classes filhas v�o implementar;

	public abstract void transfere(double valor, Conta contaDestino); // M�todo transferir que obrigat�riamente as classes filhas v�o implementar;

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