package Com.CodeGym.FuramaResort.Model;

public abstract class Facility {
    private String ServiceName;
    private double UsableArea;
    private double Expense;
    private int MaximumNumberOfPeople;
    private String RentalType;

    public Facility(String serviceName, double usableArea, double expense, int maximumNumberOfPeople, String rentalType) {
        ServiceName = serviceName;
        UsableArea = usableArea;
        Expense = expense;
        MaximumNumberOfPeople = maximumNumberOfPeople;
        RentalType = rentalType;
    }

    public Facility() {
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public double getUsableArea() {
        return UsableArea;
    }

    public void setUsableArea(double usableArea) {
        UsableArea = usableArea;
    }

    public double getExpense() {
        return Expense;
    }

    public void setExpense(double expense) {
        Expense = expense;
    }

    public int getMaximumNumberOfPeople() {
        return MaximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        MaximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return RentalType;
    }

    public void setRentalType(String rentalType) {
        RentalType = rentalType;
    }

}
