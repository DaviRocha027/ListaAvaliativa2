package Supermercado;

public class Cliente {
	private String nomeCliente, telefoneCliente, cpfCliente;
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nomeCliente, String telefoneCliente, String cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.telefoneCliente = telefoneCliente;
		this.cpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	@Override
	public String toString() {
		return  nomeCliente+ "\nTelefone: "  + telefoneCliente+ "\nCPF: "
				+ cpfCliente ;
	}
	
}
