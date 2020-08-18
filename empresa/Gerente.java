package empresa;

public class Gerente extends PessoaFisica {

	private double bonificacao = 0.12;

	public Gerente(String nomeDoFuncionario, String cpf, String email, String setor, String dataDeAdmissao,
			 double salario, String nit) {

		super(nomeDoFuncionario, cpf, email, setor, dataDeAdmissao, salario, nit);
	}

	public double getBonificacao() {
		return bonificacao * this.getSalario();
	}

	@Override
	public double contraCheque() {
		return this.getSalario() * (1 + this.bonificacao);
	}

}
