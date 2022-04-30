package Com.CodeGym.MCV.Service;

import Com.CodeGym.MCV.Model.Student;
import Com.CodeGym.MCV.Repository.Repo;
import Com.CodeGym.MCV.Repository.RepositoryClass;

public class ServiceClass implements Service{
    static Repo repo = new RepositoryClass();


    @Override
    public void addStudent(Student student) {
        repo.saveStudent(student);
    }

    @Override
    public void disPlayAll() {
        repo.disPlayAll();
    }

    @Override
    public void delete(String name) {
        repo.delete(name);
    }

}

