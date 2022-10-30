package Estoque;

public class UseEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta ", 13 ,6);
		Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas ", 11 ,13);
		Estoque estoque3 = new Estoque("Mouse Otico ", 6 ,2);

		System.out.println("Estoque 1"+estoque1);
		System.out.println();
		System.out.println("Estoque 2"+estoque2);
		System.out.println();
		System.out.println("Estoque 3"+estoque3);
		System.out.println();
		
		estoque1.darBaixa(5);
		estoque2.setRepor(7);
		estoque3.darBaixa(4);
		System.out.println("Precisa repor? ");
		System.out.println(" estoque 1 "+estoque1.precisaRepor()); 
		System.out.println();
		System.out.println(" estoque 2 "+estoque2.precisaRepor()); 
		System.out.println();
		System.out.println(" estoque 3 "+estoque3.precisaRepor()); 
		
		System.out.println("--------------------------Atualizando--------------------");
		
		System.out.println("Estoque 1"+estoque1);
		System.out.println();
		System.out.println("Estoque 2"+estoque2);
		System.out.println();
		System.out.println("Estoque 3"+estoque3);
		
	}
	
	

}
