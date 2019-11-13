package ejercicio2_herencia;

import java.util.ArrayList;
import java.util.List;

public class ListinProfesores {
	List<Profesor> profesores;
	public ListinProfesores(){
		profesores = new ArrayList<Profesor>();
	}
	public void addProfesor(Profesor p){
		this.profesores.add(p);
	}
	public List<Profesor> getListin(){
		return this.profesores;
	}
}
