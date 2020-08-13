package aula02;

public class cachorro extends Animal {

	public void ruido() {
		System.out.println("O cachorro está latindo");
	}

	public void correr() {
		System.out.println("Cachorro correndo!");
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		System.out.println("O cachorro foi salvo!");
	}
}