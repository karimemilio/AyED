package Pr1B;

import java.util.Scanner;

public class ej5 {
	
	//Atributos// 
	
	private static int[] arr;
		
	//Getters y Setters// 
	
	public static int[] getArr() {
		return arr;
	}

	public static void setArr(int[] arr) {
		ej5.arr = arr;
	}
	
	//Métodos de clase//

	public static Datos calcularReturn (int[] arrInt) {
		ej5.setArr(arrInt);
		int max = 0;
		int min = 0;
		int suma = 0;
		float prom = 0;
		for (int i = 0 ; i < arrInt.length ; i++) {
			if (arrInt[i] > max) max = arrInt[i];
			if (arrInt[i] < min) min = arrInt[i];
			suma = suma + arrInt[i];
		}
		prom = suma / arrInt.length ;
		Datos aux = new Datos();
		aux.setMax(max);
		aux.setMin(min);
		aux.setProm(prom);
		return aux;
	}
	
/*
	public static Datos calcularParametro (Datos datos) {
		int max = 0;
		int min = 0;
		int suma = 0;
		float prom = 0;
		int[] arrInt;
		arrInt = ej5.getArr();
		for (int i = 0 ; i < arrInt.length ; i++) {
			if (arrInt[i] > max) max = arrInt[i];
			if (arrInt[i] < min) min = arrInt[i];
			suma = suma + arrInt[i];
		}
		prom = suma / arrInt.length ;
		Datos aux = new Datos();
		aux.setMax(max);
		aux.setMin(min);
		aux.setProm(prom);
		return aux;
	}
	*/
	public static void calcularSinParametro () {
		Scanner s = new Scanner(System.in);
		int nro;
		int[] arr = new int[5];
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println("Ingrese un número: ");
			nro = s.nextInt();
			arr[i] = nro;
		}
		int max = -1;
		int min = 9999;
		int suma = 0;
		float prom = 0;
		for (int j = 0 ; j < arr.length ; j++) {
			if (arr[j] > max) max = arr[j];
			if (arr[j] < min) min = arr[j];
			suma = suma + arr[j];
		}
		prom = suma / arr.length;
		System.out.println("El número máximo es: " + max);
		System.out.println("El número mínimo es: " + min);
		System.out.println("El promedio es: " + prom);
		
	}
}
