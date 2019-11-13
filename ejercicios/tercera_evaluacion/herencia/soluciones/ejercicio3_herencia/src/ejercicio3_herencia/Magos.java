package ejercicio3_herencia;

public class Magos extends Personajes {
	private String poder;

	public Magos(String nombre,  String poder) {
		super(nombre, 100);
		this.poder = poder;
	}
	public String encantar(){
		this.alimentarse(-2);
		return this.poder;
	}
}
