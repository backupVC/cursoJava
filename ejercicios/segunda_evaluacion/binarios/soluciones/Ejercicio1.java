import java.io.*;
public class Ejercicio1
{

  public static void main (String[]arg)
  {
// Abrimos el descriptor
    File input = new File ("ejercicio1.txt");
//Comprobamos que no existe el fichero
    if (input.exists ())
      {
	System.out.println ("El fichero existe");
	System.exit (0);
      }
    else
      {
	try
	{
//Creamos el objeto printwriter para escribir
	  PrintWriter ou = new PrintWriter (input);
	  int valor;
	  for (int i = 0; i < 100; i++)
	    {
//Obtenemos un valor entero entre 0 y 100
	      valor = (int) Math.floor (Math.random () * 100 + 1);
//Escribimos el valor en el printwriter
	      ou.println (valor);
	    }
//cerramos el printwriter
	  ou.close ();
	}
	catch (FileNotFoundException e)
	{
	  System.out.println ("No puedo crear el fichero");
	  System.exit (0);
	}
      }
  }
}
