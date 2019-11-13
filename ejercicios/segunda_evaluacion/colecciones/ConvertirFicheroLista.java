/**Clase que convierto un fichero de valores
double en un array de doubles
* @author Manuel Molino
* @version 1.0
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ConvertirFicheroLista{
	private ArrayList<Double> lista;
	
	ConvertirFicheroLista(){
		lista=new ArrayList<Double>();
	}

	/**Métodor que convierte el fichero
	*en un array
	*@param Scanner
	*/
	public void convertiraLista(Scanner in){
		while (in.hasNextDouble()){
			double valor=in.nextDouble();
			lista.add(valor);
		}
	}

	/**Método que devuelve el array de
	* valores que tiene el fichero
	* @return double[]
	*/
	public ArrayList<Double> getLista(){
		return lista;
	}


	public static void main(String[] arg) throws FileNotFoundException{
		String filename = "./input.txt"; 
		File newFile = new File(filename);
		Scanner scan = new Scanner(newFile);
		ConvertirFicheroLista c = new ConvertirFicheroLista();
		c.convertiraLista(scan);
		ArrayList<Double> l = new ArrayList<Double>();
		l = c.getLista();
		for (double d: l){
			System.out.println(d);
		}
	} 
}
		
				
		
