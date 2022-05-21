package Com.CodeGym.VehicleManagement.Repository;

import Com.CodeGym.VehicleManagement.Model.Car;
import Com.CodeGym.VehicleManagement.Utils.CarFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface CarRepository {
    public void Delete(String bienkiemsoat);

    public void Display();

    public void AddCar(Car car);

    static CarFile carfile = new CarFile();

    public class CarRepo implements CarRepository {
        static List<Car> cars = new ArrayList<>();

        @Override
        public void Delete(String bienkiemsoat) {
            carfile.delete(bienkiemsoat);
        }
        @Override
        public void Display() {

            carfile.Display();

        }
        @Override
        public void AddCar(Car car) {
            carfile.AddCar(car);
        }
    }
}
