package Estoque;

public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	public Estoque() {
		// TODO Auto-generated constructor stub
	}
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdAtual() {
		return qtdAtual;
	}
	public void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	public int getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public void setRepor(int qtdAtual) {
		this.qtdAtual += qtdAtual;
	}
	
	public void darBaixa(int qtdAtual) {
		this.qtdAtual -= qtdAtual;
	}
	public boolean precisaRepor() {
		if(qtdAtual < qtdMinima) {
			System.out.print("Precisa Repor "+ (qtdMinima - qtdAtual)+" qtds no ");
			return true;
			
		}else {
		return false;
		}
	}
	
	public String toString() {
		return " \n NomeProduto = " + nome + "\n qtdAtual = " + qtdAtual + "\n qtdMinima = " + qtdMinima;
	}
	
}
