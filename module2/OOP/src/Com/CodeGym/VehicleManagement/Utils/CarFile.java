package Com.CodeGym.VehicleManagement.Utils;

import Com.CodeGym.VehicleManagement.Model.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class CarFile {
    static List<Car> cars = new ArrayList<>();
    public void AddCar(Car cars) {

        try {
            FileWriter fileWriter = new FileWriter("OOP/src/Com/CodeGym/VehicleManagement/Data/Car.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(cars.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void Display() {
        try {
            FileReader fileReader = new FileReader("OOP/src/Com/CodeGym/VehicleManagement/Data/Car.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Car car;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                car = new Car(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], Integer.parseInt(temp[4]), temp[5]);
                cars.add(car);
            }
            for (Car carlist : cars) {
                System.out.println(carlist);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getInformation(Car car) {
        return car.getBienkiemsoat()
                + "," + car.getHangsanxuat()
                + "," + car.getNamSanXuat()
                + "," + car.getChusohuu()
                + "," + car.getSoChongoi()
                + "," + car.getKieuXe();
    }
    public void delete(String bienkiemsoat) {
        Car car;
        try {
            FileReader fileReader = new FileReader("OOP/src/Com/CodeGym/VehicleManagement/Data/Car.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                car = new Car(temp[0], temp[1], Integer.parseInt(temp[2]), temp[3], Integer.parseInt(temp[4]), temp[5]);
                cars.add(car);
            }
            for (int i = 0; i < cars.size(); i++) {
                Car car1 = cars.get(i);
                if (bienkiemsoat.equals(car1.getBienkiemsoat())) {
                    cars.remove(car1);
                }
            }
            for (Car carlist : cars
            ) {
                FileWriter fileWriter = new FileWriter("OOP/src/Com/CodeGym/VehicleManagement/Data/Car.csv");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(carlist.toString());
                bufferedWriter.newLine();
                bufferedWriter.close();
                System.out.println( "Danh Sách xe còn lại : " + "\n"
                        + carlist);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
