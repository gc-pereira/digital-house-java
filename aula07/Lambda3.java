package aula07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda3 {
	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.addAll(Arrays.asList("Franklin", "Ian", "Renan", "Diego", "Juliana"));
		
		Comparator<String> ordenaPorTamanho = new OrdenaPorTamanho();
		Collections.sort(nomes, ordenaPorTamanho);

		// Collections.sort(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println(nomes);
	}
}

class OrdenaPorTamanho implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
}
