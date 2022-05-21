package Com.CodeGym.ss18_Regex.ThucHanh.ss2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public AccountExample() {
    }
    public boolean AccountRegex(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
