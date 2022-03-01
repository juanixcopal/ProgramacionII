package Tarea_Rectangulo;

public class PruebaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contadorRectangulo = 0;
		
		for(int c=0; c<=4; c++) {
			contadorRectangulo=contadorRectangulo+1;
			
			int a = (int)(Math.random()*10);
            int b = (int)(Math.random()*10);
			
			Rectangulo rectangulo1 = new Rectangulo(a,b);		
			rectangulo1.getArea();
			System.out.println("El area del RECTANGULO "+contadorRectangulo+" es: " + rectangulo1.getArea());		
			System.out.println("El perimetro del RECTANGULO "+contadorRectangulo+" es: " + rectangulo1.getPerimetro());
			System.out.println("");
		}
	}
}