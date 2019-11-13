public class PalabraObjetos
{
private String palabra;
public PalabraObjetos(String palabra){
this.palabra=palabra;
}
  public boolean igualPrincipioFinal ()
  {
    String nueva = palabra.toUpperCase ();
      return nueva.startsWith (nueva.substring (nueva.length () - 1));
  }
  public boolean contienePrimera ()
  {
    String nueva1 = palabra.toUpperCase ();
    String nueva2 = nueva1.substring (1, nueva1.length () - 1);
    return nueva2.contains (nueva1.substring (0, 1));
  }
	public String toString(){
		return palabra;
	}
}
