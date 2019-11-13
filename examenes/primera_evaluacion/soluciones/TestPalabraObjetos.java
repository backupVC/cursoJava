public class TestPalabraObjetos
{
  public static void main (String[]arg)
  {
    PalabraObjetos palabra1 = new PalabraObjetos("manolo");
    PalabraObjetos palabra2 = new PalabraObjetos("Ovalo");
    if (palabra1.igualPrincipioFinal ())
      {
	System.out.println ("La palabra " + palabra1.toString() +
			    " empieza y acaba con la misma letra");
      }
    else
      {
	System.out.println ("La palabra " + palabra1.toString() +
			    " NO empieza y acaba con la misma letra");
      }
    if (palabra2.igualPrincipioFinal ())
      {
	System.out.println ("La palabra " + palabra2.toString() +
			    " empieza y acaba con la misma letra");
      }
    else
      {
	System.out.println ("La palabra " + palabra2.toString() +
			    " NO empieza y acaba con la misma letra");
      }
    if (palabra1.contienePrimera ())
      {
	System.out.println ("La palabra " + palabra1.toString() +
			    " contiene la primera letra antes del final");
      }
    else
      {
	System.out.println ("La palabra " + palabra1.toString() +
			    " NO contiene la primera letra antes del final");
      }
    if (palabra2.contienePrimera ())
      {
	System.out.println ("La palabra " + palabra2.toString() +
			    " contiene la primera letra antes del final");
      }
    else
      {
	System.out.println ("La palabra " + palabra2.toString() +
			    " NO contiene la primera letra antes del final");
      }
  }
}
