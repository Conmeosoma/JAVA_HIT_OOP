package Bai2_Bai3;
public interface StudentManagerInterface {

    void sortByScoreDesc();

    void sortByScoreAsc();

    Student findByName(String name);

    void printStudents();

}
