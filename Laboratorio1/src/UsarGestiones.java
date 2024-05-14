import javax.swing.JOptionPane;

public class UsarGestiones{

	public static void main(String [] args){
		
		UsaGestionReserva v1 = new UsaGestionReserva();
		GestionEquiposComputo v2 = new GestionEquiposComputo();
		GestionDocente v3 = new GestionDocente();
		GestionReserva v4 = new GestionReserva();

		String menu = """
			Bienvenido a tu reservacion de equipos
			1: Reservacion de equipos
			2: Ver total de reservaciones
			3: Datos de equipos de computo 
			4: Datos de docentes
			5: Para buscar docente por su cedula
			6: Para salir del programa
			""";
		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menú de Opciones", 1));

			switch(opcion) {
				case 1: 
					v1.agregarReserva();
					break;
				case 2: 
					v4.mostrarListarReserva();
					break;
				case 3: 
					v2.mostrarEquiposComputo();
					break;
				case 4: 
				v3.mostrarListarDocente();
					break;
				case 5: 
					v3.mostrarBuscarDocente();
					break;
				case 6:
				JOptionPane.showMessageDialog(null, "Gracias!!!!\nPor usar nuestro programa", "Resultado =)", 1);
					break;
				default: 
					JOptionPane.showMessageDialog(null, "Esa opción no es válida", "Resultado", 2);
			}
			
		} while(opcion != 6);		
	}
}
