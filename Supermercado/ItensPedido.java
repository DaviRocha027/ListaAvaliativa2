package Supermercado;


public class ItensPedido {
	private Produto produto;
	private double valor;
	private int quantidade;
	
	public ItensPedido(Produto produto, double valor, int quantidade) {
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double total() {
		return quantidade * valor;
	}
	
	public String toString() {
		return getProduto().getNomeProduto() + 
				"\nQuantidade Comprada: "+ quantidade+
				"\nPreco UN R$:"+String.format("%.2f", valor)+
				"\nValor total R$: " + String.format("%.2f",total()); 
	}
		
}
	
	
	

	
	

