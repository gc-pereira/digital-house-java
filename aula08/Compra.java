package aula08;

public class Compra {
	private Produto produto;
	private Cliente cliente;
	
	public Compra(Cliente cliente, Produto produto) {
		this.cliente = cliente;
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
