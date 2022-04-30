package Com.CodeGym.FuramaResort.Services;

import Com.CodeGym.FuramaResort.Libs.Libs;
import Com.CodeGym.FuramaResort.Model.Booking;

import java.util.TreeSet;

public interface BookingService extends Service {
    public void AddBooking();
    public class BookingServiceImpl implements BookingService{
        Libs libs = new Libs();
        TreeSet<Booking> treeSet = new TreeSet<>();
        CustomerService customerService = new CustomerService.CustomerServiceImpl();
        FacilityService facilityService = new FacilityService.FacilityServiceImpl();

        @Override
        public void DisplayAll() {
            for (Booking booking:treeSet
                 ) {
                System.out.println("Mã Booking :" + booking.getBookingCode() +"\n"
                        +"Mã Khách Hàng:" +booking.getCustomerCode()+"\n"
                        +"Tên Dịch Vụ :"+booking.getServiceName() +"\n"
                        +"Loại Dịch Vụ" + booking.getServiceType() +"\n"
                        +"Ngày Bắt Đầu" + booking.getStartDay() +"\n"
                        +"Ngày Kết thúc" + booking.getEndDay() );
            }
        }

        @Override
        public void AddBooking() {
            Booking booking = libs.booking();
            treeSet.add(booking);
        }
    }
}
