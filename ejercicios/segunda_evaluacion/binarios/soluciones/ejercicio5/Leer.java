import java.io.*;
import java.util.ArrayList;
public class Leer
{
//permirmos lanzar excepciones de cualquier tipo
  public static void main (String[]arg) throws Exception
  {
//creamos el descriptor de entrda leido de arg[0]
    File entrada = new File (arg[0]);
//creamos el flujo de entrada de tipo fileinputstream
    FileInputStream in = new FileInputStream (entrada);
//obtengo el tamaño del fichero
    int tamano = in.available ();
//divido en funcion de lo que dice arg[1]
    int numeroTrozos = Integer.parseInt (arg[1]);
//número de trozos en que se divide el fichero
    int divide = tamano / numeroTrozos;
//información sobre lo que se va a hacer
      System.out.println ("Tamaño bytes del fichero " + arg[0] + ": " +
			  tamano + " bytes");
      System.out.println ("Se divide en trozos de: " + divide + " bytes");
//creo una lista de ficheros donde se almacenan los trozos
      ArrayList < FileOutputStream > lista =
      new ArrayList < FileOutputStream > ();
    for (int i = 0; i <= numeroTrozos - 1; i++)
      {
//creo el nombre de los ficheros arg[0]_.dat
	String nombreFichero = arg[0] + "_" + i + ".dat";
//creo los flujos de salida
	FileOutputStream out = new FileOutputStream (nombreFichero);
//añado el fichero trozo a la lista
	  lista.add (out);
//creo un array de bytes que son
//los bytes que le corresponde a cada trozo
//divide es el tamaño de los ficheros.
	  byte[] leidos = new byte[divide];
//leo los bytes correspondientes
	int leido = in.read (leidos);
//los escribo a los ficheros de salida
	  lista.get (i).write (leidos);
//cierro los flujos de salida
	  lista.get (i).close ();
      }
//cierro el flujo de entrada
    in.close ();
  }

}
