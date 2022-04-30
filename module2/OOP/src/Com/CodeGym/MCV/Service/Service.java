package Com.CodeGym.MCV.Service;

import Com.CodeGym.MCV.Model.Student;
import Com.CodeGym.MCV.Repository.Repo;

public interface Service {
    public void addStudent(Student student);
    public void disPlayAll();
    public void delete(String name);
}
