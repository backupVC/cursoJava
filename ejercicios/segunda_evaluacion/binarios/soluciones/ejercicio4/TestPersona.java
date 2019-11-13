import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class TestPersona
{
//permitimos excepciones del tipo IO
  public static void main (String[]arg) throws IOException
  {
//Creamos un arraylist de objetos Persona
    List < Persona > lista = new ArrayList < Persona > ();
//Añadimos cinco objetos
    Persona p1 =
      new Persona ("Juan Domingo", "Espido Arroz", 23, "Avda. Cocheras 7");
    Persona p2 =
      new Persona ("Esrefanía", "Do Santos de Luis", 34, "C/La Luna 12");
    Persona p3 =
      new Persona ("Simón", "Martínez García", 23, "C/ Sal si puedes 122");
    Persona p4 =
      new Persona ("Eugenia", "Barenguer de Montes", 45,
		   "Avda. Barcelona 12");
    Persona p5 =
      new Persona ("Serafín", "Aztapueriz Gámez", 22, "Plaza Sol 5");
      lista.add (p1);
      lista.add (p2);
      lista.add (p3);
      lista.add (p4);
      lista.add (p5);
//Guardamos el objeto lista un objectstream
//que vuelca los datos en un fileoutputstream
//que genera el fichero binario ejercicio4.dat
    ObjectOutputStream output =
      new ObjectOutputStream (new FileOutputStream ("ejercicio4.dat"));
	output.writeObject (lista);
    output.close ();

  }
}
