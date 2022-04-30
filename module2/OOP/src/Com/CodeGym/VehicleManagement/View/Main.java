package Com.CodeGym.VehicleManagement.View;

import Com.CodeGym.VehicleManagement.Controller.ControllerCar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddnewVehicleView addnewVehicleView = new AddnewVehicleView();
        DisplayVehicleView displayVehicleView = new DisplayVehicleView();
        ControllerCar controllerCar = new ControllerCar();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice =0;
            System.out.println("Chương Trình Quản Lý Phương Tiện Giao Thông");
            System.out.println("Chọn chức năng :");
            System.out.println("1: Thêm Mới Phương Tiện");
            System.out.println("2: HIển thị phương tiện");
            System.out.println("3: Xóa Phương tiện");
            System.out.println("4: Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addnewVehicleView.AddNewVehicle();
                    break;
                case 2:
                    displayVehicleView.DisplayVehicle();
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }
}
