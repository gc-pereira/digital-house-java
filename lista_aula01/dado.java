package lista_aula01;

import java.util.Random;

public class dado {

	public static void main(String[] args) {

		int[] numerosDoDado = new int[20];
		int contaUm = 0;
		int contaDois = 0;
		int contaTres = 0;
		int contaQuatro = 0;
		int contaCinco = 0;
		int contaSeis = 0;

		Random gerador = new Random();

		for (int i = 0; i < 20; i++) {
			numerosDoDado[i] = gerador.nextInt(6) + 1;
		}
		
		for (int j: numerosDoDado) {
			if (j == 1) {
				contaUm += 1;
			}
			if (j == 2) {
				contaDois += 1;
			}
			if (j == 3) {
				contaTres += 1;
			}
			if (j == 4) {
				contaQuatro += 1;
			}
			if (j == 5) {
				contaCinco += 1;
			}
			if (j == 6) {
				contaSeis += 1;
			}
		}
		System.out.println("A frequencia do numero 1 é " + contaUm/20.0);
		System.out.println("A frequencia do numero 2 é " + contaDois/20.0);
		System.out.println("A frequencia do numero 3 é " + contaTres/20.0);
		System.out.println("A frequencia do numero 4 é " + contaQuatro/20.0);
		System.out.println("A frequencia do numero 5 é " + contaCinco/20.0);
		System.out.println("A frequencia do numero 6 é " + contaSeis/20.0);
		System.out.println("E a soma delas é igual a " + (contaUm+contaDois+contaTres+contaQuatro+contaCinco+contaSeis)/20.0);
	}
}