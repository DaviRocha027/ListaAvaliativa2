package Supermercado;


public class Produto {
	private double valorProduto;
	private String nomeProduto;
	private int quantidadeEstoque;
	
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(double valorProduto, String nomeProduto, int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
		this.valorProduto = valorProduto;
		this.nomeProduto = nomeProduto;
		
	}

	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidade(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	

	
	
}
