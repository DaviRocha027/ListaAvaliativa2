package ContaCorrente;

public class Cliente {
	private String nome, cpf, dataNascimento, numeroConta;
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public Cliente(String nome, String cpf, String dataNascimento, String numeroConta) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.numeroConta = numeroConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	@Override
	public String toString() {
		return "Extrato\nNumero da Conta: "+ numeroConta + "\nCliente: " + nome  + "\nCPF: " + cpf + "\nData de Nascimento: "
				+ dataNascimento  ;
	}
	
}
