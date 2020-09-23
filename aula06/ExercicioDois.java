package aula06;

import java.util.ArrayList;

public class ExercicioDois {
	public static void main(String[] args) {
		//ArrayList<String> animals = null;
		ArrayList<String> animals = new ArrayList<>();
		
		/*Ao imprimir isso imprime NullPointerException
		 *System.out.println(animals.get(2));
		*/
		
		try {
			animals.add("Pato");
			animals.add("Cachorro");
			animals.add("Gato");
			System.out.println(animals.get(5));
		//}catch(NullPointerException e) {
			//System.out.println("Não temos nenhum valor dentro da lista!");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Não temos a posição 5 nessa lista :(");
			e.printStackTrace();
		}
	}
}