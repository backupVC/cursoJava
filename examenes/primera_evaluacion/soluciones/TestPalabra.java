public class TestPalabra
{
  public static void main (String[]arg)
  {
    String palabra1 = "manolo";
    String palabra2 = "Ovalo";
    /*      String nueva1 = palabra1.substring(1,palabra1.length()-1);
       System.out.println(palabra1+" "+nueva1);
       System.out.println(palabra1+" "+palabra1.substring(0,1));
       //           System.out.println(nueva1.contains());

       // return nueva2.contains(nueva2.substring(0,1)); */
    if (Palabra.igualPrincipioFinal (palabra1))
      {
	System.out.println ("La palabra " + palabra1 +
			    " empieza y acaba con la misma letra");
      }
    else
      {
	System.out.println ("La palabra " + palabra1 +
			    " NO empieza y acaba con la misma letra");
      }
    if (Palabra.igualPrincipioFinal (palabra2))
      {
	System.out.println ("La palabra " + palabra2 +
			    " empieza y acaba con la misma letra");
      }
    else
      {
	System.out.println ("La palabra " + palabra2 +
			    " NO empieza y acaba con la misma letra");
      }
    if (Palabra.contienePrimera (palabra1))
      {
	System.out.println ("La palabra " + palabra1 +
			    " contiene la primera letra antes del final");
      }
    else
      {
	System.out.println ("La palabra " + palabra1 +
			    " NO contiene la primera letra antes del final");
      }
    if (Palabra.contienePrimera (palabra2))
      {
	System.out.println ("La palabra " + palabra2 +
			    " contiene la primera letra antes del final");
      }
    else
      {
	System.out.println ("La palabra " + palabra2 +
			    " NO contiene la primera letra antes del final");
      }
  }
}
