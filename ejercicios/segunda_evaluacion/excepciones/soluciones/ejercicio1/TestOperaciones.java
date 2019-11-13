import java.util.Scanner;
import java.util.InputMismatchException;
public class TestOperaciones
{
  public static void main (String[]arg)
  {
    System.out.println ("Introduce los datos");
    Scanner in = new Scanner (System.in);
      try
    {
      int primerOperando = in.nextInt ();
      String operacion = in.next ();
      if (!operacion.matches ("[\\-|+|x|/]"))
	throw new RuntimeException ("operacion no permitida");
      int segundoOperando = in.nextInt ();
      Operaciones op =
	new Operaciones (primerOperando, segundoOperando, operacion);
        System.out.println ("El resultado es: " + op.getOperacion ());

    } catch (InputMismatchException e)
    {
      System.err.println ("No has introducido números enteros");
    } catch (RuntimeException e)
    {
      System.err.println (e.getMessage ());
      System.err.println ("Sólo se permite las operaciones - + x /");
    }
    finally
    {
      in.close ();
    }

  }
}
