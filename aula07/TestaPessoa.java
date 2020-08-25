package aula07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaPessoa {

	public static void main(String[] args) {

		List<Pessoa> nomes = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Pessoa("Gabriel", 21);
		Pessoa pessoa2 = new Pessoa("Renan", 22);
		Pessoa pessoa3 = new Pessoa("Thais", 23);
		Pessoa pessoa4 = new Pessoa("Ytalo", 24);
		Pessoa pessoa5 = new Pessoa("Ian", 25);

		nomes.addAll(Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5));

		nomes.sort((a,b) -> a.getNome().compareTo(b.getNome()));

		nomes.forEach(p -> System.out.println(p.getNome()+" "+p.getIdade()));
		
		System.out.println("----------------------------------------------------------");
		
		nomes.sort((a,b) -> Integer.compare(a.getIdade(), b.getIdade()));
		
		nomes.forEach(p -> System.out.println(p.getNome()+" "+p.getIdade()));
		
	}

}
