package ThucHanh;

import java.util.Scanner;

public class TH_Timgiatritrongmang {
    public static void main(String[] args) {
        String[] student = {"VanHuy", "DucAnh", "PhiDuy"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.println("Tên có trong Mảng");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not Found" + input_name + "in the list");
        }
        int number = 6; while (number > 0) { number -= 3; System.out.print(number + ""); }
    }
}
