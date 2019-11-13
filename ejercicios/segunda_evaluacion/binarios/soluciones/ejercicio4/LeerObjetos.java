import java.util.List;
import java.util.ArrayList;
import java.io.*;
//permitimos excepciones
public class LeerObjetos
{
  public static void main (String[]arg) throws Exception
  {
//creamos una lista para recepcionar el objeto
//que se encuentra serializado
//y es una lista de objetos personas
    List < Persona > lista = new ArrayList < Persona > ();
//abrimos el flujo de entrada
    ObjectInputStream input =
      new ObjectInputStream (new FileInputStream ("ejercicio4.dat"));
//hacemos casting de una lista parametrizada
//ya que al recuperar objetos, no sabe que
//tipo de objetos se han guardado
//en este caso un objeto de tipo List<Persona>
      lista = (List < Persona >) (input.readObject ());
    int i = 0;
//usamos un bucle mejorado para leer el array
    for (Persona p:lista)
      {
	System.out.println ("Objeto persona número: " + (++i));
	System.out.println (p.getNombre () + " " + p.getApellidos () +
			    " edad: " + p.getEdad () + ", dirección: " +
			    p.getDireccion ());
      }


  }
}
