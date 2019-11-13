package ejercicio2_herencia;

public class Persona {
	private String nombre;
	private String apellidos;
	int edad;
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellidos() {
		return apellidos;
	}
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	
}
