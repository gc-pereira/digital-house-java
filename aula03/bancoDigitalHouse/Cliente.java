package aula03.bancoDigitalHouse;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	private List<Conta> contas = new ArrayList<>();
	
	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void addConta(Conta conta) {
		conta.setCliente(this);
		this.contas.add(conta);
	}
	
	public List<Conta> getContas() {
		return contas;
	}
}