public class Reserva{ 
  // Atributos:
  private String fecha;
  private String horaRecogida;
  private String horaEntrega;

  // Constructor:
  public Reserva (){}

  // Metodos: set


  public void setFecha(String fech){
      fecha = fech;
  }

  public void setHoraRecogida(String horaR){ 
       horaRecogida= horaR;
 }

  public void setHoraEntrega(String horaE){ 
      horaEntrega= horaE;
 }


   // Metodos: get

  public String getFecha(){ 
       return fecha;
 }

  public String getHoraRecogida(){ 
       return horaRecogida;
 }

  public String getHoraEntrega(){ 
       return horaEntrega;
 }


} 