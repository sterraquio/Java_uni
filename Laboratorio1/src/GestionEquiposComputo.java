import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionEquiposComputo {
    // Atributos 
    private List<EquipoComputo> listaEquiposComputo;

    // Constructor 
    public GestionEquiposComputo() {

        listaEquiposComputo = new ArrayList<>();
        
        // Quemar datos de equipos de cómputo directamente en el constructor
        EquipoComputo equipo1 = new EquipoComputo();
        equipo1.setNumeroEquipo(1);
        equipo1.setMarca("Azus");
        equipo1.setAnhoCompra(2023);

        EquipoComputo equipo2 = new EquipoComputo();
        equipo2.setNumeroEquipo(2);
        equipo2.setMarca("Lenovo");
        equipo2.setAnhoCompra(2022);

        EquipoComputo equipo3 = new EquipoComputo();
        equipo3.setNumeroEquipo(3);
        equipo3.setMarca("Toshiba");
        equipo3.setAnhoCompra(2022);

        EquipoComputo equipo4 = new EquipoComputo();
        equipo4.setNumeroEquipo(4);
        equipo4.setMarca("Asus");
        equipo4.setAnhoCompra(2022);

        EquipoComputo equipo5 = new EquipoComputo();
        equipo5.setNumeroEquipo(5);
        equipo5.setMarca("Samsung");
        equipo5.setAnhoCompra(2022);
        
        listaEquiposComputo.add(equipo1);
        listaEquiposComputo.add(equipo2);
        listaEquiposComputo.add(equipo3);
        listaEquiposComputo.add(equipo4);
        listaEquiposComputo.add(equipo5);
    }

    public void mostrarEquiposComputo() {
        String mensaje = "Datos de equipos de computo:\n\n";
        mensaje += consultarEquiposComputo();
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private String consultarEquiposComputo() {
        EquipoComputo equipo;
        String equipos = "";

        // for para recorrer la lista 
        for (int i = 0; i < listaEquiposComputo.size(); i++) {
            equipo = listaEquiposComputo.get(i);
            equipos += "Numero de equipo: " + equipo.getNumeroEquipo()
                    + "\nMarca: " + equipo.getMarca()
                    + "\nAño de compra: " + equipo.getAnhoCompra() + "\n\n";
        }
        return equipos;
    }
}

