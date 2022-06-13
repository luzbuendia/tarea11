package agregacion.tarea11;

public class Auto
{
    private String modelo;
    private String color;

    public Auto(String modelo,String color)
    {
      this.modelo=modelo;
      this.color=color;
    }
    public void setModelo(String modelo)
    {
      this.modelo=modelo;
    }
    public String getModelo()
    {
      return this.modelo;  
    }
    public void setColor(String color )
    {
        this.color=color;

    }
    public String getColor()
    {
      return this.color;  
    }
}
