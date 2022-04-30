package Com.CodeGym.FuramaResort.Services;

import Com.CodeGym.FuramaResort.Controllers.FuramaController;
import Com.CodeGym.FuramaResort.Model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public interface EmployeeService extends Service{
    public void SetEmployee(String Code);
    public class EmployeeServiceImpl implements EmployeeService{
        static Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> arrayList = new ArrayList<>();

        public EmployeeServiceImpl(ArrayList employee) {
            this.arrayList = employee;
        }
        public EmployeeServiceImpl() {
        }
        public void addEmployee(Employee employee){
            arrayList.add(employee);
        }
        @Override
        public void DisplayAll() {
            for (int i=0; i< arrayList.size();i++ ) {
                Employee employee = arrayList.get(i);
                System.out.println("Mã Nhân Viên :" + employee.getEmployeeCode() + "\n"
                        +"Tên Nhân Viên :" + employee.getName() + "\n"
                        + "Giới Tính :" + employee.getGender() + "\n"
                        + "Ngày Sinh :" + employee.getDateOfBirth()+ "\n"
                        + "Số CMND :" + employee.getCMND() + "\n"
                        +"Số Điện Thoại :" + employee.getPhoneNumber() + "\n"
                        +"Trình Độ học vấn :" + employee.getAcademicLevel() + "\n"
                        + "Email :" + employee.getEmail() + "\n"
                        + "Vị trí " + employee.getPositionStaff() );
            }
        }
        @Override
        public void SetEmployee(String Code) {
            for (int i=0; i< arrayList.size();i++) {
                Employee employee = arrayList.get(i);
                if (Code.equals(employee.getEmployeeCode())) {
                    System.out.println("Nhập mã nhân viên");
                    String EmployeeCode = scanner.nextLine();
                    System.out.println("Nhập Họ Tên");
                    String name = scanner.nextLine();
                    System.out.println("Nhập Ngày sinh");
                    String DateOfBirth = scanner.nextLine();
                    System.out.println("Giới tính");
                    String Gender = scanner.nextLine();
                    System.out.println("Nhập CMND");
                    int CMND = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập Số Điện thoại");
                    int SDT = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập Email nhân viên");
                    String mail = scanner.nextLine();
                    System.out.println("Trình độ học vấn");
                    String academicLevel = scanner.nextLine();
                    System.out.println("Vị trí nhân viên");
                    String PositionNV = scanner.nextLine();
                    System.out.println("Nhập lương");
                    double salary = Double.parseDouble(scanner.nextLine());
                    employee.setEmployeeCode(EmployeeCode);
                    employee.setName(name);
                    employee.setDateOfBirth(DateOfBirth);
                    employee.setGender(Gender);
                    employee.setCMND(CMND);
                    employee.setPhoneNumber(SDT);
                    employee.setEmail(mail);
                    employee.setAcademicLevel(academicLevel);
                    employee.setPositionStaff(PositionNV);
                    employee.setSalary(salary);
                }
            }

        }
    }
}
