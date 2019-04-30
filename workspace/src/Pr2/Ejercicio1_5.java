package Pr2;

public class Ejercicio1_5 {
	
	/*public void impresionInversa (ListaDeEnteros l) {
		if (LLEGUE AL FINAL) {
			IMPRIMIR;
		}
		else {
			LLAMADA RECURSIVA CON EL SIGUIENTE;
			iMPRIMIR N
		}
	}*/
	
	public void impresionInversa (ListaGenerica l) {
		if (l.tamanio() == 1) {
			System.out.println(l.elemento(1));
		}
		else {
			ListaGenerica laux = l.clonar();
			laux.eliminarEn(1);
			impresionInversa(laux);
			System.out.println(l.elemento(1));
		}
	}
}