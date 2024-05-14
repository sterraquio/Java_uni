import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class GestionReserva{ 

  // Atributos: 
List<Reserva>reservas= new ArrayList<>();


  // Constructor:
  public GestionReserva (){}


  // Metodos:

  public void agregarReserva(Reserva reservacion){

    reservas.add(reservacion);
 }

  public String listarReserva(){
  
  Reserva unaReserva= new Reserva();
  String reservasUna= " ";
  
  for(int i=0; i<reservas.size();i++){
    unaReserva = reservas.get(i);
     EquipoComputo equipo = new EquipoComputo();
     Docente ced = new Docente();

    reservasUna += "El numero del equipo es: "+equipo.getNumeroEquipo()+"\n"+ 
    "La cedula del docente es :"+ ced.getCedula() +"\n"+
    "La fecha de la reserva es :"+unaReserva.getFecha()+"\n"+
    "La hora de recoger el equipo es :"+unaReserva.getHoraRecogida()+"\n"+
    "La hora de entrega del equipo es :"+unaReserva.getHoraEntrega()+"\n";
  } 
  return reservasUna;
 }

 public void mostrarListarReserva(){
  String mensaje = "Datos de la reserva \n\n";
  mensaje += listarReserva();
  JOptionPane.showMessageDialog(null, mensaje);
 }
} 