package aula05.cursos;

public class Aluno {

	protected String nome;
	protected int registroAluno;
	protected int idade;

	public Aluno(String nome, int registroAluno, int idade) {
		this.nome = nome;
		this.registroAluno = registroAluno;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getRegistroAluno() {
		return registroAluno;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + registroAluno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (registroAluno != other.registroAluno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", registroAluno=" + registroAluno + ", idade=" + idade + "]";
	}
}
