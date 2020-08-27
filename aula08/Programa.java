package aula08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Programa {
	public static void main(String[] args) {
		Cliente joao = new Cliente("João");
		Cliente maria = new Cliente("Maria");
		Cliente rodolfo = new Cliente("Rodolfo");
		Cliente pedro = new Cliente("Pedro");
		Cliente giovana = new Cliente("Giovana");
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.addAll(Arrays.asList(joao, maria, rodolfo, pedro, giovana));
		
		Produto celular = new Produto("celular", 1000.0);
		Produto bone = new Produto("boné", 30.0);
		Produto tenis = new Produto("tenis", 200.0);
		Produto lapis = new Produto("lápis", 5.0);
		
		List<Produto> produtos = new ArrayList<>();
		produtos.addAll(Arrays.asList(celular, bone, tenis, lapis));
		
		Compra compra1 = new Compra(joao, bone);
		Compra compra2 = new Compra(maria, lapis);
		Compra compra3 = new Compra(rodolfo, celular);
		Compra compra4 = new Compra(pedro, celular);
		Compra compra5 = new Compra(giovana, tenis);
		
		List<Compra> compras = new ArrayList<>();
		compras.addAll(Arrays.asList(compra1, compra2, compra3, compra4, compra5));
		
		System.out.println(
				produtos
				.stream()
				.filter((p) -> p.getPreco() > 100.0)
				.map((p) -> p.getNome())
				.collect(Collectors.toList())
				);
		
		System.out.println(
				clientes
				.stream()
				.map((c) -> c.getNome())
				.collect(Collectors.toList())
				);
		
		System.out.println(
				compras
				.stream()
				.map((c) -> c.getProduto())
				.mapToDouble((p) -> p.getPreco())
				.sum()
				); 
	}
}
