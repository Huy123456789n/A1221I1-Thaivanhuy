package Com.CodeGym.VehicleManagement.View;

import Com.CodeGym.VehicleManagement.Controller.ControllerCar;

import java.util.Scanner;

public class DeleteVehicleView {
    static ControllerCar controllerCar = new ControllerCar();
    static Scanner scanner = new Scanner(System.in);
    public void Delete() {
        while (true) {
            int choice = 0;
            System.out.println("Menu");
            System.out.println("1: Xóa oto");
            System.out.println("2: Xóa Xe Tải");
            System.out.println("3: Xóa Xe Máy");
            System.out.println("4: return Main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    controllerCar.delete(bienkiemsoat());
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
    public static String bienkiemsoat() {
        System.out.println("Nhập Biển Kiểm Soát Cần Xóa");
        String bienSo = scanner.nextLine();
        return bienSo;
    }
}
