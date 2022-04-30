package Com.CodeGym.VehicleManagement.Repository;

import Com.CodeGym.VehicleManagement.Model.Car;
import Com.CodeGym.VehicleManagement.Service.CarService;
import Com.CodeGym.VehicleManagement.View.AddnewVehicleView;

import java.io.*;
import java.util.ArrayList;

public class CarRepository implements CarService {
    ArrayList<Car> arrayListcar = new ArrayList<>();

    @Override
    public void AddCar(Car car) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("OOP/src/Com/CodeGym/VehicleManagement/Data/Car.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(car);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void Display() {

    }
    @Override
    public void Delete() {
        File file = new File("OOP/src/Com/CodeGym/VehicleManagement/Data/Car.csv");
    }
    public String getInformation(Car car) {
        return "Số biển Kiểm Soát: " + car.getBienkiemsoat() + "\n"
                + "Hãng Sản Xuất: " + car.getHangsanxuat() + "\n"
                + "Năm Sản Xuất: " + car.getNamSanXuat()+ "\n"
                + "Chủ Sở Hữu: " + car.getChusohuu()+ "\n"
                + "Số Chỗ Ngồi: " + car.getSoChongoi()+ "\n"
                + "Kiểu Xe: " + car.getKieuXe();
    }
}
