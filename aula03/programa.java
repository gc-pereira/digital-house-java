package aula03;

import java.util.ArrayList;
import java.util.List;

public class programa {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Gabriel");
		g1.setSalario(20000);
		System.out.println(g1.getHolerite());
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Diego");
		pf1.setSalario(1500);
		System.out.println(pf1.getHolerite());
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Mario Luiz");
		pj1.setSalario(5000);
		
		g1.demitir(pf1);
		
		List<PessoaFisica> funcionarios = new ArrayList<>();
		
		funcionarios.add(g1);
		funcionarios.add(pf1);
	}
	
}
