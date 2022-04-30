package Com.CodeGym.FuramaResort.Model;

public class Contract {
    private int contractNumber;
    private int bookingCode;
    private int CustomerCode;
    private int deposit;
    private int totalPayment;

    public Contract(int contractNumber, int bookingCode, int customerCode, int deposit, int totalPayment) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        CustomerCode = customerCode;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(int customerCode) {
        CustomerCode = customerCode;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }
}
