package Com.CodeGym.FuramaResort.Model;

public class Employee extends Person{
    private String EmployeeCode;
    private String academicLevel;
    private double Salary;
    private String PositionStaff;

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getPositionStaff() {
        return PositionStaff;
    }

    public void setPositionStaff(String positionStaff) {
        PositionStaff = positionStaff;
    }
    public Employee(String name, int CMND, String Gender, String dateOfBirth, int phoneNumber, String email, String employeeCode, String academicLevel, double salary, String positionStaff) {
        super(name, CMND, Gender, dateOfBirth, phoneNumber, email);
        EmployeeCode = employeeCode;
        this.academicLevel = academicLevel;
        Salary = salary;
        PositionStaff = positionStaff;
    }

}
