package Com.CodeGym.BankManager.View;

import Com.CodeGym.BankManager.Model.BankAccounts;
import Com.CodeGym.BankManager.Model.PaymentAccount;
import Com.CodeGym.BankManager.Model.SavingAccounts;
import Com.CodeGym.BankManager.Service.BankAccountService;

import java.util.Scanner;

public class View {
    private static BankAccountService bankAccountService = new BankAccountService();
    private static Scanner scanner = new Scanner(System.in);
    private static int choice =0;
    public static void main(String[] args) {
        while (true){
            System.out.println("Menu Chức Năng");
            System.out.println("1: Add New Account");
            System.out.println("2: Delete Account By Code");
            System.out.println("3: DisplayAll");
            System.out.println("4: Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AddNewAccount();
                    break;
                case 2:
                    break;
                case 3:
                    bankAccountService.Display();
                    break;
                case 4:
                    break;
            }
        }
    }
    public static void AddNewAccount() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1: Thêm tài khoản tiết kiệm");
            System.out.println("2: Thêm tài khoản thanh toán");
            System.out.println("3: Return Menu");
            choice = Integer.parseInt(scanner.nextLine());
            bankAccountService.AddNewAccount(getInformation());
            }
        }
    public static BankAccounts getInformation() {
        int id = 1;
        System.out.println("Nhập Tên chủ tài Khoản");
        String name = scanner.nextLine();
        System.out.println("Nhập mã Tài Khoản");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày mở thẻ");
        String date = scanner.nextLine();
        if(choice ==1) {
            System.out.println("Nhập số tiền gửi tiết kiệm");
            Double moneySaving = Double.valueOf(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập ngày gủi tiết kiệm");
            String dateSaving = scanner.nextLine();
            System.out.println("Nhập Lãi suất");
            Double LaiSuat = Double.valueOf(scanner.nextLine());
            System.out.println("Nhập Kì Hạn");
            String KiHan = scanner.nextLine();
            SavingAccounts savingAccounts = new SavingAccounts(id,name,code,date,moneySaving,dateSaving,LaiSuat,KiHan);
                return savingAccounts;
        } else {
            System.out.println("Nhập Số thẻ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số tiền trong thẻ");
            int moneyInCard = Integer.parseInt(scanner.nextLine());
            PaymentAccount paymentAccount = new PaymentAccount(id,name,code,date,number,moneyInCard);
            return paymentAccount;
        }
    }
}
