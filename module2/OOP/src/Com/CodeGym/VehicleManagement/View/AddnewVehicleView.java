package Com.CodeGym.VehicleManagement.View;

import Com.CodeGym.VehicleManagement.Controller.ControllerCar;
import Com.CodeGym.VehicleManagement.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddnewVehicleView {
    static ControllerCar controller = new ControllerCar();
    static Scanner scanner = new Scanner(System.in);
    public void AddNewVehicle() {
        while (true) {
            int choice = 0;
            System.out.println("Menu");
            System.out.println("1: Thêm oto");
            System.out.println("2: Thêm Xe Tải");
            System.out.println("3: Thêm Xe Máy");
            System.out.println("4: return Main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    controller.AddCar(AddNewCar());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    Main.DisPlayMenu();
                    break;
            }
        }
    }
    public static Car AddNewCar() {
        System.out.println("Thêm Biển kiểm soát");
        String bienkiemsoat = scanner.nextLine();
        System.out.println("Thêm Hãng Sản Xuất");
        String HangSanXuat = scanner.nextLine();
        System.out.println("Năm Sản Xuất");
        int NamSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Chủ Sở Hữu");
        String name = scanner.nextLine();
        System.out.println("Số Chỗ ngồi");
        int ChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu xe");
        String KieuXe = scanner.nextLine();
        Car car = new Car(bienkiemsoat,HangSanXuat,NamSanXuat,name,ChoNgoi,KieuXe);
        return car;
    }
}
