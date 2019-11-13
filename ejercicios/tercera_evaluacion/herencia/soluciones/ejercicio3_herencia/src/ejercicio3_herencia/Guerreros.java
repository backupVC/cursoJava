package ejercicio3_herencia;

public class Guerreros extends Personajes {
	private String arma;

	public Guerreros(String nombre, int nivelEnergia, String arma) {
		super(nombre, nivelEnergia);
		this.arma = arma;
	}
	public String combatir(int energia){
		this.alimentarse(-energia);
		return this.arma+"-"+this.getNivelEnergia();
	}
}
