package Pr2;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {

		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		l.agregarFinal(2);
		l.agregarFinal(3);
		l.agregarFinal(9);
		l.agregarFinal(9);
		
		while (!l.fin()){
			System.out.println(l.proximo());
		}

	}

}
