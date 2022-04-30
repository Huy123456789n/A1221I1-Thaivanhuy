package Com.CodeGym.FuramaResort.Model;

public abstract class Person {
    private String name;
    private int CMND;
    private String Gender;
    private String dateOfBirth;
    private int PhoneNumber;
    private String Email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Person(String name, int CMND, String Gender, String dateOfBirth, int phoneNumber, String email) {
        this.name = name;
        this.CMND = CMND;
        this.Gender = Gender;
        this.dateOfBirth = dateOfBirth;
        PhoneNumber = phoneNumber;
        Email = email;
    }
}
