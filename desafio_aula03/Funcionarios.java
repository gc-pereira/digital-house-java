package desafio_aula03;

public class Funcionarios {
	String nomeDoFuncionario;
	private String cpf;
	String email;
	String setor;
	private String dataDeAdmissao;
	private String dataDeDemissao;
	private int tempoNaEmpresa;
	double salario;
	private boolean jaTirouFerias;

	public int getTempoNaEmpresa() {
		return tempoNaEmpresa;
	}

	public void setTempoNaEmpresa(int tempoNaEmpresa) {
		this.tempoNaEmpresa = tempoNaEmpresa;
	}

	public String getDataDeDemissao() {
		return dataDeDemissao;
	}

	public void setDataDeDemissao(String dataDeDemissao) {
		this.dataDeDemissao = dataDeDemissao;
	}

	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean getJaTirouFerias() {

		return jaTirouFerias;
	}
	
	public void ferias(int tempoNaEmpresa) {
		if (tempoNaEmpresa < 11) {
			System.out.println("O funcionário ainda é muito novinho para tirar férias");
		} else {
			System.out.println("O bichinho merece umas férias vai?!");
		}
	}

}