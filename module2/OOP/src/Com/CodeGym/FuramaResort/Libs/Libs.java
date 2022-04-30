package Com.CodeGym.FuramaResort.Libs;

import Com.CodeGym.FuramaResort.Model.*;

import java.util.Scanner;

public class Libs {
    static Scanner scanner = new Scanner(System.in);
    public Employee getInformationEmployee() {
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
        Employee employee = new Employee(name,CMND,Gender,DateOfBirth,SDT,mail,EmployeeCode,academicLevel,salary,PositionNV);
        return employee;
    }
    public String Code() {
        System.out.println("Nhập Mã Code Cần Tìm");
        String Code = scanner.nextLine();
        return Code;
    }
    public Customer getInformationCustomer() {
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
        System.out.println("Loại Khách Hàng");
        String customerType = scanner.nextLine();
        Customer customer = new Customer(name,CMND,Gender,DateOfBirth,SDT,mail,EmployeeCode,customerType);
        return customer;
    }
    public Villa addVilla() {
        System.out.println("Nhập tên Dịch vụ");
        String ServiceName = scanner.nextLine();
        System.out.println("Nhập Diện tích sử dụng (m2)");
        double UsableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Số Lượng người tối đa");
        int MaximumOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu Thuê(Ngày/Tháng/Năm)");
        String RentalType = scanner.nextLine();
        System.out.println("Tiêu chuẩn Phòng");
        String room = scanner.nextLine();
        System.out.println("Diện tích hồ bơi");
        double SwimmingArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Số tầng");
        int floors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(ServiceName,UsableArea,price,MaximumOfPeople,RentalType,room,SwimmingArea,floors);
        return villa;
    }
    public Integer key () {
        System.out.println("Nhập Key");
        Integer key = Integer.valueOf(scanner.nextLine());
        return key;
    }
    public House AddHouse() {
        System.out.println("Nhập tên Dịch vụ");
        String ServiceName = scanner.nextLine();
        System.out.println("Nhập Diện tích sử dụng (m2)");
        double UsableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Số Lượng người tối đa");
        int MaximumOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu Thuê(Ngày/Tháng/Năm)");
        String RentalType = scanner.nextLine();
        System.out.println("Tiêu chuẩn Phòng");
        String room = scanner.nextLine();
        System.out.println("Số tầng");
        int floors = Integer.parseInt(scanner.nextLine());
        House house = new House(ServiceName,UsableArea,price,MaximumOfPeople,RentalType,room,floors);
        return house;
    }
    public Room AddRoom() {
        System.out.println("Nhập tên Dịch vụ");
        String ServiceName = scanner.nextLine();
        System.out.println("Nhập Diện tích sử dụng (m2)");
        double UsableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chi phí thuê");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Số Lượng người tối đa");
        int MaximumOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu Thuê(Ngày/Tháng/Năm)");
        String RentalType = scanner.nextLine();
        System.out.println("Dịch vụ miễn phí đi kèm");
        String free = scanner.nextLine();
        Room room = new Room(ServiceName,UsableArea,price,MaximumOfPeople,RentalType,free);
        return room;
    }
    public Booking booking () {
        System.out.println("Mã Booking");
        String BookingCode = scanner.nextLine();
        System.out.println("Ngày Bắt Đầu");
        String Start = scanner.nextLine();
        System.out.println("Ngày Kết Thúc");
        String End = scanner.nextLine();
        System.out.println("Mã Khách Hàng");
        String CustomerCode = scanner.nextLine();
        System.out.println("Tên Dịch vụ");
        String ServiceName = scanner.nextLine();
        System.out.println("Loại dịch vụ");
        String ServiceType = scanner.nextLine();
        Booking booking = new Booking(BookingCode,Start,End,CustomerCode,ServiceName,ServiceType);
        return booking;
    }
}
