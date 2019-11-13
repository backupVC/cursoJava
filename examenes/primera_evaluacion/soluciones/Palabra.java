public class Palabra
{
  public static boolean igualPrincipioFinal (String palabra)
  {
    String nueva = palabra.toUpperCase ();
      return nueva.startsWith (nueva.substring (nueva.length () - 1));
  }
  public static boolean contienePrimera (String palabra)
  {
    String nueva1 = palabra.toUpperCase ();
    String nueva2 = nueva1.substring (1, nueva1.length () - 1);
    return nueva2.contains (nueva1.substring (0, 1));
  }
}
