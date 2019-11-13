
public class ConversionHexadecimal
{
  private String numeroHexadecimal;
  public ConversionHexadecimal (String numeroHexad) throws
    IlegalFormatoExcepcion
  {
    if (esNumeroHexadecimal (numeroHexad))
      {
	this.numeroHexadecimal = numeroHexad;
      }
    else
      {
	throw new IlegalFormatoExcepcion ();
      }
  }
  private boolean esNumeroHexadecimal (String numeroHex)
  {
    return numeroHex.matches ("[0-9aAbBcCdDeEfF]+");
  }
  public int getConversion ()
  {
    int valor = 0;
    int contador = 0;
    char[] arrayCaracteres = numeroHexadecimal.toCharArray ();
    for (int i = numeroHexadecimal.length () - 1; i >= 0; i--)
      {
	if (arrayCaracteres[i] == 'a' || arrayCaracteres[i] == 'A')
	  {
	    valor += 10 * Math.pow (16, contador);
	  }
	else if (arrayCaracteres[i] == 'b' || arrayCaracteres[i] == 'B')
	  {
	    valor += 11 * Math.pow (16, contador);
	  }
	else if (arrayCaracteres[i] == 'c' || arrayCaracteres[i] == 'C')
	  {
	    valor += 12 * Math.pow (16, contador);
	  }
	else if (arrayCaracteres[i] == 'd' || arrayCaracteres[i] == 'D')
	  {
	    valor += 13 * Math.pow (16, contador);
	  }
	else if (arrayCaracteres[i] == 'e' || arrayCaracteres[i] == 'E')
	  {
	    valor += 14 * Math.pow (16, contador);
	  }
	else if (arrayCaracteres[i] == 'f' || arrayCaracteres[i] == 'F')
	  {
	    valor += 15 * Math.pow (16, contador);
	  }
	else
	  {
	    valor += (arrayCaracteres[i] - 48) * Math.pow (16, contador);
	  }
	contador++;
      }
    return valor;
  }
}
