package Com.CodeGym.ss12_Javacollection.ThucHanh.ss2;

public class Student {
    private String Name;
    private int age;
    private String address;

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
        Name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return " StudentName " + Name + " age " + age + " address " + address;
    }
}
