package Pr1B;

public class ej1 {
  
	public static void imprimirFor(int a, int b) {		// Metodos de clase
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}
  
	public static void imprimirWhile(int a, int b) {
		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}
  
	public static void imprimirSinNada(int a, int b) {
		if (a == b) {
			System.out.println(a);
		}
		else {
			System.out.println(a);
			a++;
			ej1.imprimirSinNada(a,b);
		}
	}
}