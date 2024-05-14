public class Docente {
    //Atributos
    private String nombreApellido;
    private int cedula;
    private String curso;
    

    //constructor
    public Docente(){
        nombreApellido ="";
        cedula = 0;
        curso = "";
    }

    //métodos
    
    public String getNombreApellido() {
        return nombreApellido;
    }
    public void setNombreApellido(String nombreApell) {
        nombreApellido = nombreApell;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int ced) {
        cedula = ced;
    }

    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curs) {
        curso = curs;
    }

}
