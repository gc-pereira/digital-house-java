package aula05.lista_exercicios.Exercicio1;

public class Amigos {
	
	private String nome;
	private String primeiroApelido;
	private String segundoApelido;
	private String terceitoApelido;
	
	public Amigos(String nome, String primeiroApelido, String segundoApelido, String terceiroApelido) {
		this.nome = nome;
		this.primeiroApelido = primeiroApelido;
		this.segundoApelido = segundoApelido;
		this.terceitoApelido = terceiroApelido;
	}

	public String getNome() {
		return nome;
	}

	public String getPrimeiroApelido() {
		return primeiroApelido;
	}

	public String getSegundoApelido() {
		return segundoApelido;
	}

	public String getTerceitoApelido() {
		return terceitoApelido;
	}
	
	@Override
	public String toString() {
		return "Amigos [nome: "+nome+" ==> Apelidos: "+primeiroApelido+", "+segundoApelido+", "+terceitoApelido+"]";
	}

}
