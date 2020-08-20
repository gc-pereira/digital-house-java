package aula05.lista_exercicios.Exercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestaApelidos {
	
	public static void main(String[] args) {
		
		List<Amigos> amigos = new ArrayList<>();
		
		Amigos joao = new Amigos("João","Juan", "Fissura", "Maromba");
		Amigos miguel = new Amigos("Miguel","Night Watch", "Bruce Wayne", "Tampinha");
		Amigos maria = new Amigos("Maria","Wonder Woman", "Mary", "Marilene");
		Amigos lucas = new Amigos("Lucas","Lukinha", "Jorge", "George");
		
		amigos.add(joao);
		amigos.add(miguel);
		amigos.add(maria);
		amigos.add(lucas);
		
		HashMap<String, List<Amigos>> mapaAmigos = new HashMap<>();
		mapaAmigos.put("Nome", amigos);
		
		for (String keySet : mapaAmigos.keySet()) {
			System.out.println(keySet);
			for(Amigos amigo: mapaAmigos.get(keySet)) {
				System.out.println(amigo.toString());
			}
		}
		
	}

}
