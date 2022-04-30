package Com.CodeGym.FuramaResort.Services;

import Com.CodeGym.FuramaResort.Model.Customer;

import java.util.LinkedList;
import java.util.Scanner;

public interface CustomerService extends Service{
    static Scanner scanner = new Scanner(System.in);
    public void AddCustomer(Customer customer);
    public void SetCustomer(String code);
    public class CustomerServiceImpl implements CustomerService{
        LinkedList<Customer> linkedList = new LinkedList<>();

        public CustomerServiceImpl() {
        }
        public CustomerServiceImpl(LinkedList customer) {
            this.linkedList = customer;
        }
        @Override
        public void DisplayAll() {
            for (int i=0;i < linkedList.size();i++) {
                Customer customer = linkedList.get(i);
                System.out.println("Mã Khách Hàng :" + customer.getCustomerCode() + "\n"
                        +"Tên Khách Hàng :" + customer.getName() + "\n"
                        + "Giới Tính :" + customer.getGender() + "\n"
                        + "Ngày Sinh :" + customer.getDateOfBirth()+ "\n"
                        + "Số CMND :" + customer.getCMND() + "\n"
                        +"Số Điện Thoại :" + customer.getPhoneNumber() + "\n"
                        +"Loại khách hàng :" + customer.getCustomerType() + "\n"
                        + "Email :" + customer.getEmail() + "\n");
            }
        }
        @Override
        public void AddCustomer(Customer customer) {
            linkedList.add(customer);
        }
        @Override
        public void SetCustomer(String code) {
            for (int i=0;i< linkedList.size();i++) {
                Customer customer = linkedList.get(i);
                if(code.equals(customer.getCustomerCode())) {
                    System.out.println("Nhập mã Khách Hàng");
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
                    System.out.println("Nhập Email Khách Hàng");
                    String mail = scanner.nextLine();
                    System.out.println("Nhập loại Khách Hàng");
                    String customerType = scanner.nextLine();
                    customer.setCustomerCode(EmployeeCode);
                    customer.setName(name);
                    customer.setDateOfBirth(DateOfBirth);
                    customer.setGender(Gender);
                    customer.setCMND(CMND);
                    customer.setPhoneNumber(SDT);
                    customer.setEmail(mail);
                    customer.setCustomerType(customerType);
                }
            }
        }
    }
}
