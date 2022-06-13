package agregacion.tarea11;

public class Moto
{
    private String placa;
    private String color;

    public Moto(String placa,String color)
    {
      this.placa=placa;
      this.color=color;
    }
    
    

    public void setPlaca(String placa)
    {
      this.placa=placa;
    }
    public String getPlaca()
    {
      return this.placa;  
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
