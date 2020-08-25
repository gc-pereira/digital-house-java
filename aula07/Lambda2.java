package aula07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda2 {
	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.addAll(Arrays.asList("Franklin", "Ian", "Renan", "Diego", "Juliana"));

		nomes.sort((nome1, nome2) -> Integer.compare(nome1.length(), nome2.length()));

		nomes.forEach(System.out::println);

		System.out.println(nomes);
	}
}
