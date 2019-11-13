package ejercicio1_herencia;

public class Programador extends InformaticoAbs {
	private String lenguaje;

	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
	}
	public double pagarSueldo(double horas){
		return horas*super.getSueldo();
	}
	
}
