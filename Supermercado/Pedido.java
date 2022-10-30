package Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private Cliente cliente;
	private FormaPagamento pagamento;
	private List<ItensPedido> pedido = new ArrayList<>();
	public Pedido(Cliente cliente, FormaPagamento pagamento) {
		this.cliente = cliente;
		this.pagamento = pagamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public FormaPagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public void addItem(ItensPedido item) {
		pedido.add(item);
	}
	public void removeItem(ItensPedido item) {
		pedido.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for(ItensPedido ip : pedido) {
			soma += ip.total();
		}
		return soma;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-----NOTA FISCAL-----\n");

		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("---------------------------------\n");
		sb.append("Itens do pedido:\n");
		for (ItensPedido item : pedido) {
			sb.append(item + "\n");
			sb.append("--------------\n");
		}
		sb.append("Total: R$ ");
		sb.append(String.format("%.2f", total()));
		sb.append("\nForma de pagamento: ");
		sb.append(pagamento);
		return sb.toString();

	}

}
