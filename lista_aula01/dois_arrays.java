package lista_aula01;

import java.util.ArrayList;
import java.util.Scanner;

public class dois_arrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> menoresQueZero = new ArrayList<Integer>();
		ArrayList<Integer> maioresQueZero = new ArrayList<Integer>();
		ArrayList<Integer> vetorDeNumeros = new ArrayList<Integer>();

		System.out.print("enter how many numbers you have to type: ");
		int contador = input.nextInt();

		int i = 0;
		while (i < contador) {
			System.out.print("enter the number: ");
			int numero = input.nextInt();
			vetorDeNumeros.add(numero);
			i++;
		}
		for (Integer j : vetorDeNumeros) {
			if (j < 0 & menoresQueZero.size() < 8) {
				menoresQueZero.add(j);
			} else {
				if (maioresQueZero.size() < 8) {
					maioresQueZero.add(j);
				}
			}
		}
		System.out.println("Os numeros menores que zero são " + menoresQueZero);
		System.out.println("Os numeros maiores que zero são " + maioresQueZero);
	}
}
