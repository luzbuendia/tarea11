package agregacion.tarea11;

public class Main
{
     public static void main(String[] args) 
    {
    
      Persona persona =new Persona("Pablo", "buendia");
      System.out.println(persona.getNombre());
      System.out.println(persona.getApellido());
      persona.setAuto(new Auto("Toyota", "Negro"));
      System.out.println(persona.getAuto().getModelo());
      System.out.println(persona.getAuto().getColor());
      persona.setMoto(new Moto("MJ23", "Rojo"));
      System.out.println(persona.getMoto().getPlaca());
      System.out.println(persona.getMoto().getColor());
      

    }  
        
    
}
