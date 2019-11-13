import java.util.Scanner;
import java.util.NoSuchElementException;
public class TestConversionHexadecimal
{
  public static void main (String[]args) throws IlegalFormatoExcepcion
  {

    System.out.println ("Introduce un número en hexadecimal");
    Scanner in = new Scanner (System.in);
      try
    {
      String hexadecimal = in.next ();
      ConversionHexadecimal c1 = new ConversionHexadecimal (hexadecimal);
        System.out.println ("Su valor en decimal es: " + c1.getConversion ());
    }
    catch (NoSuchElementException e)
    {
      System.out.println ("No hay nada que leer");
    }
    catch (IlegalFormatoExcepcion e)
    {
      System.out.println ("No es un número hexadecimal válido");
    }
    finally
    {
      in.close ();
    }
  }
}
