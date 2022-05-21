package Com.CodeGym.VehicleManagement.Service;

import Com.CodeGym.VehicleManagement.Model.Car;
import Com.CodeGym.VehicleManagement.Repository.CarRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface CarService {
    public void delete(String bienkiemsoat);
    public void Display();
    public void AddCar(Car car);
    CarRepository carRepository = new CarRepository.CarRepo();
    public class CarServiceIlm implements CarService{

        @Override
        public void delete(String bienkiemsoat) {
            carRepository.Delete(bienkiemsoat);
        }

        @Override
        public void Display() {
            carRepository.Display();
        }
        @Override
        public void AddCar(Car car) {
            carRepository.AddCar(car);
        }
    }
}
