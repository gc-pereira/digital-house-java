package aula02;

public class testaAnimal {

	public static void main(String[] args) {

		cachorro cachorro = new cachorro();

		cachorro.cor = "Roxo";
		cachorro.porte = "Grande";
		cachorro.raca = "Pug";

		cachorro.correr();
		System.out.println(cachorro.cor);

		Cavalo cavalo = new Cavalo();

		cavalo.raca = "Manga larga";
		cavalo.porte = "Grande";
		cavalo.cor = "Rajado";

		cavalo.ruido();
		cavalo.salvar();

	}

	public static void salvar(Animal animal) {
		animal.salvar();
	}
}
