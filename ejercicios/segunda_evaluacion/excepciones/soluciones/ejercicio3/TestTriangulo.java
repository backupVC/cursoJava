import java.util.Scanner;
import java.util.InputMismatchException;
public class TestTriangulo
{
  public static void main (String[]arg)
  {
    System.out.println ("Introduce los tres lados");

    Scanner in = new Scanner (System.in);
      try
    {
      double lado1 = in.nextDouble ();
      double lado2 = in.nextDouble ();
      double lado3 = in.nextDouble ();
      Triangulo t = new Triangulo (lado1, lado2, lado3);
    } catch (InputMismatchException e)
    {
      System.out.println ("No es un valor válido");
    } catch (IlegalTrianguloExcepcion e)
    {
      System.out.println ("No es un TRIÁNGULO válido");
    }

  }
}
