import java.util.Scanner;
public class TestNumero
{

  public static void main (String[]arg)
  {
    //leemos los datos desde la entrada estándar
    Scanner in = new Scanner (System.in);
      System.
      out.println ("Introduce números para procesar o cadenas para salir");
    while (in.hasNextInt ())
      //nos aseguramos que son enteros
      //si es una cadena el programa acaba
      {
	int num1 = in.nextInt ();	//leemos la entrada como entero
	String numero = Integer.toString (num1);	//convertimos el entero en String
	//Es mejor trabajar como String que como entero.
	//pues hay que saber si tiene una, dos o tres cifras.
	//Si hace falta pasarlo a entero usa métodos de la clase Integer

	//pon tu código aquí
	//si tienes que llamar a métodos estáticos usa:
	//Numero.metodo_a_llamar
      }
  }
}
