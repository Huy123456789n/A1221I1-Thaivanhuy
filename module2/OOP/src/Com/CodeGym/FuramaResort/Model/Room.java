package Com.CodeGym.FuramaResort.Model;

public class Room extends Facility{
    private String freeServiceIncludes;

    public Room(String serviceName, double usableArea, double expense, int maximumNumberOfPeople, String rentalType, String freeServiceIncludes) {
        super(serviceName, usableArea, expense, maximumNumberOfPeople, rentalType);
        this.freeServiceIncludes = freeServiceIncludes;
    }

    public String getFreeServiceIncludes() {
        return freeServiceIncludes;
    }

    public void setFreeServiceIncludes(String freeServiceIncludes) {
        this.freeServiceIncludes = freeServiceIncludes;
    }

    public Room(String serviceName, double usableArea, double expense, int maximumNumberOfPeople, String rentalType) {
        super(serviceName, usableArea, expense, maximumNumberOfPeople, rentalType);
    }
}
