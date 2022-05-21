package Com.CodeGym.VehicleManagement.View;

import Com.CodeGym.VehicleManagement.Controller.ControllerCar;

import java.util.Scanner;

public class Main {
    static AddnewVehicleView addnewVehicleView = new AddnewVehicleView();
   static DisplayVehicleView displayVehicleView = new DisplayVehicleView();
   static DeleteVehicleView deleteVehicleView = new DeleteVehicleView();
    static ControllerCar controllerCar = new ControllerCar();

    public static void main(String[] args) {
        DisPlayMenu();
    }
    public static void DisPlayMenu() {
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
                    deleteVehicleView.Delete();
                    break;
                case 4:
                    break;
            }
        }
    }
}
