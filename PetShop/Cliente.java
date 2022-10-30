package PetShop;

public class Cliente {
	private String nomeCliente,
	sobreNomeCliente,
	telefoneCliente;
	private int codigoCliente;
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public Cliente(String nomeCliente, String sobreNomeCliente, String telefoneCliente, int codigoCliente) {
		this.nomeCliente = nomeCliente;
		this.sobreNomeCliente = sobreNomeCliente;
		this.telefoneCliente = telefoneCliente;
		this.codigoCliente = codigoCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getSobreNomeCliente() {
		return sobreNomeCliente;
	}
	public void setSobreNomeCliente(String sobreNomeCliente) {
		this.sobreNomeCliente = sobreNomeCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	
	
}
