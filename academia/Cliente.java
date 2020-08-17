package academia;

public class Cliente extends Pessoa {

	private String dataDeInicio;
	private String tipoDePlano;
	private double valorDoPlano;

	public String getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public String getTipoDePlano() {
		return tipoDePlano;
	}

	public void setTipoDePlano(String tipoDePlano) {
		this.tipoDePlano = tipoDePlano;
	}

	public double getValorDoPlano() {
		return valorDoPlano;
	}

	public void setValorDoPlano(double valorDoPlano) {
		this.valorDoPlano = valorDoPlano;
	}

}
