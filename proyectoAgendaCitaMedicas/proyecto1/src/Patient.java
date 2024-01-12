public class Patient {
    //Atributos
    private String name;
    private String email;
    private String adress;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String typeBlood;

    //Método constructor
    Patient(String name, String email){
        this.name = name;
        this.email = email;

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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("Error, you have to asign a number of 8 digits.");
        }else if (phoneNumber.length() < 1) {
            System.out.println("The number is below of 1, asigment another number.");
        }
         else if (phoneNumber.length() == 8 && phoneNumber.length() >= 1) {
            this.phoneNumber = phoneNumber;
        }
        
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


    public String getAdress() {
        return adress;
    }


    public void setAdress(String adress) {
        this.adress = adress;
    }

    
}
