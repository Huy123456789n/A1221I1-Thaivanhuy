package Com.CodeGym.Refactoring.Thuc_Hanh;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        if(number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";

        boolean FIZZ = number % 3 == 0;
        boolean BUZZ = number % 5 == 0;
        if(FIZZ)
            return "Fizz";

        if(BUZZ)
            return "Buzz";

        return number + "";
    }
}
