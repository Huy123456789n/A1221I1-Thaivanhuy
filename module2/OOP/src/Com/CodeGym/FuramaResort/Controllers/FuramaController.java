package Com.CodeGym.FuramaResort.Controllers;

import Com.CodeGym.FuramaResort.Libs.Libs;
import Com.CodeGym.FuramaResort.Model.Facility;
import Com.CodeGym.FuramaResort.Services.BookingService;
import Com.CodeGym.FuramaResort.Services.CustomerService;
import Com.CodeGym.FuramaResort.Services.EmployeeService;
import Com.CodeGym.FuramaResort.Services.FacilityService;
import Com.CodeGym.FuramaResort.Utils.CustomerFile;
import Com.CodeGym.FuramaResort.Utils.EmployeeFile;

import java.util.Scanner;

public  class  FuramaController {
    static EmployeeService.EmployeeServiceImpl employeeService = new EmployeeService.EmployeeServiceImpl();
    static Libs libs = new Libs();
    static CustomerService customerService = new CustomerService.CustomerServiceImpl();
    static FacilityService.FacilityServiceImpl facilityService = new FacilityService.FacilityServiceImpl();
    static BookingService bookingService = new BookingService.BookingServiceImpl();
    static CustomerFile customerFile = new CustomerFile();
    static EmployeeFile employeeFile = new EmployeeFile();
    static Scanner scanner = new Scanner(System.in);
    public void displayMainMenu() {
        int choice =0;
        while (true) {
            System.out.println("Menu");
            System.out.println("1: Employee Management");
            System.out.println("2: Customer Management");
            System.out.println("3: Facility Management");
            System.out.println("4: Booking Management");
            System.out.println("5: Promotion Management");
            System.out.println("6: Exit");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e ) {
                System.out.println("Phải nhập Dữ liệu số");
            }
            switch (choice){
                case 1:
                    EmployeeManagement();
                    break;
                case 2:
                    CustomerManagement();
                    break;
                case 3:
                    FacilityManagement();
                    break;
                case 4:
                    BookingManagement();
                    break;
                case 5:
                    PromotionManagement();
                    break;
                case 6:
                    break;
            }
        }
    }
    static FuramaController furamaController = new FuramaController();
    static int choice = 0;
    private static void EmployeeManagement() {
        while (true) {
            System.out.println("1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Edit employee\n" +
                    "4 Return main menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu nhập vào là số");
            }
            switch (choice) {
                case 1:
                    employeeFile.ReadFile();
                break;
                case 2:
                    employeeFile.WriterFile(libs.getInformationEmployee());
                    break;
                case 3:
                    employeeService.SetEmployee(libs.Code());
                    break;
                case 4:
                    furamaController.displayMainMenu();
            }
        }
    }
    private static void CustomerManagement() {
        while (true) {
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                customerFile.ReadFile();
                break;
            case 2:
                customerFile.WriterFile(libs.getInformationCustomer());
                break;
            case 3:
                customerService.SetCustomer(libs.Code());
                break;
            case 4:
                furamaController.displayMainMenu();
                break;
        }
    }
    }
    public void FacilityManagement() {
        while (true) {
            System.out.println("1 Display list facility\n" +
                    "2 Add new facility\n" +
                    "3 Display list facility maintenance\n" +
                    "4 Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    facilityService.DisplayAll();
                    break;
                case 2:
                    facilityService.AddFacility();
                    break;
                case 3:
                    break;
                case 4:
                    furamaController.displayMainMenu();
            }
        }
    }
    private static void BookingManagement() {
        while (true) {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new constracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh Sách Khách Hàng");
                    customerService.DisplayAll();
                    System.out.println("Danh sách Dịch Vụ");
                    facilityService.DisplayAll();
                    bookingService.AddBooking();
                    break;
                case 2:
                    bookingService.DisplayAll();
            }
        }
    }
    private static void PromotionManagement() {
        System.out.println("1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu");
    }
}
