package Sorting.Comparator;

import java.util.*;

/*
    negative integer means (Second - First) (-1) « if first argument is less than the other
    zero             (0) « if both are equal
    positive integer means (first - second) (1) « if first greater than the second.
*/

public class ComparatorForUserDefinedClass {
    public static void main(String[] args) {
        ArrayList<User> usersInfo = new ArrayList<>();
        usersInfo.add(new User(5,"amitabh","Male"));
        usersInfo.add(new User(2,"aakash","FeMale"));
        usersInfo.add(new User(3,"pranav","Male"));
        usersInfo.add(new User(1,"banana","FeMale"));
        usersInfo.add(new User(4,"calibre","FeMale"));

        // Method - 1
//        Collections.sort(usersInfo, new Comparator<User>(){
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.userId - o2.userId;
//            }
//        });
        // Method - 1 OR
//        Collections.sort(usersInfo, (o1,o2) -> o1.userId - o2.userId);

        // Method - 2
        Collections.sort(usersInfo, (o1,o2) -> o1.name.compareTo(o2.name));

        // Method - 3
//        Collections.sort(usersInfo, (o1,o2) -> o1.gender.compareTo(o2.gender));

        showUsers(usersInfo);
    }

    private static void showUsers(ArrayList<User> userInfo) {
        Iterator<User> iterator = userInfo.iterator();

        while(iterator.hasNext()){
            User user = iterator.next();
            System.out.println(user.toString());
        }
    }
}

class User{
    int userId;
    String name;
    String gender;

    User(int userId, String name, String gender){
        this.userId = userId;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && Objects.equals(name, user.name) && Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, gender);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
