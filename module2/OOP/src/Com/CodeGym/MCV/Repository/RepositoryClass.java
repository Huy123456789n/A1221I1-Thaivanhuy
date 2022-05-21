package Com.CodeGym.MCV.Repository;

import Com.CodeGym.MCV.Model.Student;

public class RepositoryClass implements Repo{
    Student[] students = new Student[20];
    int size = 0;

    @Override
    public void saveStudent(Student student) {
        students[size] = student;
        size++;
    }

    @Override
    public void delete(String name) {
        for (int i=0;i< size; i++) {
            if(name.equals(students[i].getName())) {
                for (int j=i ;j< size;i++) {
                    students[j] = students[j+1];
                    size--;
                }
            }
        }
    }
    @Override
    public void disPlayAll() {
        for (int i =0;i< size;i++){
            System.out.println(" Tên HS : " + students[i].getName()
                    + " Điểm : "+ students[i].getPoint()
                    + " Ngày Sinh :" + students[i].getDateOfBirth());
    }
    }
}
