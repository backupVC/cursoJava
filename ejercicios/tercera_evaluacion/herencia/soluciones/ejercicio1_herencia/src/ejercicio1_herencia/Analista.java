package ejercicio1_herencia;

public class Analista extends InformaticoAbs {
	private String especialidad;

	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	public double pagarSueldo(double horas){
		return horas*super.getSueldo();
	}
	
}
