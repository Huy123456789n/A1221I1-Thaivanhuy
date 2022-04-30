package Com.CodeGym.FuramaResort.Services;

import Com.CodeGym.FuramaResort.Controllers.FuramaController;
import Com.CodeGym.FuramaResort.Libs.Libs;
import Com.CodeGym.FuramaResort.Model.House;
import Com.CodeGym.FuramaResort.Model.Room;
import Com.CodeGym.FuramaResort.Model.Villa;

import java.util.LinkedHashMap;
import java.util.Scanner;

public interface FacilityService extends Service {
    static Scanner scanner = new Scanner(System.in);

    public void AddFacility();

    public class FacilityServiceImpl implements FacilityService {
        FuramaController furamaController = new FuramaController();
        Libs libs = new Libs();
        LinkedHashMap<Object, Integer> linkedHashMap = new LinkedHashMap<>();

        @Override
        public void AddFacility() {
            while (true) {
                int choice = 0;
                System.out.println("Menu");
                System.out.println("1. Add New Villa\n" +
                        "2. Add New House\n" +
                        "3. Add New Room\n" +
                        "4. Back to menu");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        Villa villa = libs.addVilla();
                        linkedHashMap.put("Tên Dịch vụ : " + villa.getServiceName() + "\n"
                                + "Diện tích sử dụng :" + villa.getUsableArea() + "\n"
                                + "Chi Phí :" + villa.getExpense() + "\n"
                                + "Số lượng người tối đa :" + villa.getMaximumNumberOfPeople() + "\n"
                                + "Kiểu Thuê(Ngày/Tháng/Năm :)" + villa.getRentalType() + "\n"
                                + "Tiêu Chuẩn phòng :" + villa.getRoomStandard() + "\n"
                                + "Diện tích hồ bơi :" + villa.getSwimmingArea() + "\n"
                                + "Số tầng :" + villa.getNumberOfFloors(), 1);
                        break;
                    case 2:
                        House house = libs.AddHouse();
                        linkedHashMap.put("Tên Dịch vụ : " + house.getServiceName() + "\n"
                                + "Diện tích sử dụng :" + house.getUsableArea() + "\n"
                                + "Chi Phí :" + house.getExpense() + "\n"
                                + "Số lượng người tối đa :" + house.getMaximumNumberOfPeople() + "\n"
                                + "Kiểu Thuê(Ngày/Tháng/Năm :)" + house.getRentalType() + "\n"
                                + "Tiêu Chuẩn phòng :" + house.getRoomStandard() + "\n"
                                + "Số tầng :" + house.getNumberOfFloors(), 1);
                        break;
                    case 3:
                        Room room = libs.AddRoom();
                        linkedHashMap.put("Tên Dịch vụ : " + room.getServiceName() + "\n"
                                + "Diện tích sử dụng :" + room.getUsableArea() + "\n"
                                + "Chi Phí :" + room.getExpense() + "\n"
                                + "Số lượng người tối đa :" + room.getMaximumNumberOfPeople() + "\n"
                                + "Kiểu Thuê(Ngày/Tháng/Năm :)" + room.getRentalType() + "\n"
                                + "Số tầng :" + room.getFreeServiceIncludes(), 1);
                        break;
                    case 4:
                        furamaController.FacilityManagement();
                        break;
                }
            }
        }

        @Override
        public void DisplayAll() {
            for (Object key : linkedHashMap.keySet()
            ) {
                Integer value = linkedHashMap.get(key);
                System.out.println(key + " -----" + "Số lần Sử Dụng" + value);
                System.out.println("************************");

            }
        }
    }
}

