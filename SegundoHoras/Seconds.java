package SegundoHoras;

public class Seconds {
	private int segundos, horas, minutos;
	public Seconds() {
		// TODO Auto-generated constructor stub
	}

	
	public int getSegundos() {
		return segundos  / segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public double getHoras() {
		horas = segundos  /3600;
		return horas ;
	}
	public double getMinutos(){
		minutos = segundos / 60;
		return minutos;
	}
	

	@Override
	public String toString() {
		return "Hora: " + getHoras() + "\nMinutos: "+ getMinutos()+ "\nSegundos: " + getSegundos() ;
	}
	
}
