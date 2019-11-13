import java.util.Scanner;
import java.util.InputMismatchException;
public class ArrayWhile
{

  public static void main (String[]arg)
  {
    int posicion = -1;
    int[] valores = new int[100];
      valores = rellenarValores ();
    while (true || posicion > 99 || posicion < 0)
      {
	System.out.println ("Intruduce un número:");
	try
	{
	  Scanner in = new Scanner (System.in);
	    posicion = in.nextInt ();
	    System.out.println ("El valor de esa posición es: " +
				valores[posicion]);
	    in.close ();
	    break;
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	  System.out.println ("Dicha posición no existe");

	}
	catch (InputMismatchException e)
	{
	  System.out.println ("No es un número entero");
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
}
