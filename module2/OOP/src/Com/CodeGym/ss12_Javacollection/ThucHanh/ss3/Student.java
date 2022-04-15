package Com.CodeGym.ss12_Javacollection.ThucHanh.ss3;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student name" + name;
    }


    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}

