package ejercicio2_herencia;

public class Profesor extends Persona {
private String especialidad;

public Profesor(String nombre, String apellidos, int edad, String especialidad) {
	super(nombre, apellidos, edad);
	this.especialidad = especialidad;
}

protected String getEspecialidad() {
	return especialidad;
}

protected void setEspecialidad(String especialidad) {
	this.especialidad = especialidad;
}

}
