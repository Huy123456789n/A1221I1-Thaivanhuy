package Com.CodeGym.MCV.Controller;

import Com.CodeGym.MCV.Model.Student;
import Com.CodeGym.MCV.Service.Service;
import Com.CodeGym.MCV.Service.ServiceClass;

public class Controller {
    Service service = new ServiceClass();
public void addST(Student student) {
    service.addStudent(student);
}

public void DisPlayAll(){
    service.disPlayAll();
}
public void Delete(String name) {
    service.delete(name);
}
}


