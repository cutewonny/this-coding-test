package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparator<Student> {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public int getGrade() {
        return grade;
    }


    @Override
    public int compare(Student o1, Student o2) {
        return o1.grade-o2.grade;
    }


    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student("홍길동", 95);
        Student student2 = new Student("이순산", 77);
        Student student3 = new Student("한정원", 17);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        System.out.println(arrayList.toString());
        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }



        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.grade-o2.grade;
            }
        };

        int result = comparator.compare(student1, student2);

        System.out.println("result>> "+ result);

//        Collections.sort(arrayList);
//        System.out.println(arrayList.toString());

        ArrayList<Student2> arrayList2 = new ArrayList<>();
        Student2 student4 = new Student2("홍길동", 95);
        Student2 student5 = new Student2("이순산", 77);
        Student2 student6 = new Student2("한정원", 17);
        arrayList2.add(student4);
        arrayList2.add(student5);
        arrayList2.add(student6);

        System.out.println("전>>>>>>>>> "+arrayList2.toString());
        Collections.sort(arrayList2);
        System.out.println("후>>>>>>>>> "+arrayList2.toString());

    }
}

class Student2 implements Comparable<Student2>{
    private String name;
    private int grade;

    public Student2(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }


    @Override
    public int compareTo(Student2 o) {
        return this.grade-o.grade;
    }
}