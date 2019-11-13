import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestColecciones2 {

	public static void main(String[] args) {
		Colecciones2 c = new Colecciones2();//Creamos objeto colecciones2
		File f = new File("entrada.txt.back"); //Fichero a leer
		//Creamos el patrón de caracteres a eliminar
		Pattern replace = Pattern.compile("[\\(|\\)|\"|\\-|\\.|\\?|¿|,|¡|!|;|_]+"); 
		//Creamos el scanner para leer el fichero de entrada
		try {
			Scanner in =new Scanner(f);
		while (in.hasNext()){
				String leido=in.next();
				Matcher matcher2 = replace.matcher(leido);
				matcher2.replaceAll("").toLowerCase();
				if (matcher2.replaceAll("").toLowerCase().length()!=0)
					c.addPalabras(matcher2.replaceAll("").toLowerCase());
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero "+f.getName());
			e.printStackTrace();
		}
		System.out.println("Número de palabras leidas "+c.getPalabrasTotales().size());
		System.out.println("Número de palabras leidas diferentes "+c.getPalabrasDiferentes().size());
		//Rellenamos el map
		c.rellenarFrecuencia();
		//Vamos a comprobar la existencia de palabras y la frecuencia de la misma.
		String palabra="me";
		boolean existe = c.getFrecuenciaPalabras().containsKey(palabra);
		System.out.println("Existe la palabra "+palabra+": "+existe);
		if (existe){
			System.out.println("La frecuencia de la palabra "+palabra+" es: "+c.getFrecuenciaPalabras().get(palabra));
		}
		//Vamos a imprimir los elementos del conjunto ordenado:
		Object[] ordenadas =(Object[])c.getPalabrasDiferentes().toArray();
		Arrays.sort(ordenadas);
		for (Object s: ordenadas){
			System.out.println((String)s);
		}
		
	}
}
