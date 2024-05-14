public class EquipoComputo {
    // Atributos
    private int numeroEquipo;
    private String marca;
    private int anhoCompra;

    // Constructor
    public EquipoComputo() {
        numeroEquipo = 0; // Valor predeterminado para el número de equipo
        marca = ""; // Valor predeterminado para la marca
        anhoCompra = 0; // Valor predeterminado para el año de compra
    }

    // Métodos set
    public void setNumeroEquipo(int numEquipo) {
        numeroEquipo = numEquipo;
    }

    public void setMarca(String mrc) {
        marca = mrc;
    }

    public void setAnhoCompra(int anhoComp) {
        anhoCompra = anhoComp;
    }

    // Métodos get
    public int getNumeroEquipo() {
        return numeroEquipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnhoCompra() {
        return anhoCompra;
    }
}
