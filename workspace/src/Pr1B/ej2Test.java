package Pr1B;

public class ej2Test {
	
	public static void main(String[] args) {
		int[] aux;
		for (int i=1 ; i<3; i++) {
			aux = ej2.devolverArr();
			System.out.println();
			System.out.println("El arreglo es: ");
			System.out.println();
			for(int j=0; j< aux.length ; j++){
				System.out.print(aux[j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}

}