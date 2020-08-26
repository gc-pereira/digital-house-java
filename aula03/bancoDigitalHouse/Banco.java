package aula03.bancoDigitalHouse;

import java.util.List;
import java.util.Collections;

public class Banco {

	private int numero;
	private String nome;
	private List<Cliente> cliente;

	public Banco(String nome, int numero, List<Cliente> cliente) {
		this.nome = nome;
		this.numero = numero;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public List<Cliente> geClientes() {
		return Collections.unmodifiableList(cliente);
	}
	
	public void adicionaCliente(Cliente cliente) {
		this.cliente.add(cliente);
	}
}
