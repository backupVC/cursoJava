import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TestListas {

	public static void main(String[] args) {
		Listas l = new Listas(); //Creamos objeto listas
		
		//Creamos dos objetos File como descriptores de los ficheros
		File ficheroHombres = new File("nombres_hombre.txt");
		File ficheroMujeres = new File("nombres_mujer.txt");
		//Creamos los scanner para leer los ficheros de texto.
		try {
			Scanner inHombres = new Scanner(ficheroHombres);
			while (inHombres.hasNext()){
				l.addHombre(inHombres.next());
			}
			inHombres.close();
		} catch (FileNotFoundException e) {
			System.out.println("No encontrado fichero: "+ficheroHombres.getName());
			e.printStackTrace();
		}
		try {
			Scanner inMujeres = new Scanner(ficheroMujeres);
			while (inMujeres.hasNext()){
				l.addMujer(inMujeres.next());
			}
			inMujeres.close();
		} catch (FileNotFoundException e) {
			System.out.println("No encontrado fichero: "+ficheroMujeres.getName());
			e.printStackTrace();
		}
		//Creamos la lista con nombre totales
		l.crearNombres();
		System.out.println("Número total de nombres: "+l.numeroTotalNombres());
		System.out.println("Número total de mujeres: "+l.numeroTotalMujeres());
		System.out.println("Número total de hombres: "+l.numeroTotalHombres());

		//Comprobamos si existe distintos nombres:
		System.out.println("Existe el nombre de juan:"+l.esNombre("juan"));
		System.out.println("Existe el nombre de juan:"+l.esNombre("jun"));
		System.out.println("Existe el nombre de alicia:"+l.esNombre("alicia"));
		System.out.println("Es hombre juan:"+l.esHombre("juan"));
		System.out.println("Es mujer juan:"+l.esMujer("juan"));
		System.out.println("Es hombre alicia:"+l.esHombre("alicia"));
		System.out.println("Es mujer alicia:"+l.esMujer("alicia"));


	}

}
