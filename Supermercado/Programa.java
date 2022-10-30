package Supermercado;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Cliente
		System.out.println("Dados do cliente. ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Telefone: ");
		String telefone = sc.nextLine();
		System.out.println("CPF: ");
		String cpf = sc.nextLine();
		
		
		Cliente cliente = new Cliente(nome,telefone, cpf);
		// forma de pagamento
		System.out.println("Forma de pagamento: ");
		String pagamentos= sc.next();
		
		FormaPagamento pagamento = new FormaPagamento(pagamentos);
		Pedido pedido = new Pedido(cliente, pagamento);
		
		//pedido
		System.out.println("Quantos itens deseja? ");
		int n = sc.nextInt();
		for(int i =1; i<=n; i++) {
			System.out.println("Pedido nº " + i + "\n");
			System.out.println("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.println("Valor do produto: ");
			double valorProduto = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(valorProduto, nomeProduto, 100);
			ItensPedido ip = new ItensPedido(produto, valorProduto, quantidade);
			if(quantidade > produto.getQuantidadeEstoque()) {
				System.out.println("ERRO, estoque insulficiente");
			}else {			
			pedido.addItem(ip);
			}
			
		}
	System.out.println(pedido);
		
	sc.close();
	}

}
