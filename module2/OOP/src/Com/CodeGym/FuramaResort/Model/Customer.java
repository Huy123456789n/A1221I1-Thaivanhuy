package Com.CodeGym.FuramaResort.Model;

public class Customer extends Person{
    private String CustomerCode;
    private String CustomerType;

    public Customer(String name, int CMND, String sex, String dateOfBirth, int phoneNumber, String email, String customerCode, String customerType) {
        super(name, CMND, sex, dateOfBirth, phoneNumber, email);
        CustomerCode = customerCode;
        CustomerType = customerType;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public Customer(String name, int CMND, String sex, String dateOfBirth, int phoneNumber, String email) {
        super(name, CMND, sex, dateOfBirth, phoneNumber, email);
    }
}
