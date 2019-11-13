public class EcuacionSegundoGrado
{
  private int a;
  private int b;
  private int c;

  public EcuacionSegundoGrado (int a, int b, int c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
  }


  public boolean tieneSolucionesReales ()
  {
    return b * b - 4 * a * c >= 0;
  }

  public double x1 ()
  {
    return (b + Math.sqrt (b * b - 4 * a * c) / 2 * a);
  }

  public double x2 ()
  {
    return (b - Math.sqrt (b * b - 4 * a * c) / 2 * a);
  }
}
