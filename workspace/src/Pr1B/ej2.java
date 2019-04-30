package Pr1B;

import java.util.Scanner;

public class ej2 {
	
	public static int[] devolverArr() {	
		Scanner s = new Scanner(System.in);
		System.out.print("Por favor, ingrese un número entero: ");
		int n = s.nextInt();
		if (n > 0) {
			int[] arr = new int [n];
			int aux = 1;
			for (int i=0; i < arr.length ; i++) {
				arr[i] = aux*n;
				aux = aux + 1;
			}
		}
		int[] arr = new int [n];
		int aux = 1;
		for (int i=0; i < arr.length ; i++) {
			arr[i] = aux*n ;
			aux = aux+1;
		}
		return arr;
	}
}