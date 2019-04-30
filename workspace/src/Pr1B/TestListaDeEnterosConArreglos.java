package Pr1B;

public class TestListaDeEnterosConArreglos {
	
	public static void main(String[] args) {
		System.out.println("			Usando la sentencia return");
		System.out.println();
		int[] arrInt = {3, 4, 5, 8, 0};
		Datos datos = ej5.calcularReturn(arrInt);
		System.out.println("El máximo es " + datos.getMax());
		System.out.println("El mínimo es " + datos.getMin());
		System.out.println("El promedio es " + datos.getProm());
		System.out.println();
		
		
		
		System.out.println("			Sin usar parámetros");
		System.out.println();
		ej5.calcularSinParametro();
		
	}
}