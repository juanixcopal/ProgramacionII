package Tarea_Coche;

public class PruebaCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1 = new Coche("rojo", "Toyota", "Modelo Uno", "12DGF25", 14, 4);
		Coche coche2 = new Coche("verde", "BMW", "Modelo Cuatro", "15DHE46", 20, 2);
		Coche coche3 = new Coche("amarillo", "Mercedes-Benz", "Modelo Tres", "24NSF15", 17, 4);
		
		coche1.setColor("Verde");
		System.out.println("Color coche 1: " + coche1.getColor());
		System.out.println("");
		
		
		coche2.setColor("Rojo");
		System.out.println("Color coche 2: " + coche2.getColor());
		System.out.println("");
		
		coche3.setColor("Morado");
		System.out.println("Color coche 3: " + coche3.getColor());

	}

}