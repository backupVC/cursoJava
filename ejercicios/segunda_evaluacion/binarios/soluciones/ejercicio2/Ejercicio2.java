import java.io.*;
public class Ejercicio2
{
//permitimos las excepciones de tipo IO
  public static void main (String[]args) throws IOException
  {
//creamos el descriptor 
	File salida = new File("ejercicio2.dat");
//comprobamos que no existe el fichero
    if (salida.exists ())
	
      {
	System.out.println ("El fichero existe");
	System.exit (0);
      }
    else
      {
//creamos un fileoutputstream para crear el fichero binario
    FileOutputStream output = new FileOutputStream ("ejercicio2.dat");
	int valor;
	for (int i = 1; i <= 100; i++){
	valor = (int) Math.floor (Math.random () * 100 + 1);
              output.write (valor);
	}

	output.close ();
      }
  }
}
