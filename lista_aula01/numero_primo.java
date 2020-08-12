package lista_aula01;

import java.util.Scanner;
import java.util.ArrayList;

public class numero_primo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		
		int contador = 0;
		int numero = 0;
		int numeros[] = new int[9];
		int i = 0;
		
		while (i < 9) {
			System.out.print("Enter " + (i + 1) + "st number: ");
			numeros[i] = input.nextInt();
			i++;
		}
		for (Integer j : numeros) {
			contador = 0;

			for (int u = 1; u <= i; u++) {
				if (j % u == 0) {
					contador++;
					numero = u;
				}
			}

			if (contador == 2) {
				System.out.println("O Número: " + numero + " é primo.");
			}
		}
	}
}
