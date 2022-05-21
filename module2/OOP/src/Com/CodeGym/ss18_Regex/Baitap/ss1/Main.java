package Com.CodeGym.ss18_Regex.Baitap.ss1;

public class Main {
    private static ClassRegexx classRegexx;
    public static String[] text = {"C1234G","k12345jh"};

    public static void main(String[] args) {
        for (String c: text
             ) { boolean check = classRegexx.Class(c);
            System.out.println(check);

        }
    }
}
