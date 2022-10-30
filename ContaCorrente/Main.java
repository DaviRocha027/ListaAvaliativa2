package ContaCorrente;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// iniciando a conta 1.
		System.out.println("Dados da conta: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("CPF: ");
		String cpf = sc.nextLine();
		
		System.out.println("Data de Nascimento: ");
		String dataNasc = sc.nextLine();
		System.out.println("Numero da conta: ");
		String numeroConta = sc.nextLine();
		Cliente cliente = new Cliente(nome, cpf,dataNasc,numeroConta);
		
		ContaCorrente conta1 = new ContaCorrente(0);
		
		System.out.println(cliente.toString()+conta1.toString());
		//depositando dinheiro conta 1
		System.out.println();
		System.out.println("Digite o valor de deposito: ");
		conta1.setDepositar(sc.nextDouble());
		conta1.deposito(conta1.getDepositar());
		System.out.println("----------Depositando----------");
		System.out.println(cliente.toString()+"\nValor de deposito: "+ conta1.getDepositar()+conta1.toString());
		 
		
		System.out.println();  
		System.out.println("Deseja fazer mais um deposito?\n 1 - Sim\n 2 - Nao ");
		int resposta = sc.nextInt();
		if(resposta == 1) {
			do{
				System.out.println("Digite o valor de deposito: ");
				conta1.setDepositar(sc.nextDouble());
				conta1.deposito(conta1.getDepositar()); 
				System.out.println(cliente.toString()+"\nValor de deposito: "+ conta1.getDepositar()+conta1.toString());
				System.out.println();
				System.out.println("Deseja fazer mais um deposito?\n 1 - Sim\n 2 - Nao ");
				resposta = sc.nextInt();
				
			} while(resposta == 1);
		}	
		//sacando dinheiro conta 1
		System.out.println();
		System.out.println("Digite o valor de saque: ");
		conta1.setSacar(sc.nextDouble());
		conta1.saque(conta1.getSacar());
		System.out.println("----------Sacando----------");
		System.out.println(cliente.toString()+"\nValor de saque: "+ conta1.getSacar()+"\nTaxa de operação: R$ "+conta1.getSacar()*0.005+conta1.toString());
		System.out.println();
		System.out.println("Deseja fazer mais um saque?\n 1 - Sim\n 2 - Nao ");
		resposta = sc.nextInt();
		while(resposta == 1) {
			System.out.println("Digite o valor de saque: ");
			conta1.setSacar(sc.nextDouble());
			conta1.saque(conta1.getSacar());
			System.out.println(cliente.toString()+"\nValor de saque: "+ conta1.getSacar()+"\nTaxa de operação: R$ "+conta1.getSacar()*0.005+conta1.toString());
			System.out.println();
			System.out.println("Deseja fazer mais um saque?\n 1 - Sim\n 2 - Nao ");
			resposta = sc.nextInt();
		}
		System.out.println("---------------EXTRATO FINAL---------------");
		System.out.println(cliente.toString()+conta1.toString());

		sc.close();
	}

}
