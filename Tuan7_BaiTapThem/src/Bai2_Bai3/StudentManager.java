// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package Bai2_Bai3;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManager implements StudentManagerInterface {

    private ArrayList<Student> ds = new ArrayList<>();

    public void addStudent(Student s) {
        ds.add(s);
    }

    @Override
    public void sortByScoreDesc() {
        ds.sort(Comparator.comparingDouble(Student::getScore));
        printStudents();

    }

    @Override
    public void sortByScoreAsc() {
        ds.sort(Comparator.comparingDouble(Student::getScore).reversed());
        printStudents();
    }

    @Override
    public Student findByName(String name) {
        for (Student s : ds) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }

        }
        return null;
    }

    public void printStudents() {

        System.out.println("ID | Name | Age | Email | Class | Address | Score | Grade");
        for (Student s : ds) {
            System.out.println(s.getId() + s.getName() + s.getAge() + s.getEmail() + s.getClassName() + s.getAddress() + s.getScore() + s.getGrade());
        }
    }

}
