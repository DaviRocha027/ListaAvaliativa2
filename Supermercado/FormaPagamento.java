package Supermercado;

public class FormaPagamento {
	private String pagamento;
	public FormaPagamento() {
		// TODO Auto-generated constructor stub
	}
	public FormaPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	@Override
	public String toString() {
		return pagamento;
	}
	
}
