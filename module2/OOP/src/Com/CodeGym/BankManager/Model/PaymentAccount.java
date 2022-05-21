package Com.CodeGym.BankManager.Model;

public class PaymentAccount extends BankAccounts{
    private int NumberCard;
    private int MoneyInAccount;

    public PaymentAccount(int id, String name, int codeAccount, String date, int numberCard, int moneyInAccount) {
        super(id, name, codeAccount, date);
        NumberCard = numberCard;
        MoneyInAccount = moneyInAccount;
    }


    public int getNumberCard() {
        return NumberCard;
    }

    public void setNumberCard(int numberCard) {
        NumberCard = numberCard;
    }

    public int getMoneyInAccount() {
        return MoneyInAccount;
    }

    public void setMoneyInAccount(int moneyInAccount) {
        MoneyInAccount = moneyInAccount;
    }

    @Override
    public String toString() {
        return super.toString() + NumberCard + "," + MoneyInAccount;
    }
}
