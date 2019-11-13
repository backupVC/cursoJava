package ejercicio3_herencia;

public abstract class Personajes {
	private String nombre;
	private int nivelEnergia;
	public Personajes(String nombre, int nivelEnergia) {
		super();
		this.nombre = nombre;
		this.nivelEnergia = nivelEnergia;
	}
	protected void alimentarse(int energia){
		if (this.nivelEnergia + energia < 0){
			this.nivelEnergia =0;
		}
		else{
			this.nivelEnergia+=energia;
		}
	}
	protected String getNombre() {
		return nombre;
	}
	protected int getNivelEnergia() {
		return nivelEnergia;
	}
	
	
}
