package Com.CodeGym.ss12_Javacollection.ThucHanh.ss2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Huy", 20, "DN");
        Student student2 = new Student("Hoàng", 21, "DN");
        Student student3 = new Student("Quý", 22, "DN");
        Map<Integer, Student> hashmap = new HashMap<>();
        hashmap.put(1, student1);
        hashmap.put(2, student2);
        hashmap.put(3, student3);
        hashmap.put(4, student1);
        for (Map.Entry<Integer, Student> student : hashmap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("..........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student: students
             ) {
            System.out.println(student.toString());

        }

    }
}
