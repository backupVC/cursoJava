public class TestEcuacionSegundoGrado
{
  public static void main (String[]arg)
  {
    EcuacionSegundoGrado e1 = new EcuacionSegundoGrado (1, -5, 6);
    if (e1.tieneSolucionesReales ())
      {
	System.out.println ("x1= " + e1.x1 ());
	System.out.println ("x2= " + e1.x2 ());
      }
    else
      {
	System.out.println ("La ecuación e1 no tiene soluciones reales");
      }
    EcuacionSegundoGrado e2 = new EcuacionSegundoGrado (-2, 7, -10);
    if (e2.tieneSolucionesReales ())
      {
	System.out.println ("x1= " + e2.x1 ());
	System.out.println ("x2= " + e2.x2 ());
      }
    else
      {
	System.out.println ("La ecuación e2 no tiene soluciones reales");
      }

  }
}
