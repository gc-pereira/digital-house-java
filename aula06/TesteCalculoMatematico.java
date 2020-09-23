package aula06;

public class TesteCalculoMatematico {
	public static void main(String[] args) {
		CalculoMatematico divisao = new CalculoMatematico(0, 4);

		/*
		 * divisao.divisao(); Ao executar esse metodo retorna uma exception
		 */
		
		try {
			divisao.divisao();			
		}catch(ArithmeticException e){
			System.out.println("");
			System.out.println(e.getMessage());
		}
	}
}
