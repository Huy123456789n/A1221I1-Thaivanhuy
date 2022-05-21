package Com.CodeGym.ss17_BinaryFile.ThucHanh.ss2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Thái Văn Huy","Đà nẵng"));
        students.add(new Student(2,"Anh Phương","Đà nẵng"));
        students.add(new Student(3,"Đức Anh","Đà nẵng"));
        Student.WriteToFile("OOP/src/Com/CodeGym/BinaryFile/ThucHanh/ss2/Student.txt",students);
        List<Student> readData = readFile("OOP/src/Com/CodeGym/BinaryFile/ThucHanh/ss2/Student.txt");
        for (Student student: readData) {
            System.out.println(student);
        }
    }
    public static List<Student> readFile(String part) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(part);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
