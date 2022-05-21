package Com.CodeGym.VehicleManagement.Controller;

import Com.CodeGym.VehicleManagement.Model.Car;
import Com.CodeGym.VehicleManagement.Service.CarService;

import java.util.List;

public class ControllerCar {
    CarService carService = new CarService.CarServiceIlm();
    public void delete(String bienkiemsoat) {
        carService.delete(bienkiemsoat);
    }
    public void AddCar(Car car) {
        carService.AddCar(car);
    }
    public void Display() {
        carService.Display();
    }

}
