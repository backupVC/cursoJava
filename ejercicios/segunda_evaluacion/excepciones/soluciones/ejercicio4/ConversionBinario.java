
public class ConversionBinario
{
  private String numeroBinario;
  public ConversionBinario (String numeroBin) throws IlegalFormatoExcepcion
  {
    if (esNumeroBinario (numeroBin))
      {
	this.numeroBinario = numeroBin;
      }
    else
      {
	throw new IlegalFormatoExcepcion ();
      }
  }
  private boolean esNumeroBinario (String numeroBin)
  {
    return numeroBin.matches ("[01]+");
  }
  public int getConversion ()
  {
    int valor = 0;
    int contador = 0;
    char[] arrayCaracteres = numeroBinario.toCharArray ();
    for (int i = numeroBinario.length () - 1; i >= 0; i--)
      {
	valor += (arrayCaracteres[i] - 48) * Math.pow (2, contador);
	contador++;
      }
    return valor;
  }
}
