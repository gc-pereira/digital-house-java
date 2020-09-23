package aula06;

import java.util.ArrayList;

public class ExercicioUm {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Pato");
		animals.add("Cachorro");
		animals.add("Gato");

		/*
		 * Se rodar programa buscando a posi��o 3 da erro de compila��o
		 * System.out.println(animals.get(3);
		 */

		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println(animals.get(i) + ": Est� na posi��o " + i);
			}
		} catch (Exception e) {
			System.out.println("N�o temos a posi��o 3!");
			e.printStackTrace();
		}
	}

}
