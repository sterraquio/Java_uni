package models;
public abstract class User {
    private String name;
    private String email;
    private String adress;
    private String phoneNumber;
    public User(String name2, String email2) {
        
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
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
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


    @Override
    public String toString() {
        return "User: " + name + ", Email: " + email +"\nAddress: " + adress+ ". Phone: " + phoneNumber;
    }

    public abstract void showDataUser();
}