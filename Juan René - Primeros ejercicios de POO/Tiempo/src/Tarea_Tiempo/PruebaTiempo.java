package Tarea_Tiempo;

public class PruebaTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiempo tiempo = new Tiempo(12,25,45);
		
		tiempo.setHora(12); //modificador de horas
		tiempo.setMinutos(45); //modificador de minutos
		System.out.println("El hora es: " + tiempo.getHora() + ":" + tiempo.getMinutos());

	}

}