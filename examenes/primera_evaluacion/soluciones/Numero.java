public class Numero
{
  public static boolean esCapicua (String numero)
  {
    return numero.startsWith (numero.substring (numero.length () - 1));
  }
  public static boolean esPar (String numero)
  {
    int num = Integer.parseInt (numero);
    return num % 2 == 0;
  }
  public static boolean esDivisiblePorTres (String numero)
  {
    int num = Integer.parseInt (numero);
    return num % 3 == 0;
  }
}
