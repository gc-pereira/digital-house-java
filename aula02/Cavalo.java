package aula02;

public class Cavalo extends Animal {

	@Override
	public void ruido() {
		System.out.println("O cavalo est� relinchando");
	}

	public void correr() {
		System.out.println("O cavalo est� correndo");
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		System.out.println("O cavalo foi salvo!");
	}
}
