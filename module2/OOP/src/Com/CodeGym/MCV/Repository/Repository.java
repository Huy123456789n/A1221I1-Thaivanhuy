package Com.CodeGym.MCV.Repository;

import Com.CodeGym.MCV.Model.Student;

import java.util.ArrayList;

public class Repository {
    ArrayList<Student> arrayList = new ArrayList<>();
    public Repository(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

}
