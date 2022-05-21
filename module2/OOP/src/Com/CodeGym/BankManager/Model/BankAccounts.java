package Com.CodeGym.BankManager.Model;

public class BankAccounts {
    private int id;
    private String name;
    private int CodeAccount;
    private String Date;

    public BankAccounts(int id, String name, int codeAccount, String date) {
        this.id = id;
        this.name = name;
        CodeAccount = codeAccount;
        Date = date;
    }
    public BankAccounts() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeAccount() {
        return CodeAccount;
    }

    public void setCodeAccount(int codeAccount) {
        CodeAccount = codeAccount;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s",id,name,CodeAccount,Date);
    }
}
