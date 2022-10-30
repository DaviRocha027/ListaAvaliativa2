package ContaCorrente;
	
public class ContaCorrente {
	private double depositar,sacar,saldo;
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}
	public ContaCorrente(double saldo ) {
		this.saldo = saldo;
	}
	public double getDepositar() {
		return depositar;
	}
	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}
	public double getSacar() {
		return sacar;
	}
	public void setSacar(double sacar) {
		this.sacar = sacar;
	}
	
	public void  saque(double saque) {
		  saldo -= sacar+(saque*0.005);
	}
	public void deposito(double deposito) {
		 saldo += deposito;
	}
	
	public String toString() {
		return  "\nSaldo: R$ "+ String.format("%.2f",saldo);
	}
	
	
}
