package aula06;

public class CalculoMatematico {
	private int divisor;
	private int dividendo;

	public CalculoMatematico(int divisor, int dividendo) {
		this.divisor = divisor;
		this.dividendo = dividendo;
	}

	/*
	 * public void divisao() { try { int resultado = dividendo / divisor;
	 * System.out.println(resultado); }catch(ArithmeticException e) {
	 * System.out.println("Não é possível dividir por zero"); }
	 * 
	 * }
	 */
	
	public int divisao() { 
		int resultado = dividendo/divisor;
		if(divisor == 0) {
			throw new ArithmeticException("TEXTO");			
		}else {
			return resultado;
		}
	}
	
}
