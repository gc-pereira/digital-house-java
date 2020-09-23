package aula06;

import java.util.ArrayList;

public class ExercicioUm {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Pato");
		animals.add("Cachorro");
		animals.add("Gato");

		/*
		 * Se rodar programa buscando a posição 3 da erro de compilação
		 * System.out.println(animals.get(3);
		 */

		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println(animals.get(i) + ": Está na posição " + i);
			}
		} catch (Exception e) {
			System.out.println("Não temos a posição 3!");
			e.printStackTrace();
		}
	}

}
