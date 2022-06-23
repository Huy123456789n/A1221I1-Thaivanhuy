package codyGym.model;

public class Customer {
    private int id;
    private String name;
    private String email;
    private int sdt;
    private String dateOfBirth;
    private int cmnd;
    private int gender;
    private String address;
    private int typeCode;
    public Customer( String name, String email, int sdt, String dateOfBirth, int cmnd, int gender, String address, int typeCode) {
        this.name = name;
        this.email = email;
        this.sdt = sdt;
        this.dateOfBirth = dateOfBirth;
        this.cmnd = cmnd;
        this.gender = gender;
        this.address = address;
        this.typeCode = typeCode;
    }

    public Customer(int id, String name, String email, int sdt, String dateOfBirth, int cmnd, int gender, String address, int typeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.sdt = sdt;
        this.dateOfBirth = dateOfBirth;
        this.cmnd = cmnd;
        this.gender = gender;
        this.address = address;
        this.typeCode = typeCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }
}
