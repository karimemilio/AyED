package Pr1B;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private String comision;
	private String email;
	private String direccion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void tusDatos() {
		System.out.println(this.getNombre() + " " + this.getApellido() + ", comisión " + this.getComision() + ", email " + this.getEmail() + ", vive en " + this.getDireccion());
	}

}
