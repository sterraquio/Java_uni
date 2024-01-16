package models;
public class Patient extends User{
    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String typeBlood;

    //Método constructor
    public Patient(String name, String email){
        super(name, email);
    }


    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return this.weight + "Kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getHeight() {
        return height + "Mts. ";
    }



    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTypeBlood() {
        return typeBlood;
    }

    public void setTypeBlood(String typeBlood) {
        if (typeBlood == "o+" || typeBlood == "o-"|| typeBlood == "a+"|| typeBlood == "a-"|| typeBlood == "b+"|| typeBlood == "b-"|| typeBlood == "ab+"|| typeBlood == "ab-" ) {
            this.typeBlood = typeBlood;
        }else{
            System.out.println("There's a mistake, please write the type of your blood in lowercase please.");
        }
        
    }

    @Override
    public String toString() {
        return super.toString()+ "\nAge: " + birthday + "\nweight: " + getWeight() + "\nHeight: " + getHeight() + "\nBlood: " +typeBlood;
    }
    
}
