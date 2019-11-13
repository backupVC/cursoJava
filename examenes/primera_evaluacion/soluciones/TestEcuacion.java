public class TestEcuacion
{
  public static void main (String[]arg)
  {
    Ecuacion e1 = new Ecuacion (1, 1, 2, 2, 1, 2);
    if (e1.esResoluble ())
      {
	System.out.println ("x: " + e1.x ());
	System.out.println ("y: " + e1.y ());
      }
    else
      {
	System.out.println ("La ecuación 1 no es resoluble");
      }
    Ecuacion e2 = new Ecuacion (2, 1, -1, 2, 7, 1);
    if (e2.esResoluble ())
      {
	System.out.println ("x: " + e2.x ());
	System.out.println ("y: " + e2.y ());
      }
    else
      {
	System.out.println ("La ecuación 2 no es resoluble");
      }
  }
}
