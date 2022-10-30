package ConversorUnidade;

public class ConversorUnidadesVolume {

	public ConversorUnidadesVolume() {
		// TODO Auto-generated constructor stub
	}
	 public static void converterCmCubicos(double litro) {
	        System.out.println(litro + " L = " + (litro * 1000) + " cm³.");
	    }
	    
	    public static void converterLitros(double metroCubico) {
	        System.out.println(metroCubico + " M³ = " + (metroCubico * 1000) + " L.");
	    }
	    
	    public static void converterPesCubicos(double metroCubico) {
	        System.out.println(metroCubico + " M³ = " + (metroCubico * 35.32) + " ft³.");
	    }
	    
	    public static void converterPolCubicas(double galaoAmericano) {
	        System.out.println(galaoAmericano + " gal = " + (galaoAmericano * 231) + " in³.");
	    }
	    
	    public static void converterGalParaLitros(double galaoAmericano) {
	        System.out.println(galaoAmericano + " gal = " + (galaoAmericano * 3.785) + " L.");
	    }

}
