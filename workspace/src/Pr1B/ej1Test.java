package Pr1B;

import java.util.Scanner;

public class ej1Test {
	
  public static void main(String[] args) {
	  
	  Scanner s = new Scanner(System.in);
	  System.out.print("Ingrese inicio del intervalo: ");
	  int a = s.nextInt();
	  System.out.print("Ingrese fin del intervalo: ");
	  int b = s.nextInt();
	  System.out.println();
	  if (a <= b) {
		  System.out.println("Usando un for...");
		  ej1.imprimirFor(a, b);
		  System.out.println();
		  System.out.println("Usando un while...");
		  ej1.imprimirWhile(a, b);
		  System.out.println();
		  System.out.println("Sin usar estructura iterativa (usando recursion)");
		  ej1.imprimirSinNada(a, b);
		  
	  }
	  else {
		  System.out.print("El intervalo no es valido!");
		  
	  }
	  s.close();
  }
}