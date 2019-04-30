package Pr2;

public class TestEjercicio1_6 {
	
	public static void main (String[] args) {
		
		Ejercicio1_6 f = new Ejercicio1_6();
		ListaDeEnteros l = f.calcularSucesion(4);
		l.comenzar();
		while (!l.fin()) {
			System.out.println(l.proximo());
		}
		
		//Forma 2: es ineficiente igual
			//for (int i = 1 ; i <= l.tamanio() ; i++){
				//System.out.printll(l.elemento(i))}
	}
}