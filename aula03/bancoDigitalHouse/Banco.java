package aula03.bancoDigitalHouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private int numero;
	private String nome;
	private List<Conta> contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return Collections.unmodifiableList(contas);
	}
	
	public void adicionaConta(Conta conta) {
		this.contas.add(conta);
	}
}
