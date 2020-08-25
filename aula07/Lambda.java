package aula07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.addAll(Arrays.asList("Franklin","Ian","Renan","Diego","Juliana"));
		
		Collections.sort(nomes);
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		System.out.println(nomes);
	}
}
