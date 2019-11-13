import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Colecciones2 {
	
	public Map<String, Integer> getFrecuenciaPalabras() {
		return frecuenciaPalabras;
	}
	List<String> palabrasTotales;
	Set<String> palabrasDiferentes;
	Map<String, Integer> frecuenciaPalabras;
	public Colecciones2() {
		this.palabrasTotales = new ArrayList<String>();
		this.palabrasDiferentes = new HashSet<String>();
		this.frecuenciaPalabras = new HashMap<String, Integer>();
	}
	public List<String> getPalabrasTotales() {
		return palabrasTotales;
	}
	public Set<String> getPalabrasDiferentes() {
		return palabrasDiferentes;
	}
	
	public void addPalabras(String s){
	//	System.out.println(s);
		palabrasTotales.add(s);
		palabrasDiferentes.add(s);
	}
	public void rellenarFrecuencia(){
		for (String s: this.palabrasDiferentes){
//			System.out.println(s+"-"+Collections.frequency(palabrasTotales, s));
			this.frecuenciaPalabras.put(s, Collections.frequency(palabrasTotales, s));
		}
	}
}
