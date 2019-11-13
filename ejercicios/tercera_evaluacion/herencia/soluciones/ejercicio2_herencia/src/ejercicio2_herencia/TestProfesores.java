package ejercicio2_herencia;

import java.util.List;

public class TestProfesores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor p1 = new ProfesorTitular("juan", "valverde", 23, "progrmación", 12);
		Profesor p2 = new ProfesorTitular("luis", "garcía", 33, "base de datos", 2);
		Profesor p3 = new ProfesorTitular("leon", "cañas", 23, "algoritmia", 2);
		Profesor p4 = new ProfesorInterino("felipe", "armenteros", 24, "compiladores", 4);
		Profesor p5 = new ProfesorInterino("margarita", "camino", 44, "programación funcional", 4);
		ListinProfesores listin = new ListinProfesores();
		listin.addProfesor(p1);
		listin.addProfesor(p2);
		listin.addProfesor(p3);
		listin.addProfesor(p4);
		listin.addProfesor(p5);
		List<Profesor> lista = listin.getListin();
		for (Profesor p: lista){
			System.out.println(p.getNombre()+" "+p.getApellidos());
			if (p instanceof ProfesorTitular){
				System.out.println("Antigüedad: "+((ProfesorTitular) p).getAntiguedad());
			}
			if (p instanceof ProfesorInterino ){
				System.out.println("Contratado por "+ ((ProfesorInterino) p).getHorasContratadas());
			}
		}
	}

}
