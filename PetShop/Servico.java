package PetShop;

public class Servico {
	private String tipoServico;
	private String tempoServico;
	private double precoServico;
	public Servico() {
		// TODO Auto-generated constructor stub
	}
	public Servico(String tipoServico, String tempoServico, double precoServico) {
		this.tipoServico = tipoServico;
		this.tempoServico = tempoServico;
		this.precoServico = precoServico;
	}
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public String getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(String tempoServico) {
		this.tempoServico = tempoServico;
	}
	public double getPrecoServico() {
		return precoServico;
	}
	public void setPrecoServico(double precoServico) {
		this.precoServico = precoServico;
	}
	
}
