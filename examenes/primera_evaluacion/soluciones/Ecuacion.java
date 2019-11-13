public class Ecuacion
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;

  public Ecuacion (int a, int b, int c, int d, int e, int f)
  {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;
  }
  public boolean esResoluble ()
  {
    return (a * d - b * c) != 0;
  }
  public double x ()
  {
    return (e * d - b * f) / (a * d - b * c);
  }
  public double y ()
  {
    return (a * f - e * c) / (a * d - b * c);
  }
}
