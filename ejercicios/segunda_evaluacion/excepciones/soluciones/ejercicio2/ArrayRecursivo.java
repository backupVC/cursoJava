import java.util.Scanner;
import java.util.InputMismatchException;
public class ArrayRecursivo
{
  static int posicion = 0;
  public static void main (String[]arg)
  {
    int posicion;
    int[] valores = new int[100];
      valores = rellenarValores ();
      posicion = solicitarPosicion ();
    while (true)
      {
	try
	{
	  System.out.println ("El valor de esa posición es: " +
			      valores[posicion]);
	  break;
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	  System.out.println ("Dicha posición no existe");
	  posicion = solicitarPosicion ();
	}
      }
  }


  public static int[] rellenarValores ()
  {
    int[] valores = new int[100];
    for (int i = 0; i < 100; i++)
      {
//Obtenemos un valor entero entre 0 y 100
	valores[i] = (int) Math.floor (Math.random () * 100 + 1);
      }
    return valores;
  }
  public static int solicitarPosicion ()
  {
    //   int posicion = 0;
    Scanner in = new Scanner (System.in);
    try
    {
      System.out.println ("Introduce la posición del vector");
      posicion = in.nextInt ();
    } catch (InputMismatchException e)
    {
      System.out.println ("Debes introducir un número entero");
      solicitarPosicion ();
    }
    return posicion;
  }
}
