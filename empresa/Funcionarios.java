package empresa;

public abstract class Funcionarios {
	private String nomeDoFuncionario;
	private String cpf;
	private String email;
	private String setor;
	private String dataDeAdmissao;
	private String dataDeDemissao;
	private double salario;
	
	public Funcionarios(String nomeDoFuncionario, String cpf, String email, String setor, String dataDeAdmissao, 
			 double salario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.dataDeAdmissao = dataDeAdmissao;
		this.salario = salario;
	}

	public String getNomeDoFuncionario() {
		return nomeDoFuncionario;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public String getSetor() {
		return setor;
	}

	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public String getDataDeDemissao() {
		return dataDeDemissao;
	}

	public void setDataDeDemissao(String dataDeDemissao) {
		this.dataDeDemissao = dataDeDemissao;
	}
	
	public double contraCheque() {
		return this.getSalario();
	}
}