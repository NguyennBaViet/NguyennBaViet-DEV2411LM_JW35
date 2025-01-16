package pgk_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoObjectArrayList {
    public static void main(String[] args) {

    List<Student> students = new ArrayList<Student>();

    //Thêm sinh viên
    students.add(new Student(1,"A1",25));
    students.add(new Student(2,"A2",15));
    students.add(new Student(3,"A3",30));
    students.add(new Student(4,"A4",20));
    students.add(new Student(5,"A5",26));

    //Update
        students.set(0,new Student(6,"A6",21));
        //In danh sách
        for (Student student : students) {
            System.out.println(student.toString());
        }
        //Sort
        Collections.sort(students,(x,y)->{return  x.getAge()-y.getAge();});

        //In danh sách sort
        System.out.println("Sap xep");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}


