package academia;

public class Funcionario extends Pessoa {

	private double salario;
	private String dataDeAdmissao;
	private String dataDeDemissao;
	
	public void cancelarMatricula(Cliente cliente) {
		System.out.println("O cliente CPF: "+cliente.getCpf()+", cancelou a sua matrícula!");
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public String getDataDeDemissao() {
		return dataDeDemissao;
	}

	public void setDataDeDemissao(String dataDeDemissao) {
		this.dataDeDemissao = dataDeDemissao;
	}

}
