package Tarea_Tiempo;

public class Tiempo {
	int hora;
	int minutos;
	int segundos;
	
	public Tiempo(int hora, int minutos, int segundos) {
		this.hora=hora;
		this.minutos=minutos;
		this.segundos=segundos;
	}
	
	//Hora
	public int getHora() {
		return hora;
	}
	public void setHora(int newHora) {
		this.hora=newHora;
	}
	
	//Minutos
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int newMinutos) {
		this.minutos=newMinutos;
	}

}