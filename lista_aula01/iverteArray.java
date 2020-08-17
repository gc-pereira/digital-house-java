package lista_aula01;

import java.util.Scanner;
import java.util.Arrays;

public class iverteArray {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float[] numeros = new float[5];
		float[] numerosInvertidos = new float[5];
		int i = 0;
		
		System.out.print("Digite 0, 1 ou 2: ");
		int codigo = input.nextInt();
		
		if(codigo == 0) {
			return;
		}
		
		while(i < 5) {
			System.out.println("Digite um numero:");
			float num = input.nextFloat();
			numeros[i] = num;
			i++;
		}
		
		switch (codigo) {
		case 1:
			System.out.println(Arrays.toString(numeros));
			
		case 2:
			int j;
			for(j = 4; j >= 0; j--) {
				numerosInvertidos[4-j] = numeros[j]; 
			}
			System.out.println(Arrays.toString(numerosInvertidos));
			System.out.println(Arrays.toString(numeros));

		default:
			break;
		}
		
		

	}
}