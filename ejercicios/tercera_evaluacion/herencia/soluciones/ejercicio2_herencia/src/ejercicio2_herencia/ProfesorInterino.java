package ejercicio2_herencia;

public final class ProfesorInterino extends Profesor {
	private int horasContratadas;

	public ProfesorInterino(String nombre, String apellidos, int edad,
			String especialidad, int horasContratadas) {
		super(nombre, apellidos, edad, especialidad);
		this.horasContratadas = horasContratadas;
	}

	public int getHorasContratadas() {
		return horasContratadas;
	}

	public void setHorasContratadas(int horasContratadas) {
		this.horasContratadas = horasContratadas;
	}
	
}
