package Com.CodeGym.MCV.Repository;

import Com.CodeGym.MCV.Model.Student;

public interface Repo {


    public void saveStudent(Student student);
    public void delete(String name);
    public void disPlayAll();


}
