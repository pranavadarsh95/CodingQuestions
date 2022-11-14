package Oops;

// Must Read:- [VVVVVVI]
// https://www.infoworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html


import java.util.HashSet;

class Employee {

    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee employee = (Employee) obj;
        return employee.getAge() == this.getAge()
                && employee.getName() == this.getName();
    }

    // commented
//      @Override
//        public int hashCode() {
//            int result=17;
//            result=31*result+age;
//            result=31*result+(name!=null ? name.hashCode():0);
//            return result;
//        }

}


public class HashcodeAndEquals {
    public static void main(String[] args) {
        Employee employee = new Employee("rajeev", 24);
        Employee employee1 = new Employee("rajeev", 25);
        Employee employee2 = new Employee("rajeev", 24);

        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        System.out.println(employees.contains(employee2));
        System.out.println("employee.hashCode():  " + employee.hashCode()
                + "  employee2.hashCode():" + employee2.hashCode());
    }
}

//    Collections such as HashMap and HashSet use a hashcode value of an object to determine how it should be stored inside a collection,
//    and the hashcode is used again in order to locate the object in its collection.
//
//        Hashing retrieval is a two-step process:
//
//        Find the right bucket (using hashCode())
//        Search the bucket for the right element (using equals() )
//
//        Here is a small example on why we should overrride equals() and hashcode().
//
//        Consider an Employee class which has two fields: age and name.
//
//        Now can you see why if two objects are considered equal, their hashcodes must also be equal?
//        Otherwise, you'd never be able to find the object since the default hashcode method in class
//        Object virtually always comes up with a unique number for each object, even if the equals() method
//        is overridden in such a way that two or more objects are considered equal. It doesn't matter how equal
//        the objects are if their hashcodes don't reflect that. So one more time: If two objects are equal, their
//        hashcodes must be equal as well.