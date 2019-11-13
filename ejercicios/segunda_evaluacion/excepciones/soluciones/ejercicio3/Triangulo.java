class IlegalTrianguloExcepcion extends Exception
{
}

public class Triangulo
{

  private double ladoUno;
  private double ladoDos;
  private double ladoTres;

  public Triangulo (double lado1, double lado2,
		    double lado3) throws IlegalTrianguloExcepcion
  {

    if (trianguloNoValido (lado1, lado2, lado3))
      {
	throw new IlegalTrianguloExcepcion ();
      }
    else
      {
	this.ladoTres = lado1;
	this.ladoTres = lado2;
	this.ladoTres = lado3;
	System.out.println ("Construido triangulo válido");
      }
  }

  private static boolean trianguloNoValido (double lado1, double lado2,
					    double lado3)
  {
    return (lado1 + lado2 < lado3 || lado1 + lado3 < lado2
	    || lado2 + lado3 < lado1);
  }
}
