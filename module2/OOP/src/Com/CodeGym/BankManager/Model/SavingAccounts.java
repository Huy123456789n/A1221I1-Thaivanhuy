package Com.CodeGym.BankManager.Model;

public class SavingAccounts extends BankAccounts{
    private Double MoneySaving;
    private String savingDay;
    private Double LaiSuat;
    private String Kihan;

    public SavingAccounts(int id, String name, int codeAccount, String date, Double moneySaving, String savingDay, Double laiSuat, String kihan) {
        super(id, name, codeAccount, date);
        MoneySaving = moneySaving;
        this.savingDay = savingDay;
        LaiSuat = laiSuat;
        Kihan = kihan;
    }

    public Double getMoneySaving() {
        return MoneySaving;
    }

    public void setMoneySaving(Double moneySaving) {
        MoneySaving = moneySaving;
    }

    public String getSavingDay() {
        return savingDay;
    }

    public void setSavingDay(String savingDay) {
        this.savingDay = savingDay;
    }

    public Double getLaiSuat() {
        return LaiSuat;
    }

    public void setLaiSuat(Double laiSuat) {
        LaiSuat = laiSuat;
    }

    public String getKihan() {
        return Kihan;
    }

    public void setKihan(String kihan) {
        Kihan = kihan;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%s,%s,%s,%s,",MoneySaving,savingDay,Kihan,LaiSuat);
    }
}
