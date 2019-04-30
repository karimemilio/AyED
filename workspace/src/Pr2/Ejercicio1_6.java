package Pr2;

public class Ejercicio1_6 {
	
	public ListaDeEnteros calcularSucesion (int n) {
		
		ListaDeEnteros l = new ListaDeEnterosEnlazada(); //Lista de enteros no se puede instanciar -por ser clase abstracta- pero se puede usar como tipo de dato
		//ListaDeEnteros l = new ListaDeEnteros(); ESTA MAL!!
		calcularSucesion (n,l); //Sobrecarga 
		return l;
		
	}
	
	private void calcularSucesion (int n, ListaDeEnteros l) {
		
		if  (n > 1) {
			if (n%2 == 0) {
				int i = n/2;
				calcularSucesion(i, l);
			}
			
			else
				calcularSucesion(3*n+1,l);
		}
		
		l.agregarInicio(n);
	}
}