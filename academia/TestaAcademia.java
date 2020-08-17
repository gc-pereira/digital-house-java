package academia;

public class TestaAcademia {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Gabriel Carvalho Pereira");
		cliente1.setCpf("123.456.789-10");
		cliente1.setEmail("carvalho.gabrielp@gmail.com");
		cliente1.setDataDeNascimento("15/02/1999");
		cliente1.setIdade(21);
		cliente1.setDataDeInicio("16/06/2020");
		cliente1.setTipoDePlano("Musculação/Funcional");
		cliente1.setValorDoPlano(75.00);

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Fulano de tal da Silva Souza");
		funcionario1.setCpf("987.654.321-01");
		funcionario1.setEmail("fulanodetal@gmail.com");
		funcionario1.setDataDeNascimento("05/01/1996");
		funcionario1.setIdade(33);
		funcionario1.setSalario(2000.00);
		funcionario1.setDataDeAdmissao("11/08/2020");
		
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("123.123.123-12");
		
		funcionario1.cancelarMatricula(cliente2);
		
	}
}