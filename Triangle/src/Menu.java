public class Menu {



    //methods
    public static void menu(){
        byte control = 0;
        while(control==0){
            
            String stringBase = javax.swing.JOptionPane.showInputDialog("Please Insert the number of the base of a triangle");
            int base = Integer.parseInt(stringBase);
            String stringHeight = javax.swing.JOptionPane.showInputDialog("Please Insert the number of the height of a triangle");
            int height = Integer.parseInt(stringHeight);
            String stringOption = javax.swing.JOptionPane.showInputDialog( "Please, select a option:\n1.Get an area from a triangle.\n2.Get a perimeter from a triangle.\n3. Close program.");
            int option = Integer.parseInt(stringOption);

            while (option <=0 || option > 3) {
                javax.swing.JOptionPane.showMessageDialog(null, "This is the menu, please select a CORRECT number.", "Menu", 1);
                stringOption = javax.swing.JOptionPane.showInputDialog( "Please, select a option:\n1.Get an area from a triangle.\n2.Get a perimeter from a triangle.\n3. Close program.");
                option = Integer.parseInt(stringOption);
            }

            switch (option) {
                case 1:
                    //to get a area from a triangle
                    int area = Triangle.calculateArea(base, height);
                    javax.swing.JOptionPane.showMessageDialog(null, "The area is: "+area);
                    break;
                case 2:
                    //to get a perimeter from a triangle
                    int perimeter = Triangle.calculatePerimeter(base, height);
                    javax.swing.JOptionPane.showMessageDialog(null, "The perimeter is: "+perimeter);
                    break;
                case 3:
                javax.swing.JOptionPane.showMessageDialog(null, "CLOSING PROGRAM");
                control = 2;
                System.exit(0);
                break;
            }
            System.exit(0);
        }
    }
}
