package Pr2;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {

		ListaDeEnterosEnlazada lis = new ListaDeEnterosEnlazada();
		lis.agregarFinal(2);
		lis.agregarFinal(3);
		lis.agregarFinal(9);
		lis.agregarFinal(5);
		
		while (! lis.fin()) {
			System.out.println(lis.proximo());
		}
		
		}

}
