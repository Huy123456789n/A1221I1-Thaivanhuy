package Com.CodeGym.FuramaResort.Model;

public class Villa extends Facility{
    private String RoomStandard;
    private double SwimmingArea;
    private int NumberOfFloors;

    public Villa(String serviceName, double usableArea, double expense, int maximumNumberOfPeople, String rentalType, String roomStandard, double swimmingArea, int numberOfFloors) {
        super(serviceName, usableArea, expense, maximumNumberOfPeople, rentalType);
        RoomStandard = roomStandard;
        SwimmingArea = swimmingArea;
        NumberOfFloors = numberOfFloors;
    }

    public Villa(Villa villa) {
        super();

    }

    public String getRoomStandard() {
        return RoomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        RoomStandard = roomStandard;
    }

    public double getSwimmingArea() {
        return SwimmingArea;
    }

    public void setSwimmingArea(double swimmingArea) {
        SwimmingArea = swimmingArea;
    }

    public int getNumberOfFloors() {
        return NumberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        NumberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, double usableArea, double expense, int maximumNumberOfPeople, String rentalType) {
        super(serviceName, usableArea, expense, maximumNumberOfPeople, rentalType);
    }
}
