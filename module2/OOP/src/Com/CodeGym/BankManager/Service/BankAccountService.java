package Com.CodeGym.BankManager.Service;

import Com.CodeGym.BankManager.Model.BankAccounts;
import Com.CodeGym.BankManager.Model.PaymentAccount;
import Com.CodeGym.BankManager.Model.SavingAccounts;
import Com.CodeGym.BankManager.Until.ReadAndWriterFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccountService {
    private static ReadAndWriterFile readAndWriterFile = new ReadAndWriterFile();
    List<BankAccounts> BankAccount = new ArrayList<>();

    public BankAccountService() {
        BankAccount = saveArray();
    }
    public void AddNewAccount(BankAccounts bank) {
        int lastId = 0;
        if (BankAccount.size() > 0) {
            lastId = BankAccount.get(BankAccount.size() - 1).getId();
            bank.setId(lastId + 1);
        }
        readAndWriterFile.WriterFile("OOP/src/Com/CodeGym/BankManager/DataAccount/DataAccount.csv", true, Collections.singletonList(bank));
    }

    public void Delete(int code) {
        for (int i =0;i<BankAccount.size();i++){
            BankAccounts bankAccounts = BankAccount.get(i);
            if(code == bankAccounts.getCodeAccount()) {
                BankAccount.remove(bankAccounts);
                readAndWriterFile.WriterFile("OOP/src/Com/CodeGym/BankManager/DataAccount/DataAccount.csv",false,BankAccount);
            }
        }
    }

    public void Display() {
        for (BankAccounts s : BankAccount) {
            System.out.println(s);
        }
    }
    public static List saveArray() {
        List Result = new ArrayList();
        List<String> line = readAndWriterFile.ReadFile("OOP/src/Com/CodeGym/BankManager/DataAccount/DataAccount.csv");
        for (String lines : line) {
            String[] temp = lines.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            int code = Integer.parseInt(temp[2]);
            String date = temp[3];
            if (temp.length == 6) {
                int numberCard = Integer.parseInt(temp[4]);
                int MoneyInCard = Integer.parseInt(temp[5]);
                Result.add(new PaymentAccount(id, name, code, date, numberCard, MoneyInCard));
            } else {
                Double moneySaving = Double.parseDouble(temp[4]);
                String svingDay = temp[5];
                Double LaiSuat = Double.parseDouble(temp[6]);
                String kihan = temp[7];
                Result.add(new SavingAccounts(id, name, code, date, moneySaving, svingDay, LaiSuat, kihan));
            }
        }
        return Result;
    }
}
