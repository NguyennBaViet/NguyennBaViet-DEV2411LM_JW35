package review;

public class Student {
    //field (state)
    int id;
    String name;
    int age;
    //constructor
    public Student(){

    }
    public  Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //attribute

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //overide

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
