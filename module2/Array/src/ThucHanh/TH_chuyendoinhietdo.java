package ThucHanh;
import java.util.Scanner;

public class TH_chuyendoinhietdo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double C;
        double F;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1 : F to C");
            System.out.println("2 : C to F");
            System.out.println("0 : Exit");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập độ C");
                    C = scanner.nextDouble();
                    F = 1.8 * C + 32;
                    System.out.println("Độ F là :" + F);
                    break;
                case 2:
                    System.out.println("nhập Độ F");
                    F = scanner.nextDouble();
                    C= (5.0/9) * (F-32);
                    System.out.println("Độ C là :" +C);
                    break;
            }
        } while (choice!=0);
    }
}

