package Com.CodeGym.FuramaResort.Model;

public class House extends Facility{
    private String RoomStandard;
    private int NumberOfFloors;

    public House(String serviceName, double usableArea, double expense, int maximumNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, expense, maximumNumberOfPeople, rentalType);
        RoomStandard = roomStandard;
        NumberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return RoomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        RoomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }

    public House(String serviceName, double usableArea, double expense, int maximumNumberOfPeople, String rentalType) {
        super(serviceName, usableArea, expense, maximumNumberOfPeople, rentalType);
    }
}
