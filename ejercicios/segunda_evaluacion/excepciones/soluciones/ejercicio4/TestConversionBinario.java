import java.util.Scanner;
import java.util.NoSuchElementException;
public class TestConversionBinario
{
  public static void main (String[]args) throws IlegalFormatoExcepcion
  {

    System.out.println ("Introduce un número en binario");
    Scanner in = new Scanner (System.in);
      try
    {
      String binario = in.next ();
      ConversionBinario b = new ConversionBinario (binario);
        System.out.println ("Su valor en decimal es: " + b.getConversion ());
    }
    catch (NoSuchElementException e)
    {
      System.out.println ("No hay nada que leer");
    }
    catch (IlegalFormatoExcepcion e)
    {
      System.out.println ("No es un número binario válido");
    }
    finally
    {
      in.close ();
    }
  }
}
