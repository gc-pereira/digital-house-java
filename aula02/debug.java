package aula02;

public class debug {
	public static void main(String[] args) {
		int[] array = { 11, 5, 8, 7, 10 };
		int total = soma(array);

		System.out.println("Total é " + total);
	}

	public static int soma(int[] array) {
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		return total;
	}
}
