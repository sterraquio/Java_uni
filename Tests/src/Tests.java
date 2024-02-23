import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        //javax.swing.JOptionPane.showMessageDialog(null, "This is the message", "My first message", 0);
        String año = javax.swing.JOptionPane.showInputDialog("Insert the number of the year");
        String serie = javax.swing.JOptionPane.showInputDialog("Insert the number of serie");
        List<String>marcaAutos= new ArrayList<>();

        marcaAutos.add("Renault");
        marcaAutos.add("Mazda");
        marcaAutos.add("Porshe");
        marcaAutos.add("Ferrari");

        marcaAutos.add("Año: "+año +"Serie:"+ serie);
        System.out.println(marcaAutos.get(4));
        //javax.swing.JOptionPane.showMessageDialog(null, marcaAutos[0]);
    }
}

