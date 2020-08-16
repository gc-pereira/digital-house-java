package lista_aula01;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double[] temps = new double[12];
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
		
		int i = 0;
		while (i < 12) {
			System.out.print("digite a temperatura:");
			temps[i] = input.nextDouble();
			i++;
		}
		
		double maior = 0;
		double menor = 100000000.0;
		int posicaoMenor = 0;
		int posicaoMaior = 0;
		
		
		for(int j = 0; j < 12; j++) {
			if(temps[j] < menor) {
				menor = temps[j];
				posicaoMenor = j;
			}
			if(temps[j] > maior) {
				maior = temps[j];
				posicaoMaior = j;
			}
			System.out.println("A temperatura no mês "+ meses[j] + " foi de "+ temps[j] + "°C");
		}
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("A menor temperatura foi de "+menor+"°C no mês de "+meses[posicaoMenor]);
		System.out.println("A maior temperatura foi de "+maior+"°C no mês de "+meses[posicaoMaior]);
	}
}