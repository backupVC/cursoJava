import java.io.*;
public class Ejercicio2Leer
{
//permitimos las excepciones IO
  public static void main (String[]args) throws IOException
  {
//creamos el descriptor
	File entrada = new File("ejercicio2.dat");
//comprobamos que existe el fichero.
    if (!entrada.exists ())
	
      {
	System.out.println ("El fichero no existe");
	System.exit (0);
      }
    else
      {
//creamos el objeto fileinputstream para leer los datos del
//fichero binario
	FileInputStream input = new FileInputStream (entrada);
	int value;
	int suma=0;
//leemos hasta que se acaba el flujo de entrada
	while ((value = input.read ()) != -1)
		suma+=value;
	  input.close ();
	  System.out.println (suma);
      }
  }
}
