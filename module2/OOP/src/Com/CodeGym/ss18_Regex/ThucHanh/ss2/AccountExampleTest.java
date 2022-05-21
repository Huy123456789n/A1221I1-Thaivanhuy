package Com.CodeGym.ss18_Regex.ThucHanh.ss2;

public class AccountExampleTest {
    private static AccountExample accountExample;
    private static String[] accountValid = new String[] {"123abc_", "_abc123", "______", "123456","abcdefgh"};
    private static String[] accountInvalid = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String valid: accountValid
             ) {boolean check = accountExample.AccountRegex(valid);
            System.out.println("account is : " + valid + " Check : " + check);
        }
    }
}
