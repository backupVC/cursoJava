package ejercicio3_herencia;

public class TestVideojuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personajes g1 = new Guerreros("Tor", 400, "Espada");
		Personajes g2 = new Guerreros("Hércules", 200, "Puños");
		Personajes m1 = new Magos("Merlin", "magia negra");
		System.out.println(g1.getNombre()+" "+((Guerreros) g1).combatir(200));
		System.out.println(g2.getNombre()+" "+((Guerreros) g2).combatir(1200));
		System.out.println(m1.getNombre()+" "+((Magos) m1).encantar());


	}

}
