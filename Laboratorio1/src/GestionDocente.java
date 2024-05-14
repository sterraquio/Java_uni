
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class GestionDocente {
    //Atributos 
    private List<Docente> listaGestionDocente = new ArrayList<>();
    
    //costructor 
    public GestionDocente(){
        Docente profe1, profe2, profe3, profe4, profe5;
        profe1 = new Docente();
        profe2 = new Docente();
        profe3 = new Docente();
        profe4 = new Docente();
        profe5 = new Docente();


        profe1.setNombreApellido("Carlos");
        profe1.setCedula(12345);
        profe1.setCurso("Matematicas");

        profe2.setNombreApellido("Shaik Zuñiga");
        profe2.setCedula(6789);
        profe2.setCurso("Matematicas discretas 1");

        profe3.setNombreApellido("Juanito alimaña");
        profe3.setCedula(101112);
        profe3.setCurso("Calculo");

        profe4.setNombreApellido("Camilo perez");
        profe4.setCedula(131415);
        profe4.setCurso("POO");

        profe5.setNombreApellido("Johan Alvedo");
        profe5.setCedula(161718);
        profe5.setCurso("Lectura critica");

        listaGestionDocente.add(profe1);
        listaGestionDocente.add(profe2);
        listaGestionDocente.add(profe3);
        listaGestionDocente.add(profe4);
        listaGestionDocente.add(profe5);
    }
  
    public String listarDocente() {
        Docente docentes = new Docente();
        String coleccionDocentes = "";

// for para recorrer la lista 
        for (int i = 0; i < listaGestionDocente.size(); i++) {
            docentes = listaGestionDocente.get(i);
            coleccionDocentes += "Nombre del docente: " + docentes.getNombreApellido()
                    + "Cedula del docente: " + docentes.getCedula()
                    + " Curso del docente: " +  docentes.getCurso()+ "\n\n";
        }
        return coleccionDocentes;
    }

    public void mostrarListarDocente(){
        String mensaje = "Datos de los docentes: \n\n";
        mensaje += listarDocente();
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public String buscarDocente(int ced){
        Docente unProfe = new Docente();
        String datosProfe="El profesor no se encuentra";

        for (int i = 0; i < listaGestionDocente.size(); i++) {
            unProfe = listaGestionDocente.get(i);
            if (unProfe.getCedula() == ced) {
                datosProfe = "Nombre y apellido del profesor: " + unProfe.getNombreApellido()+"\n"+
                "Cedula: "+unProfe.getCedula()+"\n"+
                "Curso: "+unProfe.getCurso();
                return datosProfe;
                
            }
        }
        return datosProfe;

    }

    public void mostrarBuscarDocente(){
        String mensaje2 = "Los datos del docente son: ";
        int ced = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del docente: "));
        mensaje2 += buscarDocente(ced);
        JOptionPane.showMessageDialog(null, mensaje2);
    }



}