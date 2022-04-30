package Com.CodeGym.VehicleManagement.Controller;

import Com.CodeGym.VehicleManagement.Model.Car;
import Com.CodeGym.VehicleManagement.Repository.CarRepository;
import Com.CodeGym.VehicleManagement.Service.CarService;

public class ControllerCar {
    CarRepository carRepository = new CarRepository();
    public void AddNewCar(Car car) {
        carRepository.AddCar(car);
    }
    public void DisplayCar() {
        carRepository.Display();
    }
}
