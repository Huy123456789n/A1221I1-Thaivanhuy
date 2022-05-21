package Com.CodeGym.VehicleManagement.Service;

import Com.CodeGym.VehicleManagement.Repository.CarRepository;

public interface VehicleService {
    CarRepository carRepository = new CarRepository.CarRepo();
    public void AddVehicle();
    public void Display();
    public void Delete();

    class  VehicleServiceIml implements VehicleService{
        @Override
        public void AddVehicle() {

        }
        @Override
        public void Display() {

        }
        @Override
        public void Delete() {

        }
    }
}
