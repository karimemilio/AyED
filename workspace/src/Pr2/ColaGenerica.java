package Pr2;

public class ColaGenerica <T>{

	private ListaGenerica<T> datos;
	
	public ColaGenerica() {	//Constructor
		
		datos = new ListaEnlazadaGenerica<T>();
				
	}
	
	public void encolar (T elem) {
		
		datos.agregarFinal(elem);
		
	}
	
	public T desencolar() {
		
		T elem = datos.elemento(1);
		datos.eliminarEn(1);
		return elem;
	}

	
}
