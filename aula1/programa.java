package aula1;

public class programa {
	public static void main(String[] args) {
		int idade = 20;

		String country = "Brasil";

		if (idade < 18) {
			System.out.println("Usuário não pode beber!");
		} else if (idade < 21 && country == "EUA") {
			System.out.println("Usuário não pode beber!");
		} else {
			System.out.println("Usuário pode beber!");
		}

		switch (country) {
		case "Brasil":
			System.out.println("Usuário é brasileiro");
			break;
		case "EUA":
			System.out.println("Usuário é Norte Americano!");
			break;
		default:
			System.out.println("Usuário com nacionalidade não identificada");
			break;
		}
	}
}