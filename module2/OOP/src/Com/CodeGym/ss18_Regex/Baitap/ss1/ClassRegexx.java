package Com.CodeGym.ss18_Regex.Baitap.ss1;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRegexx {
    private String Class_Regex = "^[CAP]+[0-9]+[GHIKLM]$";
public boolean Class(String regex) {
    Pattern pattern = Pattern.compile(Class_Regex);
    Matcher matcher = pattern.matcher(regex);
    return matcher.matches();
}
}

