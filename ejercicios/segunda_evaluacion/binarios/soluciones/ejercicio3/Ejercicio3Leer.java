import java.io.*;
public class Ejercicio3Leer
{
//permitimos las excepciones de tipo IO
  public static void main (String[]args) throws IOException
  {
//comprueba si el fichero existe
	File entrada = new File("ejercicio3.dat");
    if (!entrada.exists ())
	
      {
	System.out.println ("El fichero no existe");
	System.exit (0);
      }
    else
      {
//crea el flujo de entrada con un objeto de 
//tipo datainputsream
	DataInputStream input = new DataInputStream(new FileInputStream (entrada));
	  System.out.println ("Número de bytes que pueden ser leidos:"+input.available());
	  input.close ();
      }
  }
}
