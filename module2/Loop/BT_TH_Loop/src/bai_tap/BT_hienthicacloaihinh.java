package bai_tap;
import java.util.Scanner;
public class BT_hienthicacloaihinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0 ) {
            System.out.println("1: In hình Chữ nhật");
            System.out.println("2: In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3: In hình tam giác vuông, có cạnh góc vuông ở top-left");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i =1;i<=3;i++) {
                        for (int j=1;j<=5;j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i=1;i<=5;i++) {
                        for (int j=1;j<=i;j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
            }
        }
    }
}
