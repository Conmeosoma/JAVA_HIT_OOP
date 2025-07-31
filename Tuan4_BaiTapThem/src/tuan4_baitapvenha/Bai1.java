package tuan4_baitapvenha;

public class Bai1 {

    Student st1 = new Student("Tien Bry", 2006, "HaNoi", 7.5, 8, 10, 3);
    Student st2 = new Student("Hong Ty", 2006, "BacGiang", 10, 10, 10, 0);
    Student st3 = new Student("Toan", 2005, "Nam Dinh", 10, 10, 10, 0);
    Student st4 = new Student("Jack", 1997, "Ben Tre", 3, 6.5, 9, 4);
    Student st5 = new Student("Binh gold", 1997, "Hai phong", 5.5, 6, 8, 4);

    public void inTieuDe() {
        System.out.printf("%10s %10s %20s %10s %10s %10s %10s %15s%n",
                "Ten", "Tuoi", "Dia Chi", "Diem TX1", "Diem TX2", "Diem KTHP", "GPA", "So Tiet Nghi");

    }

    public void xuat() {
        Student[] dssv = {st1, st2, st3, st4, st5};
        for (Student st : dssv) {
            System.out.println(st.toString());
        }

    }

    public static void main(String[] args) {
        Bai1 b1 = new Bai1();
        b1.xuat();

    }

}
