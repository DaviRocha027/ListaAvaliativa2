package ConversorUnidade;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 double litro, metroCubico, galaoAmericano;
	        System.out.println("Digite o valor de litro, metro cubico e galao americano: ");
	        
	        litro = sc.nextDouble();
	        metroCubico = sc.nextDouble();
	        galaoAmericano = sc.nextDouble();
	        
	        System.out.println("Conversões de unidades de volume:");
	        System.out.println("");
	        ConversorUnidadesVolume.converterCmCubicos(litro);
	        ConversorUnidadesVolume.converterLitros(metroCubico);
	        ConversorUnidadesVolume.converterPesCubicos(metroCubico);
	        ConversorUnidadesVolume.converterPolCubicas(galaoAmericano);
	        ConversorUnidadesVolume.converterGalParaLitros(galaoAmericano);
	        sc.close();
	}

}
