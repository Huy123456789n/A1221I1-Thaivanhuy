package Com.CodeGym.ss17_BinaryFile.ThucHanh.ss2;

import java.io.*;
import java.util.List;

public class Student implements Serializable {
    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return " id :" + id
                + " Name: " + name
                + " address:" +address;
    }

    public static void WriteToFile(String part, List<Student> students) {
        try {
            FileOutputStream std = new FileOutputStream(part);
            ObjectOutputStream stds = new ObjectOutputStream(std);
            stds.writeObject(students);
            std.close();
            stds.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
