package Tarea_Coche;

public class Coche {
	String color;
	String marca;
	String modelo;
	String matricula;
	int caballos;
	int puertas;
	
	public Coche(String color, String marca, String modelo, String matricula, int caballos, int puertas) {
		this.color=color;
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.caballos=caballos;
		this.puertas=puertas;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		this.color=newColor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String newMarca) {
		this.marca=newMarca;
	}
	
}