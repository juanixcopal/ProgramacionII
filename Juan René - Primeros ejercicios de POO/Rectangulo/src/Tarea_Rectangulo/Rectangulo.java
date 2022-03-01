package Tarea_Rectangulo;

public class Rectangulo {
	double base;
	double altura;
	
	public static void Main(String[]args) {
		Rectangulo rectangulo = new Rectangulo(5,2);
		System.out.println(rectangulo.getArea());
	}
	
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	public double getArea() {
		double resultado =base*altura;
		return resultado;
	}
	
	public double getPerimetro() {
		double respuesta = base+altura+base+altura;
		return respuesta;
	}
}