package aula03;

public class PessoaFisica extends Funcionarios{
	
	private String cpf;
	private boolean gerente;
	private boolean supervisor;
	
	public double salario(double salario) {
		if(setGerente(true)) {
			salario = salario*1.12;
		}else {
			salario = salario*1.08;
		}
		return salario;
	}

	public boolean getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(boolean supervisor) {
		this.supervisor = supervisor;
	}

	public boolean getGerente() {
		return gerente;
	}

	public boolean setGerente(boolean gerente) {
		this.gerente = gerente;
		return gerente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}