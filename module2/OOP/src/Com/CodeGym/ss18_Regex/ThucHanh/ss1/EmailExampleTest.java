package Com.CodeGym.ss18_Regex.ThucHanh.ss1;

public class EmailExampleTest {
    private static EmailExample emailExample;
    private static final String[] ValidMail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    private static final String[] InvalidMail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String valid : ValidMail
             ) { boolean check = emailExample.validate(valid);
            System.out.println(check);
        }
        for (String Invalid: InvalidMail
             ) { boolean check = emailExample.validate(Invalid);
            System.out.println(check);

        }
    }
}
