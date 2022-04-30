package Com.CodeGym.ss16_TextFile.BaiTap.ss1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Link");
        String link = scanner.nextLine();
        copyFile.ReadFile(link);
    }
}
