package aula03.bancoDigitalHouse;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	private List<Conta> contas = new ArrayList<>();
	

	public Cliente(String nome, String cpf, String endereco, List<Conta> contas) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.contas = contas;
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
	
	public void getContas() {
		System.out.println(contas.size());
	}
}