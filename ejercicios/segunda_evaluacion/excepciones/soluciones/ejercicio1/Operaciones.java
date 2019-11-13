public class Operaciones
{
  private int operando1;
  private int operando2;
  private String operacion;
  private int resultadoOperacion;
  public Operaciones (int operando1, int operando2, String operacion)
  {
    this.operando1 = operando1;
    this.operando2 = operando2;
    this.operacion = operacion;
  }
  private void resultado ()
  {

    if (this.operacion.equals ("-"))
      {
	this.resultadoOperacion = this.operando1 - this.operando2;
      }
    else if (this.operacion.equals ("/"))
      {
	this.resultadoOperacion = this.operando1 / this.operando2;
      }
    if (this.operacion.equals ("+"))
      {
	this.resultadoOperacion = this.operando1 + this.operando2;
      }
    else if (this.operacion.equals ("x"))
      {
	this.resultadoOperacion = this.operando1 * this.operando2;
      }
  }
  public int getOperacion ()
  {
    this.resultado ();
    return this.resultadoOperacion;
  }
}
