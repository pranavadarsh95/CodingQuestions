package Rough.ForthCompany.ComparatorAndComparable;

import java.util.*;

public class StringComparator {

    public static void main(String[] args) {
        Student student1 = new Student(4,"ram", 14.7, new PreviousRecord(34, true));
        Student student2 = new Student(2,"amrit", 34.7, new PreviousRecord(4, false));
        Student student3 = new Student(5,"pratap", 64.2, new PreviousRecord(94, true));
        Student student4 = new Student(1,"sushma", 4.7, new PreviousRecord(74, true));
        Student student5 = new Student(3,"ganpati", 94.3, new PreviousRecord(30, false));

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5);

        // Students inc roll
//        Collections.sort(studentList, (x,y) -> {return (x.pr.mathMarks - y.pr.mathMarks);});

        // Using Comparable
         Collections.sort(studentList);

    /*    Collections.sort(studentList, new Comparator<Student>(){
            @Override
            public int compare(Student first, Student second) {
                if(first.pr.mathMarks > second.pr.mathMarks){
                    return -1;
                } else if(first.pr.mathMarks < second.pr.mathMarks){
                    return 1;
                } else{
                    return 0;
                }
            }
        });*/
       for(int i=0; i<studentList.size(); i++){
           System.out.println("Student name "+studentList.get(i).name+" "+"Student rollNumber "+ studentList.get(i).age+" "+"Student roll number "+studentList.get(i).rollNumber+" "+"Math marks "+studentList.get(i).pr.mathMarks);
       }
    }
}

class Student implements Comparable<Student> {
    int rollNumber;
    String name;

    PreviousRecord pr;
    double age;



    Student(int rollNumber, String name, double age, PreviousRecord pr){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.pr = pr;
    }

    @Override
    public int compareTo(Student other) {
        return this.pr.compareTo(other.pr);
    }
}

class PreviousRecord implements Comparable<PreviousRecord>{
    int mathMarks;
    Boolean result;

    public PreviousRecord(Integer mathMarks, Boolean result) {
        this.mathMarks = mathMarks;
        this.result = result;
    }

    @Override
    public int compareTo(PreviousRecord other) {
       return Integer.valueOf(this.mathMarks).compareTo(Integer.valueOf(other.mathMarks));
    }
}
