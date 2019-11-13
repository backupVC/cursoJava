import java.util.Scanner;
public class TestNumeroObjetos
{

  public static void main (String[]arg)
  {
    Scanner in = new Scanner (System.in);
      System.
      out.println ("Introduce números para procesar o cadenas para salir");
    while (in.hasNextInt ())
      {
	int num1 = in.nextInt ();
	String numero = Integer.toString (num1);
	NumeroObjetos n = new NumeroObjetos (numero);
	if (numero.length () == 3)
	  {
	    if (n.esCapicua ())
	      {
		System.out.println ("El número " + numero + " es capicua");
	      }
	    else
	      {
		System.out.println ("El número " + numero +
				    " NO es capicua");
	      }
	  }
	else if (numero.length () == 2)
	  {
	    if (n.esPar ())
	      {
		System.out.println ("El número " + numero + " es par");
	      }
	    else
	      {
		System.out.println ("El número " + numero + " NO es par");
	      }
	  }
	else if (numero.length () == 1)
	  {
	    if (n.esDivisiblePorTres () && !numero.equals ("0"))
	      {
		System.out.println ("El número " + numero +
				    " es múltiplo de tres");
	      }


	    else
	      {
		System.out.println ("El número " + numero +
				    " NO es múltiplo de tres");
	      }
	  }
	else
	  {
	    System.out.println ("El número no tiene tres, dos o una cifra");
	  }
      }
  }
}
