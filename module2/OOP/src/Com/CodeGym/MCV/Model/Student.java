package Com.CodeGym.MCV.Model;

public class Student {
    private String Name;
    private double Point;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPoint() {
        return Point;
    }

    public void setPoint(double point) {
        Point = point;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public Student(String name, double point, int dateOfBirth) {
        Name = name;
        Point = point;
        DateOfBirth = dateOfBirth;
    }

    private int DateOfBirth;
}
