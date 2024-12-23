package review;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Array
 */
public class test {
    public static void main(String[] args) {
        //Khởi tạo biến mảng
        Student[] students = new Student[10];
        //Thêm giá trị vào mảng
        students[0] = new Student(1,"Sinh Vien 1",20);
        students[1] = new Student(2,"Sinh Vien 2",21);
        students[2] = new Student(3,"Sinh Vien 3",25);
        students[3] = new Student(4,"Sinh Vien 4",23);
        students[4] = new Student(5,"Sinh Vien 5",22);
        students[9] = new Student(10,"Sinh Vien 10",19);

        //In danh sách
        for(var student : students){
            if(student != null)
             System.out.println(student);
        }
        //ArrayList
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"Sinh Vien 1",20));
        list.add(new Student(2,"Sinh Vien 2",21));
        list.add(new Student(3,"Sinh Vien 3",25));
        list.add(new Student(4,"Sinh Vien 4",23));
        list.add(new Student(5,"Sinh Vien 5",22));

        for(Student student : list){
            System.out.println(student.toString());
        }
        Collections.sort(list,(a,b)-> {return a.age-b.age;});
        System.out.println("ArrayList: ");
        for(Student student : list) {
            System.out.println(student.toString());
        }
    }
}
