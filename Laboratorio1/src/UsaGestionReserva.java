import javax.swing.JOptionPane;

public class UsaGestionReserva{ 

  // Atributos:

  GestionReserva reservaciones= new GestionReserva();


  // Constructor:
  public UsaGestionReserva(){}

  // Metodos: 

  public void agregarReserva(){

   Reserva miReserva = new Reserva();
   EquipoComputo miEquipo = new EquipoComputo();
   GestionDocente miDocente = new GestionDocente();

   int numCompu;
   int ced;
   String fech;
   String horaReco;
   String horaEntr;


numCompu= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de inventario del equipo", "Ingreso de datos para reserva", 1));
ced= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de cedula", "Ingreso de datos para reserva", 1));
fech= (JOptionPane.showInputDialog(null,"Ingrese la fecha de la reserva", "Ingreso de datos para reserva", 1));
horaReco= (JOptionPane.showInputDialog(null,"Ingrese la hora de recoger el equipo", "Ingreso de datos para reserva", 1));
horaEntr= (JOptionPane.showInputDialog(null,"Ingrese la entregar el equipo", "Ingreso de datos para reserva", 1));


      miEquipo.setNumeroEquipo(numCompu);
      miDocente.buscarDocente(ced);
      miReserva.setFecha(fech);
      miReserva.setHoraRecogida(horaReco);
      miReserva.setHoraEntrega(horaEntr);

 }

 
  
} 