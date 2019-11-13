import java.util.ArrayList;
import java.util.List;


public class Listas {
	List<String> hombres;
	List<String> mujeres;
	List<String> nombres;
	public Listas() {
		this.hombres = new ArrayList<String>();
		this.mujeres = new ArrayList<String>();
		this.nombres = new ArrayList<String>();
	}
	public void addHombre(String s){
		this.hombres.add(s);
	}
	public void addMujer(String s){
		this.mujeres.add(s);
	}
	public void crearNombres(){
		this.nombres.addAll(hombres);
		this.nombres.addAll(mujeres);
	}
	public boolean esNombre(String s){
		return this.nombres.contains(s);
	}
	public boolean esHombre(String s){
		return this.hombres.contains(s);
	}
	public boolean esMujer(String s){
		return this.mujeres.contains(s);
	}
	public int numeroTotalNombres(){
		return this.nombres.size();
	}
	public int numeroTotalHombres(){
		return this.hombres.size();
	}
	public int numeroTotalMujeres(){
		return this.mujeres.size();
	}
	
}
