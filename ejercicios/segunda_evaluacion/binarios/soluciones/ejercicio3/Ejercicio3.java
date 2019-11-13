import java.io.*;
import java.util.Scanner;
public class Ejercicio3
{
//permitimos las excepciones
  public static void main (String[]args) throws IOException
  {
//Creamos los descriptores de los ficheros 
//de entrada y salida. 
	File entrada = new File("ejercicio3.txt");
	File salida = new File("ejercicio3.dat");
    if (!entrada.exists ())
	
      {
	System.out.println ("El fichero no existe");
	System.exit (0);
      }
    else
      {
//Creamos una clase dataoutputstream para escribir los datos
    DataOutputStream output = new DataOutputStream(new FileOutputStream (salida));
//Creamos un objeto de la clase scanner para leer datos.
		Scanner in = new Scanner(entrada);
		String linea;
//leemos línea a línea
		while (in.hasNextLine()){
		linea=in.nextLine();
//escribimos las líneas como un string
		 output.writeChars (linea);
		}
	in.close();
	output.close ();
      }
  }
}
