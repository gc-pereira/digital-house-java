package empresa;

public class PessoaFisica extends Funcionarios{
	
	private String nit;
	
	public PessoaFisica(String nomeDoFuncionario, String cpf, String email, String setor, String dataDeAdmissao, 
			double salario, String nit) {
		super(nomeDoFuncionario, cpf, email, setor, dataDeAdmissao, salario);
		this.nit = nit;
	}

	public String getNit() {
		return nit;
	}
}