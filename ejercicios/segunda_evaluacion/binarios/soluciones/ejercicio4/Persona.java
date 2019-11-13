import java.io.Serializable;
//implementa la interfaz serializable
//para poder serializar objetos de tipo Persona
public class Persona implements Serializable
{
//atributos
  private String nombre;
  private String apellidos;
  private int edad;
  private String direccion;
//constructor
  public Persona (String nombre, String apellidos, int edad, String direccion)
  {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
    this.direccion = direccion;
  }
//getters and setters
  public String getNombre ()
  {
    return this.nombre;
  }
  public String getApellidos ()
  {
    return this.apellidos;
  }
  public int getEdad ()
  {
    return this.edad;
  }
  public String getDireccion ()
  {
    return this.direccion;
  }

  public void setNombre (String nombre)
  {
    this.nombre = nombre;
  }
  public void setApellidos (String apellidos)
  {
    this.apellidos = apellidos;
  }
  public void setEdad (int edad)
  {
    this.edad = edad;
  }
  public void setDireccion (String direccion)
  {
    this.direccion = direccion;
  }
}
