package empresa;

public abstract class Funcionarios {
	private String nomeDoFuncionario;
	private String cpf;
	private String email;
	private String setor;
	private String dataDeAdmissao;
	private String dataDeDemissao;
	private double salario;
	private boolean demitido;

	public Funcionarios(String nomeDoFuncionario, String cpf, String email, String setor, String dataDeAdmissao,
			double salario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
		this.cpf = cpf;
		this.email = email;
		this.setor = setor;
		this.dataDeAdmissao = dataDeAdmissao;
		this.salario = salario;
		this.demitido = false;
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
	
	public boolean getDemitido() {
		return demitido;
	}

	public String getDataDeDemissao() {
		return dataDeDemissao;
	}

	public double contraCheque() {
		return this.getSalario();
	}
	
	public void pedirDemissao(String dataDeDemissao) {
		this.demitido = true;
		this.dataDeDemissao = dataDeDemissao;
		System.out.println("O funcionário foi demitido no dia "+dataDeDemissao);
	}
	
	public void pedirAumento(double bancoDeHoras, double aumento) {
		if(bancoDeHoras > 40.00 & aumento < 200.00) {
			this.salario += aumento;
			System.out.println("Aumento concedido!");
		}else {
			System.out.println("Aumento não concedido!");
		}
	}
}