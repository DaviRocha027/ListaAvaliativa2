package SegundoHoras;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Seconds tempo = new Seconds();
		System.out.println("Digite o tempo em segundos: ");
		tempo.setSegundos(sc.nextInt());

		System.out.println(tempo.toString());
		
		sc.close();
	}

}
