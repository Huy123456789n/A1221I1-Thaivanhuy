package Com.CodeGym.VehicleManagement.View;

import Com.CodeGym.VehicleManagement.Controller.ControllerCar;

import java.util.Scanner;

public class DisplayVehicleView {
    ControllerCar controllerCar = new ControllerCar();

    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;

    public void DisplayVehicle() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1: Hiển thị Oto");
            System.out.println("2: Hiển thị xe tải");
            System.out.println("3: Hiển thị xe máy");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    controllerCar.Display();
                    break;
            }
        }
    }
}
