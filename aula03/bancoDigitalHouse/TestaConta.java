package aula03.bancoDigitalHouse;

import java.util.ArrayList;
import java.util.List;

public class TestaConta {
	public static void main(String[] args) {

		List<Conta> contasCliente1 = new ArrayList<>();
		contasCliente1.add(new ContaPoupanca(7193, 245879, 1500.00));
		contasCliente1.add(new ContaCorrente(7193, 219552, 0.00));
		Cliente cliente1 = new Cliente("Gabriel", "475.714.248.01", "Rua dos Inconfidentes, 481", contasCliente1);
		
		
		List<Conta> contasCliente2 = new ArrayList<>();
		contasCliente2.add(new ContaPoupanca(7193, 245879, 4500.00));
		contasCliente2.add(new ContaCorrente(7193, 219552, 100.00));
		Cliente cliente2 = new Cliente("Jose", "475.714.248.01", "Rua dos Inconfidentes, 481", contasCliente2);
		
		List<Conta> contasCliente3 = new ArrayList<>();
		contasCliente3.add(new ContaPoupanca(7193, 245879, 3500.00));
		contasCliente3.add(new ContaCorrente(7193, 219552, 200.00));
		Cliente cliente3 = new Cliente("Maria", "475.714.248.01", "Rua dos Inconfidentes, 481", contasCliente3);
		
		List<Conta> contasCliente4 = new ArrayList<>();
		contasCliente4.add(new ContaPoupanca(7193, 245879, 2500.00));
		contasCliente4.add(new ContaCorrente(7193, 219552, 300.00));
		Cliente cliente4 = new Cliente("Daniela", "475.714.248.01", "Rua dos Inconfidentes, 481", contasCliente4);
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		
		Banco banco = new Banco("Bradesco", 237, clientes);
		System.out.println(banco.geClientes());
	}

}
