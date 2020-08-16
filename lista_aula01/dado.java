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
		int freq1, freq2, freq3, freq4, freq5, freq6;

		Random gerador = new Random();

		for (int i = 0; i < 20; i++) {
			numerosDoDado[i] = gerador.nextInt(6) + 1;

			switch (numerosDoDado[i]) {
			case 1: {
				contaUm += 1;;
				freq1 = contaUm/20;
			}
			case 2: {
				contaDois += 1;
				freq2 = contaUm/20;
			}
			case 3: {
				contaTres += 1;
				freq3 = contaUm/20;
			}
			case 4: {
				contaQuatro += 1;
				freq4 = contaUm/20;
			}
			case 5: {
				contaCinco += 1;
				freq5 = contaUm/20;
			}
			case 6: {
				contaSeis += 1;
				freq6 = contaUm/20;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + numerosDoDado[i]);
			}
		}
		System.out.println("A frequencia do numero 1 é "+freq1);
		System.out.println("A frequencia do numero 2 é "+freq2);
		System.out.println("A frequencia do numero 3 é "+freq3);
		System.out.println("A frequencia do numero 4 é "+freq4);
		System.out.println("A frequencia do numero 5 é "+freq5);
		System.out.println("A frequencia do numero 6 é "+freq6);
	}
}