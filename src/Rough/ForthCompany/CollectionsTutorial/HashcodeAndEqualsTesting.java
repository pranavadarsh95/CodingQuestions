package Rough.ForthCompany.CollectionsTutorial;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashcodeAndEqualsTesting {
    public static void main(String[] args) {
        Set<Student> uniqueStudents = new HashSet<>();

        Student s1 = new Student(1, "Pratibha", 25);
        Student s2 = new Student(2, "rathi", 12);
        Student s3 = new Student(1, "Pratibha", 25);

        uniqueStudents.addAll(Arrays.asList(s1, s2, s3));

        System.out.println(uniqueStudents.contains(new Student(1, "Pratibha", 25)));
//        System.out.println(uniqueStudents.size());

        Set<Integer> uniqueIntegers = new HashSet<>(Arrays.asList(1,2,3,4,1));

//        System.out.println(uniqueIntegers.size());

    }
}

class Student{
    Integer rollNumber;
    String name;
    int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
//        return Objects.hash(age, name, rollNumber);

        int prime = 31;
        int result = 1;

        result = prime * result + age;
        result = prime * result + rollNumber;
        result = prime * result + (name != null ? name.hashCode() : 0);

        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if(obj==null || obj.getClass()!=this.getClass()){
            return false;
        }
        Student student = (Student)obj;

        return student.rollNumber.equals(this.rollNumber) && student.age == this.age && student.name.equals(this.name);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return rollNumber == student.rollNumber && age == student.age && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(rollNumber, name, age);
//    }
}