package empresa;

public class PessoaJuridica extends Funcionarios{
	
	private String cnpj;
	
	public PessoaJuridica(String nomeDoFuncionario, String cpf, String email, String setor, String dataDeAdmissao,
			double salario, String cnpj) {
		super(nomeDoFuncionario, cpf, email, setor, dataDeAdmissao, salario);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
}