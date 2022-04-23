package Com.CodeGym.MCV.view;

import Com.CodeGym.MCV.Model.Student;

import java.util.Scanner;

public class viewStudent {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int choice= 0;
        try {
            System.out.println("Chức Năng Chương Trình");
            System.out.println("1: Xem danh sách");
            System.out.println("2: Thêm Học sinh");
            System.out.println("3: Xóa Học Sinh");
            System.out.println("4: Exit");
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Phải nhập dữ liệu là số");
            choice = Integer.parseInt(scanner.nextLine());
        }
       switch (choice) {
           case 1:
               break;
           case 2:
               break;
           case 3:
               break;
           case 4:
               break;
       }
    }
}
private Student student() {
    System.out.println("Mời nhập tên học sinh");
    String name = scanner.nextLine();
    System.out.println("Mời nhập điểm");
    double point = Double.parseDouble(scanner.nextLine());
    System.out.println("Mời nhập ngày sinh");
    int dayOfBirth = Integer.parseInt(scanner.nextLine());
    Student student = new Student(name,point,dayOfBirth);
    return student;
}
}
