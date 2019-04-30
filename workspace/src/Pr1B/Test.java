package Pr1B;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Estudiante[] arrEst = new Estudiante[2];
		Profesor[] arrProf = new Profesor[3];
		
		String nombre, apellido, comision, email, direccion, catedra, facultad;
		
		for (int i = 0 ; i < arrEst.length ; i++) {
			System.out.print("Ingrese un alumno: ");
			System.out.println();
			System.out.println();
			System.out.print("Ingrese nombre: ");
			nombre = s.nextLine();
			System.out.print("Ingrese apellido: ");
			apellido = s.nextLine();
			System.out.print("Ingrese comision: ");
			comision = s.nextLine();
			System.out.print("Ingrese email: ");
			email = s.nextLine();
			System.out.print("Ingrese direccion: ");
			direccion = s.nextLine();
			arrEst[i] = new Estudiante();
			arrEst[i].setNombre(nombre);
			arrEst[i].setApellido(apellido);
			arrEst[i].setComision(comision);
			arrEst[i].setEmail(email);
			arrEst[i].setDireccion(direccion);
			System.out.println();
		}
		for (int j = 0 ; j < arrProf.length ; j++) {
			System.out.print("Ingrese un profesor: ");
			System.out.println();
			System.out.println();
			System.out.print("Ingrese nombre: ");
			nombre = s.nextLine();
			System.out.print("Ingrese apellido: ");
			apellido = s.nextLine();
			System.out.print("Ingrese email: ");
			email = s.nextLine();
			System.out.print("Ingrese cátedra: ");
			catedra = s.nextLine();
			System.out.print("Ingrese facultad: ");
			facultad = s.nextLine();
			arrProf[j] = new Profesor();
			arrProf[j].setNombre(nombre);
			arrProf[j].setApellido(apellido);
			arrProf[j].setEmail(email);
			arrProf[j].setCatedra(catedra);
			arrProf[j].setFacultad(facultad);
			System.out.println();
		}
		
		for (int i = 0 ; i < arrEst.length ; i++) {
			arrEst[i].tusDatos();
		}
		
		for (int j = 0 ; j < arrProf.length ; j++) {
			arrProf[j].tusDatos();
		}
	}

}
