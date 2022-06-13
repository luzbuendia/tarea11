package agregacion.tarea11;

public class Persona 
{
  private String nombre;
  private String apellido;
  private Auto auto;
  private Moto moto;

  public Persona (String nombre,String apellido)
  {
    this.nombre=nombre;
    this.apellido=apellido;
    
  }
  public void setNombre(String nombre)
    {
      this.nombre=nombre;
    }
    public String getNombre()
    {
      return this.nombre;  
    }
    public void setApellido(String apellido )
    {
        this.apellido=apellido;

    }
    public String getApellido()
    {
      return this.apellido;
    }    
    public void setAuto(Auto auto)
    {
        this.auto=auto;
        
    }
    public Auto getAuto()
    {
      return this.auto;
    }    
    public void setMoto(Moto moto)
    {
        this.moto=moto;
        
    }
    public Moto getMoto()
    {
      return this.moto;
    }    


  

  

    
}
