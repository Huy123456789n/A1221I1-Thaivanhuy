package Com.CodeGym.FuramaResort.Model;

public class Booking {
    private String BookingCode;
    private String StartDay;
    private String EndDay;
    private String CustomerCode;
    private String ServiceName;
    private String ServiceType;

    public Booking(String bookingCode, String startDay, String endDay, String customerCode, String serviceName, String serviceType) {
        BookingCode = bookingCode;
        StartDay = startDay;
        EndDay = endDay;
        CustomerCode = customerCode;
        ServiceName = serviceName;
        ServiceType = serviceType;
    }

    public String getBookingCode() {
        return BookingCode;
    }

    public void setBookingCode(String bookingCode) {
        BookingCode = bookingCode;
    }

    public String getStartDay() {
        return StartDay;
    }

    public void setStartDay(String startDay) {
        StartDay = startDay;
    }

    public String getEndDay() {
        return EndDay;
    }

    public void setEndDay(String endDay) {
        EndDay = endDay;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String serviceType) {
        ServiceType = serviceType;
    }
}
