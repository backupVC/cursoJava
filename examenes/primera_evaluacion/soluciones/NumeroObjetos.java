public class NumeroObjetos
{
  private String numero;
  public NumeroObjetos (String numero)
  {
    this.numero = numero;
  }

  public boolean esCapicua ()
  {
    return numero.startsWith (numero.substring (numero.length () - 1));
  }
  public boolean esPar ()
  {
    int num = Integer.parseInt (numero);
    return num % 2 == 0;
  }
  public boolean esDivisiblePorTres ()
  {
    int num = Integer.parseInt (numero);
    return num % 3 == 0;
  }
}
