package codyGym.model;

public class Contract {
    private String id;
    private String starDate;
    private String endDate;
    private double deposit;
    private double total;
    private String customer;
    private String Employee;
    private String Service;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEmployee() {
        return Employee;
    }

    public void setEmployee(String employee) {
        Employee = employee;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public Contract(String id, String starDate, String endDate, double deposit, double total, String customer, String employee, String service) {
        this.id = id;
        this.starDate = starDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.total = total;
        this.customer = customer;
        Employee = employee;
        Service = service;
    }
}
