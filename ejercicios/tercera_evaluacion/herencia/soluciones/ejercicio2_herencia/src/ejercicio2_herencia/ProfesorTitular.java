package ejercicio2_herencia;

public final class ProfesorTitular extends Profesor {
	private int antiguedad;

	public ProfesorTitular(String nombre, String apellidos, int edad,
			String especialidad, int antiguedad) {
		super(nombre, apellidos, edad, especialidad);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
}
